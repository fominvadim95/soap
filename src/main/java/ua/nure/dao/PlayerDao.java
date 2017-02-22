package ua.nure.dao;

import ua.nure.entities.Player;

public interface PlayerDao {

    Player find(String id);

    void delete(Player player);

}
