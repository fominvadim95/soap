package ua.nure.client;

import ua.nure.entities.Player;
import ua.nure.entities.Team;

import java.util.List;


public interface SOAPClient {

    void update(Team team);

    void deleteTeam(String teamId);

    Team findTeam(String teamId);

    int getPlayersCount(String teamId);

    int getMaxPlayerCost(String teamId);

    Player findPlayer(String playerId);

    void deletePlayer(String playerId);

    List<Player> getPlayersByCountry(String country);

}
