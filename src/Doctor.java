import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doctor {
    private Nurse nurse;
    private LocalDate age;
    private List<String> name;
    private String grade;
    private LocalDate experience;
    private String specialty;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(Nurse nurse, LocalDate age, List<String> name,
                  String grade, LocalDate experience, String specialty, List<Patient> patients) {
        this.nurse = nurse;
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.experience = experience;
        this.specialty = specialty;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Nurse getNurse() {
        return nurse;
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

    public Integer calculateExperience() {
        if(getExperience() != null) {
//            LocalDate.now();
            return Period.between(getExperience(),LocalDate.now()).getYears();
        }
        return null;
    }

    public Integer calculateAge(){
        if(getAge() != null){
            LocalDate.now();
            return Period.between(getAge(),LocalDate.now()).getYears();
        }
        return null;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }
    public void removePatient(Patient patient){
        patients.remove(patient);
    }


public List<Patient> addPatients(Patient...patient){
    Collections.addAll(patients, patient);
    return patients;
}


    public void info() {
        System.out.print("Ф.И.О: "  + getName() +
                "\n Возраст" + calculateAge() +
                ", \n Степень:  " + grade + '\'' +
                ", \n Опыт работы: " + calculateExperience() +
                ", \n Специализация:  " + specialty +
                "\n сестричка:  " + getNurse().getName());



        }
        public void printPatients(){
            for (int i = 0; i < getPatients().size(); i++) {
                patients.get(i).printName();
            }

        }
        public boolean patientSearch(Patient patient){
        if(patients.contains(patient)) {
            System.out.printf("%s обслуживается доктором", patient.getName());
            return true;
        }

        else {
            System.out.printf("%s не обслуживается доктором", patient.getName());
            return false;}
        }
    }







