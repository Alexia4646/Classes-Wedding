import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // allows the user to input information
        System.out.println("Enter bride's first name: ");
        String brideFn = sc.nextLine();
        System.out.println("Enter bride's last name: ");
        String brideLn = sc.nextLine();
        System.out.println("Enter groom's first name: ");
        String groomFn = sc.nextLine();
        System.out.println("Enter groom's last name: ");
        String groomLn = sc.nextLine();
        System.out.println("Enter maid of honor's first name: ");
        String maidofhonorFn = sc.nextLine();
        System.out.println("Enter maid of honor's last name: ");
        String maidofhonorLn = sc.nextLine();
        System.out.println("Enter best man's first name: ");
        String bestmanFn = sc.nextLine();
        System.out.println("Enter best man's last name: ");
        String bestmanLn = sc.nextLine();

    //creates person objects for each of the individuals
        Person Bride = new Person(brideFn, brideLn);
        Person Groom = new Person(groomFn, groomLn);
        Person MaidofHonor = new Person(maidofhonorFn, maidofhonorLn);
        Person BestMan = new Person(bestmanFn, bestmanLn);
    //creates couple objects for these individuals that hold references to the person
        Couple Name = new Couple(Bride, Groom, MaidofHonor, BestMan);

        System.out.println("When is the wedding? (Use the format YYYY-MM-DD): ");
        String weddingDate = sc.nextLine();
        LocalDate Date = LocalDate.parse(weddingDate);

        System.out.println("Where is the wedding being held?: ");
        String Location = sc.nextLine();

        Wedding wedding = new Wedding(Date, Name, Location);

        System.out.println("You are hereby invited to the marriage between: ");
        System.out.println("Bride: " + wedding.getName().getBride().getFn() + " " +
                wedding.getName().getBride().getLn());
        System.out.println("Groom: " + wedding.getName().getGroom().getFn() + " " +
                wedding.getName().getGroom().getLn());
        System.out.println("Their best friends are: ");
        System.out.println("Maid of Honor: " + wedding.getName().getMaidofHonor().getFn() + " " +
                wedding.getName().getMaidofHonor().getLn());
        System.out.println("Best Man: " + wedding.getName().getBestMan().getFn() + " " +
                wedding.getName().getBestMan().getLn());
        System.out.println("Wedding Date: " + wedding.getDate());
        System.out.println("Location: " + wedding.getLocation());



    }
}
