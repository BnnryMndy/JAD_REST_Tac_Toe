package lav18.unidubna.jad_rest_tac_toe.service;

import lav18.unidubna.jad_rest_tac_toe.dao.GameDao;
import lav18.unidubna.jad_rest_tac_toe.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService{
    GameDao gameDao = new GameDao();

    @Override
    public void create(Game game) {
        gameDao.save(game);
    }

    @Override
    public List<Game> readAll() {
        return gameDao.findAll();
    }

    @Override
    public Game read(String game_name) {
        List<Game> games = gameDao.findAll();

        for (Game gam: games) {
            if(gam.getGame_name() != null && gam.getGame_name().equals(game_name)){
                return gam;
            }
        }
        return null;
    }



    @Override
    public boolean update(Game game, String name) {
        List<Game> games = gameDao.findAll();

        for (Game gam: games) {
            if(gam.getGame_name() != null && gam.getGame_name().equals(name)){
                gameDao.delete(gam);
                if(game.getField() != null) gam.setField(game.getField());
                if(game.getP1_id() != null) gam.setP1_id(game.getP1_id());
                if(game.getP1_status() != null) gam.setP1_status(game.getP1_status());
                if(game.getP2_id() != null) gam.setP2_id(game.getP2_id());
                if(game.getP2_status() != null) gam.setP2_status(game.getP2_status());
                gameDao.save(gam);
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean UpdateField(Game game) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        gameDao.delete(gameDao.findById(id));
        return true;
    }
}
