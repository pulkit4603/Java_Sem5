public class BillingDriver {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Adams", "10/03/1970", 300, 60000);
        Patient patient1 = new Patient("John Doe", "21/07/1985", doctor1);

        Doctor doctor2 = new Doctor("Dr. Green", "15/11/1982", 400, 75000);
        Patient patient2 = new Patient("Jane Smith", "03/05/1990", doctor2);

        Billing billing1 = new Billing(patient1, "01/10/2024", 500.0);
        Billing billing2 = new Billing(patient2, "02/10/2024", 750.0);
        Billing billing3 = new Billing(patient1, "01/10/2024", 500.0); // Identical to billing1 for testing equality

        System.out.println("Billing 1: " + billing1);
        System.out.println("Billing 2: " + billing2);
        System.out.println("Billing 3 (should be identical to Billing 1): " + billing3);

        System.out.println("Billing 1 equals Billing 2? " + billing1.equals(billing2)); // Should print false
        System.out.println("Billing 1 equals Billing 3? " + billing1.equals(billing3)); // Should print true

        System.out.println("Billing 1 Date: " + billing1.getBillingDate());
        billing1.setBillingDate("03/10/2024");
        System.out.println("Billing 1 Date after update: " + billing1.getBillingDate());

        System.out.println("Billing 1 Amount Due: " + billing1.getAmountDue());
        billing1.setAmountDue(550.0);
        System.out.println("Billing 1 Amount Due after update: " + billing1.getAmountDue());

        System.out.println("Billing 1 Patient: " + billing1.getPatient());
        billing1.setPatient(patient2);
        System.out.println("Billing 1 Patient after reassignment: " + billing1.getPatient());
    }
}
