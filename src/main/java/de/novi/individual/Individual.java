package de.novi.individual;

public class Individual {

    private final String lastName;

    private final String middleName;
    private final String firstName;

    private final Date birthDate;
    private final Date deathDate;

    private final Adress birthPlace;
    private final Adress livingPlace;

    private final ContactMethods contactMethods;

    /**
     * @param lastName
     * @param middleName
     * @param firstName
     * @param birthDate
     * @param deathDate
     * @param birthPlace
     * @param livingPlace
     * @param contactMethods
     */
    public Individual(String lastName, String middleName, String firstName, Date birthDate, Date deathDate,
            Adress birthPlace, Adress livingPlace, ContactMethods contactMethods) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.birthPlace = birthPlace;
        this.livingPlace = livingPlace;
        this.contactMethods = contactMethods;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @return the deathDate
     */
    public Date getDeathDate() {
        return deathDate;
    }

    /**
     * @return the birthPlace
     */
    public Adress getBirthPlace() {
        return birthPlace;
    }

    /**
     * @return the livingPlace
     */
    public Adress getLivingPlace() {
        return livingPlace;
    }

    /**
     * @return the contactMethods
     */
    public ContactMethods getContactMethods() {
        return contactMethods;
    }

    @Override
    public String toString() {
        return "Individual: {\n" +
                "\tlastName:        " + lastName + ",\n" +
                "\tmiddleName:      " + middleName + ",\n" +
                "\tfirstName:       " + firstName + ",\n" +
                "\tbirthDate:       " + birthDate.toString() + ",\n" +
                "\tdeathDate:       " + deathDate.toString() + ",\n" +
                "\tbirthPlace:      " + birthPlace.toString() + ",\n" +
                "\tlivingPlace:     " + livingPlace.toString() + ",\n" +
                "\tcontactMethods:  " + contactMethods.toString() + ",\n" +
                "}";
    }

}
