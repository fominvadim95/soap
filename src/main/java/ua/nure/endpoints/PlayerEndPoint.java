package ua.nure.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ua.nure.entities.*;
import ua.nure.services.PlayerService;

import javax.jws.Oneway;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import static ua.nure.utils.Constants.*;

@Endpoint
public class PlayerEndPoint {

    @Autowired
    private PlayerService playerService;

    public PlayerEndPoint() {
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = FIND_PLAYER_REQUEST)
    @ResponsePayload
    public FindPlayerResponse findPlayer(@RequestPayload FindPlayerRequest request) {
        String id = request.getPlayerId();
        FindPlayerResponse response = new FindPlayerResponse();
        response.setPlayer(playerService.find(id));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = DELETE_PLAYER_REQUEST)
    @Oneway
    public void deletePlayer(@RequestPayload DeletePlayerRequest request) {
        String id = request.getPlayerId();
        Player player = new Player();
        player.setId(id);
        playerService.delete(player);
    }


    @PayloadRoot(namespace = NAMESPACE, localPart = GET_PLAYERS_BY_COUNTRY_REQUEST)
    @ResponsePayload
    public GetPlayersByCountryResponse getPlayersByCountry(
            @RequestPayload GetPlayersByCountryRequest request) {
        String country = request.getCountry();
        GetPlayersByCountryResponse response = new GetPlayersByCountryResponse();
        response.getPlayer().addAll(playerService.getPlayersByCountry(country));
        return response;
    }

}
