/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vrishank
 */
public class Team {
    
    private String hTeam;
    private String aTeam;
    private int hScore;
    private int aScore;
    
    public Team(String homeTeam, String awayTeam, String homeScore, String awayScore) {
        this.hTeam = homeTeam;
        this.aTeam = awayTeam;
        this.hScore = Integer.valueOf(homeScore);
        this.aScore = Integer.valueOf(awayScore);          
    }
    
    public String getHomeTeam() {
        return this.hTeam;
    }
    
    public String getAwayTeam() {
        return this.aTeam;
    }
    
    public int getHomeScore() {
        return this.hScore;
    } 
    
    public int getAwayScore() {
        return this.aScore;
    }
}
