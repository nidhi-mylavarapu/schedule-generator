import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        // Create some requirements

        // TECH ELECTIVE
        Requirement techElective = new Requirement("Technical Elective");

        // ENGRD 
        Requirement engrdReq = new Requirement("ENGRD Requirement");

        // PROBABILITY
        Requirement probabilityReq = new Requirement("Probability Requirement");

        // CORE CLASS
        Requirement coreClass = new Requirement("Core Class");

        // Create some courses

        // CS1110
        ArrayList<String> timeSlotsCS1110 = new ArrayList<>();
        timeSlotsCS1110.add("Time Slot 1");
        ArrayList<String> offeredSemestersCS1110 = new ArrayList<>();
        offeredSemestersCS1110.add("Fall");
        offeredSemestersCS1110.add("Spring");
        ArrayList<Requirement> requirementsCS1110 = new ArrayList<>();
        requirementsCS1110.add(coreClass);
        requirementsCS1110.add(techElective);
        Course cs1110 = new Course("CS1110", 3, timeSlotsCS1110, offeredSemestersCS1110, requirementsCS1110);
        // System.out.println(cs1110);

        // ORIE3300
        ArrayList<String> timeSlotsORIE3300 = new ArrayList<>();
        timeSlotsORIE3300.add("Time Slot 1");
        ArrayList<String> offeredSemestersORIE3300 = new ArrayList<>();
        offeredSemestersORIE3300.add("Fall");
        offeredSemestersORIE3300.add("Spring");
        ArrayList<Requirement> requirementsORIE3300 = new ArrayList<>();
        requirementsORIE3300.add(coreClass);
        requirementsORIE3300.add(techElective);
        Course orie3300 = new Course("ORIE3300", 4, timeSlotsORIE3300, offeredSemestersORIE3300, requirementsORIE3300);
        // System.out.println(orie3300);

        // INFO4430
        ArrayList<String> timeSlotsINFO4430 = new ArrayList<>();
        timeSlotsINFO4430.add("Time Slot 1");
        timeSlotsINFO4430.add("Time Slot 2");
        ArrayList<String> offeredSemestersINFO4430 = new ArrayList<>();
        offeredSemestersINFO4430.add("Fall");
        ArrayList<Requirement> requirementsINFO4430 = new ArrayList<>();
        requirementsINFO4430.add(techElective);
        Course info4430 = new Course("INFO4430", 3, timeSlotsINFO4430, offeredSemestersINFO4430, requirementsINFO4430);
        // System.out.println(info4430);

        // ENGRD2700
        ArrayList<String> timeSlotsENGRD2700 = new ArrayList<>();
        timeSlotsENGRD2700.add("Time Slot 2");
        ArrayList<String> offeredSemestersENGRD2700 = new ArrayList<>();
        offeredSemestersENGRD2700.add("Fall");
        offeredSemestersENGRD2700.add("Spring");
        ArrayList<Requirement> requirementsENGRD2700 = new ArrayList<>();
        requirementsENGRD2700.add(engrdReq);
        requirementsENGRD2700.add(probabilityReq);
        Course engrd2700 = new Course("ENGRD2700", 3, timeSlotsENGRD2700, offeredSemestersENGRD2700, requirementsENGRD2700);
        // System.out.println(engrd2700);

        // Additional Courses (Make-believe examples)
        ArrayList<String> timeSlotsAdditional1 = new ArrayList<>();
        timeSlotsAdditional1.add("Time Slot 1");
        ArrayList<String> offeredSemestersAdditional1 = new ArrayList<>();
        offeredSemestersAdditional1.add("Fall");
        offeredSemestersAdditional1.add("Spring");
        ArrayList<Requirement> requirementsAdditional1 = new ArrayList<>();
        requirementsAdditional1.add(coreClass);
        Course additionalCourse1 = new Course("XYZ123", 3, timeSlotsAdditional1, offeredSemestersAdditional1, requirementsAdditional1);
        // System.out.println(additionalCourse1);

        ArrayList<String> timeSlotsAdditional2 = new ArrayList<>();
        timeSlotsAdditional2.add("Time Slot 2");
        ArrayList<String> offeredSemestersAdditional2 = new ArrayList<>();
        offeredSemestersAdditional2.add("Spring");
        ArrayList<Requirement> requirementsAdditional2 = new ArrayList<>();
        requirementsAdditional2.add(techElective);
        Course additionalCourse2 = new Course("ABC456", 4, timeSlotsAdditional2, offeredSemestersAdditional2, requirementsAdditional2);
        // System.out.println(additionalCourse2);

        ArrayList<String> timeSlotsRandom1 = new ArrayList<>();
        timeSlotsRandom1.add("Time Slot 3");
        ArrayList<String> offeredSemestersRandom1 = new ArrayList<>();
        offeredSemestersRandom1.add("Fall");
        offeredSemestersRandom1.add("Spring");
        ArrayList<Requirement> requirementsRandom1 = new ArrayList<>();
        requirementsRandom1.add(techElective);
        Course randomCourse1 = new Course("XYZ789", 3, timeSlotsRandom1, offeredSemestersRandom1, requirementsRandom1);
        // System.out.println(randomCourse1);

        ArrayList<String> timeSlotsRandom2 = new ArrayList<>();
        timeSlotsRandom2.add("Time Slot 2");
        ArrayList<String> offeredSemestersRandom2 = new ArrayList<>();
        offeredSemestersRandom2.add("Spring");
        ArrayList<Requirement> requirementsRandom2 = new ArrayList<>();
        requirementsRandom2.add(coreClass);
        requirementsRandom2.add(probabilityReq);
        Course randomCourse2 = new Course("DEF321", 4, timeSlotsRandom2, offeredSemestersRandom2, requirementsRandom2);
        // System.out.println(randomCourse2);

        ArrayList<String> timeSlotsRandom3 = new ArrayList<>();
        timeSlotsRandom3.add("Time Slot 1");
        timeSlotsRandom3.add("Time Slot 3");
        ArrayList<String> offeredSemestersRandom3 = new ArrayList<>();
        offeredSemestersRandom3.add("Fall");
        ArrayList<Requirement> requirementsRandom3 = new ArrayList<>();
        requirementsRandom3.add(engrdReq);
        requirementsRandom3.add(techElective);
        Course randomCourse3 = new Course("PQR987", 3, timeSlotsRandom3, offeredSemestersRandom3, requirementsRandom3);
        // System.out.println(randomCourse3);

        ArrayList<String> timeSlotsRandom4 = new ArrayList<>();
        timeSlotsRandom4.add("Time Slot 3");
        ArrayList<String> offeredSemestersRandom4 = new ArrayList<>();
        offeredSemestersRandom4.add("Spring");
        ArrayList<Requirement> requirementsRandom4 = new ArrayList<>();
        requirementsRandom4.add(techElective);
        Course randomCourse4 = new Course("LMN654", 4, timeSlotsRandom4, offeredSemestersRandom4, requirementsRandom4);
        // System.out.println(randomCourse4);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(cs1110);
        courses.add(orie3300);
        courses.add(info4430);
        courses.add(engrd2700);
        courses.add(additionalCourse1);
        courses.add(additionalCourse2);
        courses.add(randomCourse1);
        courses.add(randomCourse2);
        courses.add(randomCourse3);
        courses.add(randomCourse4);

        ArrayList<Requirement> requirements = new ArrayList<>();
        requirements.add(techElective);
        requirements.add(coreClass);
        requirements.add(probabilityReq);

        // create request
        Request interestingRequest = new Request(courses, requirements, 9, "Fall");

        // generate schedule with request
        ScheduleGenerator.generateSchedule(interestingRequest);
    }
}
