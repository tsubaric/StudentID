import java.util.Comparator;

public class StudentsByName implements Comparator<Student> {
    int comparisonVal = 0;
    public int compare(Student s1, Student s2) {
        comparisonVal = s1.getLastName().compareTo(s2.getLastName());
        if (comparisonVal == 0) {
            comparisonVal = s1.getFirstName().compareTo(s2.getFirstName());
        }
        return comparisonVal;
    }

        //     sort by the last name alphabetically, and if there is a tie,
        //     then continue sorting by the first name
}
