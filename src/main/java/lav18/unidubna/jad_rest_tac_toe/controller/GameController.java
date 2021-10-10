package lav18.unidubna.jad_rest_tac_toe.controller;

import lav18.unidubna.jad_rest_tac_toe.model.Game;
import lav18.unidubna.jad_rest_tac_toe.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping(value = "/createLobby")
    public ResponseEntity<?> create(@RequestBody Game game) {
        gameService.create(game);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/games")
    public ResponseEntity<List<Game>> read() {
        final List<Game> games = gameService.readAll();

        return games != null && !games.isEmpty()
                ? new ResponseEntity<>(games, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/game/{id}")
    public ResponseEntity<Game> read(@PathVariable(name = "id") String id) {
        final Game game = gameService.read(id);

        return game != null
                ? new ResponseEntity<>(game, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/game/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") String id, @RequestBody Game game) {
        final boolean updated = gameService.update(game, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
