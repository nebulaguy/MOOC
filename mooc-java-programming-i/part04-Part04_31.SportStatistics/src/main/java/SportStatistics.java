;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scanner.nextLine();
        
        System.out.println("Team: ");
        String teamName = scanner.nextLine();
        
        ArrayList<Team> teams = readRecordsFromFile(file);
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        for (Team team: teams) {
            if (team.getHomeTeam().contains(teamName)) {
                games++;
                
                if (team.getHomeScore() > team.getAwayScore()) {
                    wins++;
                } else if (team.getHomeScore() < team.getAwayScore()) {
                    losses++;
                }
            }
            if (team.getAwayTeam().contains(teamName)) {
                games++;
                
                if (team.getAwayScore() > team.getHomeScore()) {
                    wins++;
                } else if (team.getAwayScore() < team.getHomeScore()) {
                    losses++;
                }
                
            }
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }
    
    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
            
                String[] parts = row.split(",");

                teams.add(new Team(parts[0], parts[1], parts[2], parts[3])); 
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return teams;
    }
}
