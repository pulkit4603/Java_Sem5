package jplsemfive.exp6.hospital;
public class Patient extends Person {
    private Doctor doctor;

    public Patient(String name, String date, Doctor doctor) {
        super(name, date);
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;

        Patient p = (Patient) obj;

        if (!this.getName().equals(p.getName()))
            return false;

        if (this.Date != p.Date)
            return false;

        if (!this.doctor.equals(p.doctor))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Patient{" +
               "name='" + name + '\'' +
               ", Date='" + Date + '\'' +
               ", doctor=" + (doctor != null ? doctor.toString() : "No Doctor Assigned") +
               '}';
    }

}
