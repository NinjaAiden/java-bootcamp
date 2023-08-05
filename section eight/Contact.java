import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int toAge(String birthDate){
        // convert birthDate string to LocalDate
        LocalDate parsedBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // get current date
        LocalDate currentDate = LocalDate.now();
        // calculate period between dates
        Period period = Period.between(parsedBirthDate, currentDate);
        // return number of years
        return period.getYears();
    }
}