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
    public JAXBElement<FindPlayerResponse> findPlayer(@RequestPayload JAXBElement<FindPlayerRequest> request) {
        String id = request.getValue().getPlayerId();
        FindPlayerResponse response = new FindPlayerResponse();
        response.setPlayer(playerService.find(id));
        return new JAXBElement<>(QName.valueOf(FIND_PLAYER_RESPONSE), FindPlayerResponse.class, response);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = DELETE_PLAYER_REQUEST)
    @Oneway
    public void deletePlayer(@RequestPayload JAXBElement<DeletePlayerRequest> request) {
        String id = request.getValue().getPlayerId();
        Player player = new Player();
        player.setId(id);
        playerService.delete(player);
    }

}
