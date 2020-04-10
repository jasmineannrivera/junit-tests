import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetStudentId() {
        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();

        assertEquals(1, studentOne.getId());
    }
}
