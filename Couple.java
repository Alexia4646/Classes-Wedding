public class Couple {
    Person Bride;
    Person Groom;

    Person MaidofHonor;
    Person BestMan;

    //constructor to set these variables
    public Couple(Person Bride, Person Groom, Person MaidofHonor, Person BestMan) {
        this.Bride = Bride;
        this.Groom = Groom;
        this.MaidofHonor = MaidofHonor;
        this.BestMan = BestMan;
    }
// get methods for these to be retrieved later
    public Person getBride(){
        return Bride;
    }
    public Person getGroom(){
        return Groom;
    }

    public Person getMaidofHonor(){
        return MaidofHonor;
    }

    public Person getBestMan(){
        return BestMan;
    }
}
