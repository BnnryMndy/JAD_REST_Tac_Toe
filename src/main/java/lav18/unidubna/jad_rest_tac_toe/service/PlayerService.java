package lav18.unidubna.jad_rest_tac_toe.service;


import lav18.unidubna.jad_rest_tac_toe.model.Player;

import java.util.List;

public interface PlayerService {

    /**
     * Создает нового клиента
     * @param player - клиент для создания
     */
    void create(Player player);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<Player> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    Player read(int id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param client - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Player client, int id);

    boolean login(Player player);

    boolean Register(Player player);

    /**
     * Удаляет клиента с заданным ID
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);
}