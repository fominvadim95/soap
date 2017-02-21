package ua.nure.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.nure.dao.TeamDao;
import ua.nure.entities.Team;
import ua.nure.entities.Teams;
import ua.nure.services.TeamService;
import ua.nure.utils.EntityCreator;

import javax.annotation.PostConstruct;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    public TeamServiceImpl() {
    }

    @Override
    public void update(Team team) {
        teamDao.update(team);

    }

    @Override
    public void delete(Team team) {
        teamDao.delete(team);

    }

    @Override
    public Team find(String id) {
        return teamDao.find(id);
    }

    @Override
    public int getPlayersCount(Team team) {
        return teamDao.getPlayersCount(team);
    }
}
