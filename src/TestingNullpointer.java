import java.util.Vector;

/**
 * Created by Manish on 6/16/2017.
 */
public class TestingNullpointer {

    private static Vector<String> sourcesWithObjectRef =new Vector<>();
    public static void main(String[] args) {
        for (String entry :
                sourcesWithObjectRef) {
            try {
                throw new RuntimeException("Custom runtime exception");
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("Custom runtime exception occured");
            }
            finally {
                System.out.println("hey.....");
            }
//            System.out.println("no exception..hurray");
        }
    }
}
