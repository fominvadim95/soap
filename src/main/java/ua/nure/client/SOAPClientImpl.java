package ua.nure.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import ua.nure.entities.*;

import java.util.List;

@Component
public class SOAPClientImpl implements SOAPClient {

    @Autowired
    private WebServiceTemplate template;

    public SOAPClientImpl() {
    }

    @Override
    public void update(Team team) {
        UpdateTeamRequest request = new UpdateTeamRequest();
        request.setTeam(team);
        template.marshalSendAndReceive(request);
    }

    @Override
    public void deleteTeam(String teamId) {
        DeleteTeamRequest request = new DeleteTeamRequest();
        request.setTeamId(teamId);
        template.marshalSendAndReceive(request);
    }

    @Override
    public Team findTeam(String teamId) {
        FindTeamRequest request = new FindTeamRequest();
        request.setTeamId(teamId);
        return ((FindTeamResponse) template.marshalSendAndReceive(request)).getTeam();
    }

    @Override
    public int getPlayersCount(String teamId) {
        GetPlayersCountRequest request = new GetPlayersCountRequest();
        request.setTeamId(teamId);
        return ((GetPlayersCountResponse) template.marshalSendAndReceive(request)).getCount();
    }

    @Override
    public int getMaxPlayerCost(String teamId) {
        GetMaxPlayerCostRequest request = new GetMaxPlayerCostRequest();
        request.setTeamId(teamId);
        return ((GetMaxPlayerCostResponse) template.marshalSendAndReceive(request)).getMaxCost();
    }

    @Override
    public Player findPlayer(String playerId) {
        FindPlayerRequest request = new FindPlayerRequest();
        request.setPlayerId(playerId);
        return ((FindPlayerResponse) template.marshalSendAndReceive(request)).getPlayer();
    }

    @Override
    public void deletePlayer(String playerId) {
        DeletePlayerRequest request = new DeletePlayerRequest();
        request.setPlayerId(playerId);
        template.marshalSendAndReceive(request);

    }

    @Override
    public List<Player> getPlayersByCountry(String country) {
        GetPlayersByCountryRequest request = new GetPlayersByCountryRequest();
        request.setCountry(country);
        return ((GetPlayersByCountryResponse) template.marshalSendAndReceive(request)).getPlayer();
    }
}
