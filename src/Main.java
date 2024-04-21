import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nurse zina = new Nurse(LocalDate.of(2001, 2, 11),
                Collections.singletonList("Зинаида Васильевна Пупкина"), "начинающая", LocalDate.of(2023, 12, 12),
                "general", new ArrayList<>());
        Doctor mainDoctor = new Doctor(zina, LocalDate.of(1981, 2, 12),
                Collections.singletonList("Петр Иванович Железцов"), "врач средней руки", LocalDate.of(2000, 12, 6),
                "Педиатр", null);
        Patient patient1 = new Patient("Вася","Иванов",
                LocalDate.of(2023, 3, 14));
        Patient patient2 = new Patient("Дима","Иванов",
                LocalDate.of(2022, 12, 4));


        // System.out.print(mainDoctor.calculateExperience());
        mainDoctor.info();
        System.out.print("\n");
        mainDoctor.addPatient(patient1);
        mainDoctor.printPatients();
        System.out.print("\n");
        mainDoctor.addPatient(patient2);
        mainDoctor.printPatients();
        System.out.print("\n");
        mainDoctor.removePatient(patient1);
        mainDoctor.printPatients();
        System.out.print("\n");
        patient2.info();
        System.out.print("\n");
        System.out.print( mainDoctor.patientSearch(patient1));



        }

    }

