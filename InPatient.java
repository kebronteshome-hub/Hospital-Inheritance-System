package hospital;

public class InPatient extends Patient {

    int room = 101;

    public InPatient(int id, String name) {
        super(id, name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Room: " + room);
    }
}