package serialization;

import java.io.IOException;
import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1486565016546234L;

    private int id;
    transient private String name;
    private Address address;

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        final String outFormat = "Person id is %1d, name is %2s, address is %3s, %4s";
        return String.format(outFormat, id, name, address.getCity(), address.getStreet());
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        System.out.println("Writing object");
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("Reading object");
        in.defaultReadObject();
    }
}
