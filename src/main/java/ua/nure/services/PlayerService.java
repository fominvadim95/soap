package ua.nure.services;

import ua.nure.entities.Player;
public interface PlayerService {

    Player find(String id);

    void delete(Player player);

}
