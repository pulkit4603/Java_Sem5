public class DoctorDriver {
    public static void main(String[] args) {
        Doctor doctorA = new Doctor("docA", "28/10/2024", 500, 1500);
        Patient patient1 = new Patient("pat1", "28/10/2024", doctorA);
        Billing billAlpha = new Billing(patient1, "28/10/2024", 250.5);
        
        Doctor doctorB = new Doctor("docA", "28/10/2024", 500, 1500);
        Patient patient2 = new Patient("pat2", "27/10/2024", doctorB);
        Billing billBeta = new Billing(patient2, "27/10/2024", 0.1);

        System.out.println(doctorA.getName());
        if (doctorA.equals(doctorB))
            System.out.println("They're the same Doctor");
        doctorB.setFees(50000);
        System.out.println("Fees for docA in job B set to 50000 from 500");
        if (!doctorA.equals(doctorB))
            System.out.println("They're varyingly expensive doctors");
        System.out.println(doctorA.getIncome());
        System.out.println(doctorB.getIncome());
        System.out.println(doctorA.toString());
        System.out.println(doctorB.toString());
    }
}
