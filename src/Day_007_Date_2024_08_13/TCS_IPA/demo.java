package Day_007_Date_2024_08_13.TCS_IPA;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        Player[] players= new Player[n]; //user defined
        System.out.println(players[0]);


//        players[0], players[1].... players[n-1];

    }
}


class Player{
    private int playerId;
    private String playerName;
    private int run;
    private String playerType;
    private String matchType;

    //this is a parameterized construtor
    Player(int playerId, String playerName, int run, String playerType, String matchType){
        this.playerId= playerId;
        this.playerName= playerName;
        this.run= run;
        this.playerType= playerType;
        this.matchType= matchType;
    };

    //setters
    public void setRun(int runs){
        this.run= runs;
    }

    public String getMatchType() {
        return matchType;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    //getters

    public String getPlayerType() {
        return playerType;
    }

    public int getRun() {
        return run;
    }
}
