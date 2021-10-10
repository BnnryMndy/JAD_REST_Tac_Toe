package lav18.unidubna.jad_rest_tac_toe.service;

import lav18.unidubna.jad_rest_tac_toe.dao.PlayerDao;
import lav18.unidubna.jad_rest_tac_toe.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    PlayerDao playerDao = new PlayerDao();

    @Override
    public void create(Player player) {
        playerDao.save(player);
    }

    @Override
    public List<Player> readAll() {
        return playerDao.findAll();
    }

    @Override
    public Player read(int id) {
        return  playerDao.findById(id);
    }

    @Override
    public boolean update(Player player, int id) {
        if (playerDao.findById(id) == null) {
            playerDao.delete(player);
            player.setId(id);
            playerDao.save(player);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        playerDao.delete(playerDao.findById(id));

        return true;
    }

    @Override
    public boolean login(Player player) {

        List<Player> players = playerDao.findAll();
        for (Player pl : players) {
            if(player.getPlayer_name().equals(pl.getPlayer_name()))
                return player.getHash_pass().equals(pl.getHash_pass());
        }

        return false;
    }

    @Override
    public boolean Register(Player player) {
        List<Player> players = playerDao.findAll();
        for (Player pl : players) {
                if(player.getPlayer_name().equals(pl.getPlayer_name())) return false;
        }
        playerDao.save(player);

        return true;
    }
}
