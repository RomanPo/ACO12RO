package ua.artcode.task.Week2.company.Homework.College;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 20:55
 * To change this template use File | Settings | File Templates.
 */
public class Address {

   private String numberOfHouse;
   private String streetName;
   private String city;

    public String getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(String numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String numberOfHouse, String streetName, String city) {

        this.numberOfHouse = numberOfHouse;
        this.streetName = streetName;
        this.city = city;
    }
}
