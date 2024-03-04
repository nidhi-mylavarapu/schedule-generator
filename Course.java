import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<String> timeSlots;
    private ArrayList<String> offeredSemesters;
    private ArrayList<Requirement> requirements;
    private int credits;

    public Course() {
    }

    public Course(String name, int credits, ArrayList<String> timeSlots, ArrayList<String> offeredSemesters, ArrayList<Requirement> requirements) {
        this.name = name;
        this.credits = credits;
        this.timeSlots = timeSlots;
        this.offeredSemesters = offeredSemesters;
        this.requirements = requirements;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getTimeSlots() {
        return timeSlots;
    }

    public ArrayList<String> getOfferedSemesters() {
        return offeredSemesters;
    }

    public ArrayList<Requirement> getRequirements() {
        return requirements;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeSlots(ArrayList<String> timeSlots) {
        this.timeSlots = timeSlots;
    }

    public void setOfferedSemesters(ArrayList<String> offeredSemesters) {
        this.offeredSemesters = offeredSemesters;
    }

    public void setRequirements(ArrayList<Requirement> requirements) {
        this.requirements = requirements;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String toString(){
        return(this.name + ": \n" + 
        "------------------- \n" + 
        this.credits + " credits \n"
        );
    }
}
