package ua.nure.services;


import ua.nure.entities.Team;
import ua.nure.entities.Teams;

public interface TeamService {

    void update(Team team);

    void delete(Team team);

    Team find(String id);

    int getPlayersCount(Team team);

}
