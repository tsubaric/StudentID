import java.util.Arrays;

public class Student {
    private String firstName, lastName;
    private int id;
    // more things here
    public Student(String first, String last, int id) {
        firstName = first; lastName = last; this.id = id;
    }

    public String firstName() { return firstName; }
    public String lastName()  { return lastName; }
    public int    id()        { return id; }
    public String toString() {
        return lastName() + ", " + firstName() + " ID: " + id();
    }

    public static void main(String[] args) {
        Student[] students = new Student[12];
        // STUDENT DATA (you can also find it on ICON):
        //        Shakespeare, William ID: 9732651
        //        Wilde, Oscar ID: 3645679
        //        Woolf, Virginia ID: 7187403
        //        Douglass, Frederick ID: 9654412
        //        Roth, Phillip ID: 5549364
        //        Cherryh, CJ ID: 1207642
        //        Plath, Sylvia ID: 3204661
        //        Hardy, Thomas ID: 8335687
        //        Eliot, George ID: 2562056
        //        Remarque, Eric ID: 7475529
        //        Hardy, Godfrey ID: 6213968
        //        Eliot, Thomas ID: 4812743
        // for each of the student data above, instantiate Student object below
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