package jplsemfive.exp6.hospital;
public class Doctor extends Person {
    public int fees;
    public int income;

    public Doctor(String name, String date, int fees, int income) {
        super(name, date);
        this.fees = fees;
        this.income = income;
    }
    
    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Doctor d = (Doctor) obj;

        if (!this.getName().equals(d.getName())) return false;

        if (this.getFees() != d.getFees()) return false;

        if (this.getIncome() != d.getIncome()) return false;

        if (this.Date != d.Date) return false;

        return true;
    }


    @Override
    public String toString() {
        return "Doctor{" +
               "name='" + name + '\'' +
               ", Date='" + Date + '\'' +
               ", fees=" + fees +
               ", income=" + income +
               '}';
    }
}
