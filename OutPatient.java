package hospital;

public class OutPatient extends Patient {

    String date = "2026-05-01";

    public OutPatient(int id, String name) {
        super(id, name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Date: " + date);
    }
}