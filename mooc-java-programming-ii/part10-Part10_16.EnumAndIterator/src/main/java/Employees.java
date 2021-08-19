import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach((person) -> {
            this.employees.add(person);
        });
    }
    
    public void print() {
        if(this.employees.isEmpty()) {
            System.out.println();
        }
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }
    
    public void print(Education education) {
        
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation().equals(education)) {
                System.out.println(next);
            }
        }        
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
} 