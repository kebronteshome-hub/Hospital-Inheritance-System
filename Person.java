package hospital;

public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void info() {
        System.out.println("Person info");
    }

    final void role() {
        System.out.println("Hospital Person");
    }
}
