package Clinics;

class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public void assignDoctor() {
        Doctor doctor;

        int planCode = treatmentPlan.getCode();
        if (planCode == 1) {
            doctor = new Surgeon();
        } else if (planCode == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        System.out.println("Добрый день, " + name + "!");
        doctor.treat();
    }
}
