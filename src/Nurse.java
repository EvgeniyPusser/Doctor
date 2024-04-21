import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Nurse {

    private LocalDate age;
    public List<String> name;
    private String grade;
    private LocalDate experience;
    private String specialty;
    private List<Patient> patients = new ArrayList<>();

    public Nurse(LocalDate age, List<String> name, String grade,
                 LocalDate experience, String specialty, List<Patient> patients) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.experience = experience;
        this.specialty = specialty;
        this.patients = patients;
    }

    public LocalDate getAge() {
        return age;
    }

    public List<String> getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public LocalDate getExperience() {
        return experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}