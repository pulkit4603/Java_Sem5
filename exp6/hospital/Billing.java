public class Billing {
    private Patient patient;
    private String billingDate;
    private double amountDue;

    public Billing(Patient patient, String billingDate, double amountDue) {
        this.patient = patient;
        this.billingDate = billingDate;
        this.amountDue = amountDue;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;

        Billing b = (Billing) obj;

        if (!this.patient.equals(b.patient))
            return false;

        if (this.billingDate != b.billingDate)
            return false;

        if (this.amountDue != b.amountDue)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Billing{" +
               "patient=" + (patient != null ? patient.toString() : "No Patient") +
               ", billingDate='" + billingDate + '\'' +
               ", amountDue=" + amountDue +
               '}';
    }
}
