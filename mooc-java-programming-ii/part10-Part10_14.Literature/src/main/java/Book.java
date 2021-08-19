
public class Book {
    private String name;
    private int ageRec;
    
    public Book(String name, int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }
    
    public int getAge() {
        return this.ageRec;
    }
    
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.name + "(recommended for "+ this.ageRec +" year-olds or older)";
    }
}