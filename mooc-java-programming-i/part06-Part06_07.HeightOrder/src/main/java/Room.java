import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person returnHeight = this.persons.get(0);
        
        for (Person person: this.persons) {
            if(person.getHeight() < returnHeight.getHeight()) {
                returnHeight = person;
            }
        }
        return returnHeight;
    }
    
    public Person take() {
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
}
