package ua.nure.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.nure.dao.TeamDao;
import ua.nure.entities.Team;
import ua.nure.entities.Teams;
import ua.nure.utils.EntityCreator;

import javax.annotation.PostConstruct;

@Repository
public class TeamDaoImpl implements TeamDao {

    @Autowired
    private EntityCreator entityCreator;

    private Teams teams = new Teams();

    public TeamDaoImpl() {
    }

    @PostConstruct
    public void init() {
        teams = entityCreator.createTeams();
    }


    @Override
    public void update(Team team) {
        int index = getIndex(team);
        if (index != -1) {
            teams.getTeam().set(index, team);
        }
    }

    @Override
    public void delete(Team team) {
        int index = getIndex(team);
        teams.getTeam().remove(index);
    }

    @Override
    public Team find(String id) {
        for (Team team : teams.getTeam()) {
            if (team.getId().equals(id)) {
                return team;
            }
        }
        return new Team();
    }

    @Override
    public int getPlayersCount(Team team) {
        return team.getPlayers().getPlayer().size();
    }

    private int getIndex(Team team) {
        int index = -1;
        for (int i = 0; i < teams.getTeam().size(); i++) {
            if (teams.getTeam().get(i).getId().equals(team.getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

}
