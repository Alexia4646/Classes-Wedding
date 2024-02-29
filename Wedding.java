import java.time.LocalDate;
//variables defined
public class Wedding {
    LocalDate Date;
    Couple Name;
    String Location;

    //constructor to set variables
    public Wedding(LocalDate Date, Couple Name, String Location){
        this.Date = Date;
        this.Name = Name;
        this.Location = Location;
    }

    //get methods so the variables can be retrieved when nedeed
    public LocalDate getDate() {
        return Date;
    }
    public Couple getName() {
        return Name;
    }
    public String getLocation() {
        return Location;
    }
}
