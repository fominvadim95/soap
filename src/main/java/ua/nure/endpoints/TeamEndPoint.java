package ua.nure.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ua.nure.entities.*;
import ua.nure.services.TeamService;

import javax.jws.Oneway;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import static ua.nure.utils.Constants.*;

@Endpoint
public class TeamEndPoint {

    @Autowired
    private TeamService teamService;

    public TeamEndPoint() {
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = UPDATE_TEAM_REQUEST)
    @Oneway
    public void updateTeam(@RequestPayload UpdateTeamRequest request) {
        Team team = request.getTeam();
        teamService.update(team);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = DELETE_TEAM_REQUEST)
    @Oneway
    public void deleteTeam(@RequestPayload DeleteTeamRequest request) {
        String id = request.getTeamId();
        Team team = new Team();
        team.setId(id);
        teamService.delete(team);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = FIND_TEAM_REQUEST)
    @ResponsePayload
    public FindTeamResponse findTeam(@RequestPayload FindTeamRequest request) {
        String id = request.getTeamId();
        FindTeamResponse response = new FindTeamResponse();
        response.setTeam(teamService.find(id));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = GET_PLAYERS_COUNT_REQUEST)
    @ResponsePayload
    public GetPlayersCountResponse getPlayersCount(@RequestPayload GetPlayersCountRequest request) {
        String id = request.getTeamId();
        GetPlayersCountResponse response = new GetPlayersCountResponse();
        Team team = teamService.find(id);
        response.setCount(teamService.getPlayersCount(team));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = GET_MAX_PLAYER_COST_REQUEST)
    @ResponsePayload
    public GetMaxPlayerCostResponse getMaxPlayerCost(@RequestPayload GetMaxPlayerCostRequest request) {
        String id = request.getTeamId();
        GetMaxPlayerCostResponse response = new GetMaxPlayerCostResponse();
        response.setMaxCost(teamService.getMaxPlayerCost(id));
        return response;
    }

}
