package hospital;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1, "John");
        Patient p2 = new Patient(2, "Sara");
        InPatient p3 = new InPatient(3, "David");
        OutPatient p4 = new OutPatient(4, "Lily");

        Hospital h = new Hospital();

        h.display(p1);
        h.display(p2);
        h.display(p3);
        h.display(p4);

        // static method hiding
        Person.info();
        Patient.info();

        // final method
        p1.role();
    }
}