public class Student {

    static long counter;
    private long id;

    public Student() {
        counter++;
        id = counter;
    }

    public long getId() {

        return id;
    }
}
