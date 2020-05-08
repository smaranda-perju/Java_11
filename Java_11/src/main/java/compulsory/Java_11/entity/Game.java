package compulsory.Java_11.entity;

import java.util.Date;

/**
 * @Game (pentru partea Compulsory nu este necesara, asa ca nu este neaparat completa)
 * retine doi jucatori (prin intermediul id-ului) si data curenta
 */
public class Game {
    private long playerId1;
    private long playerId2;
    private Date data;

    public void setPlayerId1(long playerId1) {
        this.playerId1 = playerId1;
    }

    public void setPlayerId2(long playerId2) {
        this.playerId2 = playerId2;
    }

    public long getPlayerId1() {
        return playerId1;
    }

    public long getPlayerId2() {
        return playerId2;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
