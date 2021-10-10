package lav18.unidubna.jad_rest_tac_toe.model;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer game_id;

    @Column
    private Integer p1_id;

    @Column
    private Integer p2_id;

    @Column
    private String p1_status;

    @Column
    private String p2_status;

    @Column
    private String field;

    @Column
    private String game_name;

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public Integer getP1_id() {
        return p1_id;
    }

    public void setP1_id(Integer p1_id) {
        this.p1_id = p1_id;
    }

    public Integer getP2_id() {
        return p2_id;
    }

    public void setP2_id(Integer p2_id) {
        this.p2_id = p2_id;
    }

    public String getP1_status() {
        return p1_status;
    }

    public void setP1_status(String p1_status) {
        this.p1_status = p1_status;
    }

    public String getP2_status() {
        return p2_status;
    }

    public void setP2_status(String p2_status) {
        this.p2_status = p2_status;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
