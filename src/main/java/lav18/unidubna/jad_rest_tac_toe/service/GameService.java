package lav18.unidubna.jad_rest_tac_toe.service;

import lav18.unidubna.jad_rest_tac_toe.model.Game;

import java.util.List;

public interface GameService {

    void create(Game game);

    List<Game> readAll();

    Game read(String game_name);

    boolean update(Game game, String id);

    boolean UpdateField(Game game);

    boolean delete(int id);
}
