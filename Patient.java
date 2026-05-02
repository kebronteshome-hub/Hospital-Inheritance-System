package hospital;

public class Patient extends Person {

    public Patient(int id, String name) {
        super(id, name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Patient type");
    }

    public static void info() {
        System.out.println("Patient info");
    }
}