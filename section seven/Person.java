public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[]{name, nationality, dateOfBirth};
        this.seatNumber = seatNumber;
    }

    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String[] getPassport(){
        return passport;
    }

    public int getSeatNumber(){
        return seatNumber;
    }
}
