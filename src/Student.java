import java.util.Arrays;

public class Student {
    private String firstName, lastName;
    private int id;
    public Student(String first, String last, int id) {
        firstName = first; lastName = last; this.id = id;
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public int    getID()        { return id; }
    public String toString() {
        return getLastName() + ", " + getFirstName() + " ID: " + getID();
    }

    public static void main(String[] args) {
        Student[] students = new Student[12];

        // STUDENT DATA (you can also find it on ICON):
        //
        //        Last Name    First Name  ID
        //        Shakespeare  William     9732651
        //        Wilde        Oscar       3645679
        //        Woolf        Virginia    7187403
        //        Douglass     Frederick   9654412
        //        Roth         Phillip     5549364
        //        Cherryh      CJ          1207642
        //        Plath        Sylvia      3204661
        //        Hardy        Thomas      8335687
        //        Eliot        George      2562056
        //        Remarque     Eric        7475529
        //        Hardy        Godfrey     6213968
        //        Eliot        Thomas      4812743
        //
        // initialize each element of the array students using the student data above
        <YOUR CODE HERE>

        System.out.println("Unordered");
        for ( Student s : students )
            System.out.println(s);
        System.out.println("=========================");
        System.out.println("Ordered by name");
        Arrays.sort(students,new StudentsByName());
        for ( Student s : students )
            System.out.println(s);
        System.out.println("=========================");
        System.out.println("Ordered by id");

        Arrays.sort(students,new StudentsByID());
        for ( Student s : students )
            System.out.println(s);
    }
}