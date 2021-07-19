import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
  
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        int r = (int)(Math.random() * this.jokes.size());
        String randomJoke = this.jokes.get(r);
        return randomJoke;
    }
    
    public void printJokes() {
        for(String joke: jokes) {
            System.out.println(joke);
        }
    }
}
