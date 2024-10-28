public class PatientDriver {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Smith", "20/05/1975", 200, 50000);
        Doctor doctor2 = new Doctor("Dr. Brown", "15/08/1980", 250, 55000);

        Patient patient1 = new Patient("Alice", "12/04/2001", doctor1);
        Patient patient2 = new Patient("Bob", "03/12/1999", doctor2);
        Patient patient3 = new Patient("Alice", "12/04/2001", doctor1); // Same as patient1 for testing equality

        System.out.println("Patient 1: " + patient1);
        System.out.println("Patient 2: " + patient2);
        System.out.println("Patient 3 (should be identical to Patient 1): " + patient3);

        System.out.println("Patient 1 equals Patient 2? " + patient1.equals(patient2)); // Should print false
        System.out.println("Patient 1 equals Patient 3? " + patient1.equals(patient3)); // Should print true

        System.out.println("Patient 1's Doctor: " + patient1.getDoctor());
        patient1.setDoctor(doctor2);
        System.out.println("Patient 1's Doctor after reassignment: " + patient1.getDoctor());
    }
}
