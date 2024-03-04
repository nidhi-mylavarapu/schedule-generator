import java.util.ArrayList;

public class Request {
    private ArrayList<Course> classes;
    private ArrayList<Requirement> requirements;
    private int creditLimit;
    private String semester;

    public Request() {
        this.classes = new ArrayList<>();
        this.requirements = new ArrayList<>();
    }

    public Request(ArrayList<Course> classes, ArrayList<Requirement> requirements, int creditLimit, String semester) {
        this.classes = classes;
        this.requirements = requirements;
        this.creditLimit = creditLimit;
        this.semester = semester;
    }

    public ArrayList<Course> getClasses() {
        return classes;
    }

    public ArrayList<Requirement> getRequirements() {
        return requirements;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getSemester() {
        return semester;
    }

    public void setClasses(ArrayList<Course> classes) {
        this.classes = classes;
    }

    public void setRequirements(ArrayList<Requirement> requirements) {
        this.requirements = requirements;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void addCourse(Course course) {
        this.classes.add(course);
    }

    public void addRequirement(Requirement requirement) {
        this.requirements.add(requirement);
    }
}
