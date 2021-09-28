import java.util.Comparator;

public class StudentsByID implements Comparator<Student> {
    int comparisonVal = 0;
    public int compare(Student s1, Student s2) {
        comparisonVal = Integer.compare(s1.getID(), s2.getID());
        return comparisonVal;
    }
}

