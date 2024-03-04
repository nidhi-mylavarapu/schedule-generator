import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ScheduleGenerator {

    public static void generateSchedule(Request request) {
        String semester = request.getSemester();
        int creditLimit = request.getCreditLimit();
        ArrayList<Course> classes = request.getClasses();
        ArrayList<Requirement> requirements = request.getRequirements();

        // map to store courses by time slot
        Map<String, ArrayList<Course>> schedule = new HashMap<>();

        // map to store requirements fulfilled by each course
        Map<Course, ArrayList<Requirement>> fulfilledRequirements = new HashMap<>();

        // randomly shuffle the list of available courses
        Collections.shuffle(classes);

        // total number of credits in the schedule
        int totalCredits = 0;

        // iterate through all courses in request
        for (Course course : classes) {
            // check if course is offered in requested semester
            if (course.getOfferedSemesters().contains(semester)) {
                // (attempt) to fill out all available time slots
                for (String timeSlot : course.getTimeSlots()) {
                    // check if time slot is occupied
                    if (!isTimeSlotOccupied(schedule, timeSlot)) {
                        // make sure credit limit is not exceeded
                        if (creditLimit - course.getCredits() >= 0) {
                            // add course to schedule
                            addToSchedule(schedule, course, timeSlot);
                            // reduce remaining credit limit
                            creditLimit -= course.getCredits();
                            // add to totalCredits for generated schedule
                            totalCredits += course.getCredits();
                            // store requirements fulfilled by course
                            fulfilledRequirements.put(course, course.getRequirements());
                        }
                    }
                }
            }
        }

        // print generated schedule
        System.out.println("************************");
        System.out.println("Generated Schedule for " + semester + ":");
        for (Map.Entry<String, ArrayList<Course>> entry : schedule.entrySet()) {
            System.out.println("Time Slot: " + entry.getKey());
            for (Course course : entry.getValue()) {
                System.out.println("- " + course.getName() + " (" + getFulfilledRequirements(course, fulfilledRequirements) + ", " + course.getCredits() + " credits)");
            }
        }
        System.out.println();

        // print total number of credits
        System.out.println("Total Credits in the Schedule: " + totalCredits);
    }

    private static boolean isTimeSlotOccupied(Map<String, ArrayList<Course>> schedule, String timeSlot) {
        return schedule.containsKey(timeSlot);
    }

    private static void addToSchedule(Map<String, ArrayList<Course>> schedule, Course course, String timeSlot) {
        schedule.computeIfAbsent(timeSlot, k -> new ArrayList<>()).add(course);
    }

    private static String getFulfilledRequirements(Course course, Map<Course, ArrayList<Requirement>> fulfilledRequirements) {
        StringBuilder requirementsString = new StringBuilder();
        if (fulfilledRequirements.containsKey(course)) {
            ArrayList<Requirement> fulfilledReqs = fulfilledRequirements.get(course);
            for (Requirement req : fulfilledReqs) {
                requirementsString.append(req.getType()).append(", ");
            }
            
            requirementsString.setLength(requirementsString.length() - 2);
        }
        return requirementsString.toString();
    }
}
