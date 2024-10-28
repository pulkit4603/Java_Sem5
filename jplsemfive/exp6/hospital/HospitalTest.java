package jplsemfive.exp6.hospital;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HospitalTest {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Smith", "20/05/1975", 2000, 50000);
        Doctor doctor2 = new Doctor("Dr. Brown", "15/08/1980", 2500, 55000);

        Patient patient1 = new Patient("Alice", "12/04/2023", doctor1); // Admitted on this date
        Patient patient2 = new Patient("Bob", "03/12/2023", doctor2); // Admitted on this date

        LocalDate currentDate = LocalDate.now();

        int daysPatient1Admitted = (int) ChronoUnit.DAYS.between(LocalDate.of(2023, 4, 12), currentDate);
        int daysPatient2Admitted = (int) ChronoUnit.DAYS.between(LocalDate.of(2023, 12, 3), currentDate);

        Billing billing1 = new Billing(patient1, currentDate.toString(), calculateTotalBill(daysPatient1Admitted, doctor1));
        Billing billing2 = new Billing(patient2, currentDate.toString(), calculateTotalBill(daysPatient2Admitted, doctor2));

        System.out.println(billing1);
        System.out.println(billing2);

        double totalIncome = billing1.getAmountDue() + billing2.getAmountDue();
        System.out.println("Total Income from Billing: " + totalIncome);

        doctor1.setIncome(doctor1.getIncome() + daysPatient1Admitted * doctor1.getFees());
        doctor2.setIncome(doctor2.getIncome() + daysPatient2Admitted * doctor2.getFees());

        System.out.println("Updated Income for " + doctor1.getName() + ": " + doctor1.getIncome());
        System.out.println("Updated Income for " + doctor2.getName() + ": " + doctor2.getIncome());
    }

    private static double calculateTotalBill(int daysAdmitted, Doctor doctor) {
        return (daysAdmitted * 2000) + (doctor.getFees() * daysAdmitted);
    }
}
