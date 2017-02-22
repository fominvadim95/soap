package ua.nure.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.nure.dao.PlayerDao;
import ua.nure.dao.TeamDao;
import ua.nure.entities.Player;
import ua.nure.entities.Team;
import ua.nure.services.PlayerService;

public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public PlayerServiceImpl() {
    }

    @Override
    public Player find(String id) {
        return playerDao.find(id);
    }

    @Override
    public void delete(Player player) {
        playerDao.delete(player);
    }
}
