package de.novi.individual;

import java.util.List;

import de.novi.individual.contactmethod.ContactMethod;

public class ContactMethods {

    private final ContactMethod[] methods;

    /**
     * @param methods
     */
    public ContactMethods(ContactMethod... methods) {
        this.methods = methods;
    }

    /**
     * @return the methods
     */
    public ContactMethod[] getMethods() {
        return methods;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[\n");
        for (ContactMethod contactMethod : methods) {
            builder.append("\t" + contactMethod.toString() + ",\n");
        }
        builder.append("]");
        return builder.toString();
    }

}
