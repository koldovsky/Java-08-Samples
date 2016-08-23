package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Reading objects");
        try (FileInputStream fi = new FileInputStream("people.bin")) {
            try(ObjectInputStream os = new ObjectInputStream(fi)) {
                Person person1 = (Person)os.readObject();
                Person person2 = (Person)os.readObject();
                System.out.println(person1);
                System.out.println(person2);
            }
        }
    }
}
