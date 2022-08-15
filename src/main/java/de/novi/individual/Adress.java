package de.novi.individual;

public class Adress {

    public final String country;
    public final String province;
    public final String city;
    public final String postalCode;
    public final String houseNumber;
    public final String houseNumberExtra;

    /**
     * @param country
     * @param province
     * @param city
     * @param postalCode
     * @param houseNumber
     * @param houseNumberExtra
     */
    public Adress(String country, String province, String city, String postalCode, String houseNumber,
            String houseNumberExtra) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.houseNumberExtra = houseNumberExtra;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @return the houseNumber
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * @return the houseNumberExtra
     */
    public String getHouseNumberExtra() {
        return houseNumberExtra;
    }

    @Override
    public String toString() {
        return "Adress: {\n" +
                "\tcountry: " + country + ",\n" +
                "\tprovince: " + province + ",\n" +
                "\tcity: " + city + ",\n" +
                "\tpostalCode: " + postalCode + ",\n" +
                "\thouse: " + houseNumber + houseNumberExtra + "\n}";
    }

}
