import java.io.FileNotFoundException;

public class Person {
    //first and last name variables
    String Fn;
    String Ln;

    //constructor to set the first and last names
    public Person(String Fn, String Ln) {
        this.Fn = Fn;
        this.Ln = Ln;
    }

    //get methods for first and last name so they can be retrieved
    public String getFn(){
        return Fn;
    }

    public String getLn(){
        return Ln;
    }
}