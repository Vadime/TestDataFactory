package de.novi.individual.contactmethod;

public abstract class ContactMethod {

    String data;

    public ContactMethod setData(String data) {
        this.data = data;
        return this;
    };

    @Override
    public String toString() {
        return "ContactMethod: {\n\tmethod: " + data + ",\n}";
    }

}
