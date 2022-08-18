package de.novi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.novi.database.Database;
import de.novi.individual.Adress;
import de.novi.individual.ContactMethods;
import de.novi.individual.Date;
import de.novi.individual.Individual;
import de.novi.individual.contactmethod.AdressContactMethod;
import de.novi.individual.contactmethod.ContactMethod;
import de.novi.individual.contactmethod.EmailContactMethod;
import de.novi.individual.contactmethod.PhoneContactMethod;

/**
 * Hello world!
 *
 */
public class Generator {

    private final Random r;

    public Generator() {
        r = new Random();
    }

    public String genFirstName() {
        return Database.FIRST_NAMES[r.nextInt(Database.FIRST_NAMES.length)];
    }

    public String genMiddleName() {
        return Database.MIDDLE_NAMES[r.nextInt(Database.MIDDLE_NAMES.length)];
    }

    public String genLastName() {
        return Database.LAST_NAMES[r.nextInt(Database.LAST_NAMES.length)];
    }

    public String genEmailProvider() {
        return Database.EMAIL_PROVIDER[r.nextInt(Database.EMAIL_PROVIDER.length)];
    }

    public String genEmail(String firstName, String middleName, String lastName) {
        String email;
        if (middleName.isEmpty()) {
            email = firstName + "." + lastName + "@" + genEmailProvider() + ".com";
        } else {
            email = firstName + "." + middleName + "." + lastName + "@" + genEmailProvider() + ".com";
        }
        return email;
    }

    public String genFullName() {
        return genFirstName() + " " + genMiddleName() + " "
                + genLastName();
    }

    public int genAge() {
        return genNumber(90);
    }

    public int genNumber(int bound) {
        return r.nextInt(bound);
    }

    public Date genDate() {
        // Date will be from 0 a.Ch. to today
        int day = r.nextInt(29) + 1;
        int month = r.nextInt(11) + 1;
        int year = r.nextInt(80) + 1940;
        return new Date(day, month, year);
    }

    public Date genDeathDate(Date birthDate) {
        int day = r.nextInt(29) + 1;
        int month = r.nextInt(11) + 1;
        int year = r.nextInt(80) + 1940;
        
        if(r.nextBoolean()) {
            // is true -> died

        }else {
            // is false -> still living

        }

        return new Date(day, month, year);
    }

    public Adress genAdress() {
        return new Adress("Deutschland", "Thüringen", "Erfurt", "99051", "33", "a");
    }
    public String genPhone() {
        String a = ""; 
        for (int i = 0; i < 4;i ++) {
            a += r.nextInt(10);
        }
        a += " ";
        for (int i = 0; i < 8;i ++) {
            a += r.nextInt(10);
        }
        return a;
    }

    public ContactMethods genContactMethod(String firstName, String middleName, String lastName) {
        int amount = r.nextInt(4);
        ContactMethod[] methods = new ContactMethod[amount];
        for (int i = 0; i < amount; i++) {
            ContactMethod method;
            int type = r.nextInt(3);
            if (type == 0) {
                method = new AdressContactMethod().setData(genAdress().toString());
            } else if (type == 1) {
                method = new EmailContactMethod().setData(genEmail(firstName, middleName, lastName));
            } else if (type == 2) {
                method = new PhoneContactMethod().setData(genPhone());
            } else {
                method = null;
            }
            methods[i] = method;
        }

        return new ContactMethods(methods);
    }

    public Individual genIndividual() {
        String firstName = genFirstName();
        String middleName = genMiddleName();
        String lastName = genLastName();
        Date birthDate = genDate();
        Date deathDate = genDeathDate(birthDate);

        return new Individual(lastName, middleName, firstName, birthDate, deathDate, genAdress(),
                genAdress(), genContactMethod(firstName, middleName, lastName));
    }

}
