package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person mike = new Person(543, "Mike", new Address("London", "Baker Street"));
        Person sue = new Person(123, "Sue", new Address("New York", "Wall Street"));

        System.out.println(mike);
        System.out.println(sue);

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {
            try (ObjectOutputStream os = new ObjectOutputStream(fs)) {
                os.writeObject(mike);
                os.writeObject(sue);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
