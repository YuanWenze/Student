import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
        private String studentID;
        private String studentName;
        private List<String> ExtraActivities;

public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.ExtraActivities = new ArrayList<>(numExtraActivities);
    }

public void addExtraActivity() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ExtraActivities.size(); i++) {
            System.out.println("Enter extra activity #" + (i + 1) + ":");
            String activity = scanner.nextLine();
            ExtraActivities.set(i, activity);
        }
    }
public String toString() {
        return "Student ID: " + studentID + ", Name: " + studentName + ", Extra Activities: " + ExtraActivities;
    }
public String getStudentID() {
        return studentID;
    }

public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

public String getStudentName() {
        return studentName;
    }

public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

public List<String> getExtraActivities() {
        return ExtraActivities;
    }

public void setExtraActivities(List<String> extraActivities) {
        this.ExtraActivities = extraActivities;
    }

}
