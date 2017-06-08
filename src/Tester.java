import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

/**
 * Created by Manish on 6/8/2017.
 */
public class Tester {
    public static void main(String[] args) {
        String[] stringArray = new String[100000000];
        System.out.println("Hang on ..populating array...");
        for (int i=0;i<10000000;i++) {
            System.out.println("Inserting \""+i+"\"...");
            stringArray[i] = String.valueOf(i);
        }
        String objectToFind = "9999999";
        long startTime = System.nanoTime();
        for (String string : stringArray) {
            if (objectToFind.equals(string)) {
                long endTime = System.nanoTime();
                System.out.println("Object \""+objectToFind+"\" found...");
                System.out.println("time using for loop--->"+(endTime-startTime)/100000);
            }
        }


        startTime=System.nanoTime();
        if (Arrays.asList(stringArray).contains(objectToFind)) {
            long endTime = System.nanoTime();
            System.out.println("Object \""+objectToFind+"\" found...");
            System.out.println("time using Arrays.asList--->"+(endTime-startTime)/100000);
        }

        startTime=System.nanoTime();
        if (ArrayUtils.contains(stringArray, objectToFind)) {
            long endTime = System.nanoTime();
            System.out.println("Object \""+objectToFind+"\" found...");
            System.out.println("time using ArrayUtils--->"+(endTime-startTime)/100000);
        }

    }
}
