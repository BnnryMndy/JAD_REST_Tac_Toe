package lav18.unidubna.jad_rest_tac_toe.dao;

import lav18.unidubna.jad_rest_tac_toe.model.Game;
import lav18.unidubna.jad_rest_tac_toe.model.Player;
import lav18.unidubna.jad_rest_tac_toe.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class GameDao {
    public Game findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Game.class, id);
    }

    public void save(Game game) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(game);
        tx1.commit();
        session.close();
    }

    public void update(Game game) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(game);
        tx1.commit();
        session.close();
    }

    public void delete(Game game) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(game);
        tx1.commit();
        session.close();
    }

    public List<Game> findAll() {
        List<Game> games = (List<Game>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Game").list();
        return games;
    }
}