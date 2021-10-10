package lav18.unidubna.jad_rest_tac_toe.dao;



import lav18.unidubna.jad_rest_tac_toe.model.Player;
import lav18.unidubna.jad_rest_tac_toe.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PlayerDao {
    public Player findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Player.class, id);
    }

    public void save(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(player);
        tx1.commit();
        session.close();
    }

    public void update(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(player);
        tx1.commit();
        session.close();
    }

    public void delete(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(player);
        tx1.commit();
        session.close();
    }


    public List<Player> findAll() {
        List<Player> players = (List<Player>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Player").list();
        return players;
    }
}
