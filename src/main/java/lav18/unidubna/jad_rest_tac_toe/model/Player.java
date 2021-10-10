package lav18.unidubna.jad_rest_tac_toe.model;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String player_name;

    @Column
    private String hash_pass;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String client_name) {
        this.player_name = client_name;
    }

    public String getHash_pass() {
        return hash_pass;
    }

    public void setHash_pass(String email) {
        this.hash_pass = email;
    }
}