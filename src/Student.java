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
        //        Last Name    First Name  ID
        //        Shakespeare  William     9732651 X
        //        Wilde        Oscar       3645679 X
        //        Woolf        Virginia    7187403 X
        //        Douglass     Frederick   9654412 X
        //        Roth         Phillip     5549364 X
        //        Cherryh      CJ          1207642 X
        //        Plath        Sylvia      3204661 X
        //        Hardy        Thomas      8335687 X
        //        Eliot        George      2562056 X
        //        Remarque     Eric        7475529 X
        //        Hardy        Godfrey     6213968 X
        //        Eliot        Thomas      4812743 X
        // initialize each element of the array students using the student data above

        students[0] = new Student("William", "Shakespeare", 9732651);
        students[1] = new Student("Oscar", "Wilde", 3645679);
        students[2] = new Student("Virginia", "Woolf", 7187403);
        students[3] = new Student("Frederick", "Douglass", 9654412);
        students[4] = new Student("Phillip", "Roth", 5549364);
        students[5] = new Student("CJ", "Cherryh", 1207642);
        students[6] = new Student("Sylvia", "Plath", 3204661);
        students[7] = new Student("Thomas", "Hardy", 8335687);
        students[8] = new Student("George", "Eliot", 2562056);
        students[9] = new Student("Eric", "Remarque", 7475529);
        students[10] = new Student("Godfrey", "Hardy", 6213968);
        students[11] = new Student("Thomas", "Eliot", 4812743);

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