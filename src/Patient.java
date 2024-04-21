import java.time.LocalDate;
import java.time.Period;

public class Patient {
     private String name;
     private String familyName;
     private LocalDate age;
     //List<String> history;
     //HashMap<String, Double> data;

     public Patient(String name, String familyName, LocalDate age) {
          this.name = name;
          this.familyName = familyName;
          this.age = age;
     }

     public String getName() {
          return name;
     }

     public void printName() {
          System.out.print(getName());;
     }
     public String getFamilyName() {
          return familyName;
     }

     public LocalDate getAge() {
          return age;
     }
     public void info(){
          System.out.print("Имя: " + name +
                  "Фамилия:  " + familyName +
                  "Возраст: " + calculateAge() + "месяцев");
     }
     public int calculateAge(){
          return Period.between(getAge(), LocalDate.now()).getMonths();
     }
}

