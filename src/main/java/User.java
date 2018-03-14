import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class User implements Comparable<User>{

    private String name;
    private String surname;
    private String birthDate;
    private String phoneNumber;

    public User(String name, String surname, String birthDate){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public User(String name, String surname, String birthDate, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getAge(){
        LocalDate dob = LocalDate.parse(this.birthDate);
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }

    public String toString(){
        String result = this.name +" "+this.surname +" "+getAge().toString();
        if(this.phoneNumber !=null){
            result += " "+this.phoneNumber;
        }
        return result;
    }

    @Override
    public int compareTo(User o) {
       return this.getAge().compareTo(o.getAge());
    }
}
