package Sem_1.main.medPersonal;


import java.time.LocalDate;

public abstract class MedicalServices {

    protected String Name, SeName;
    protected Office office;
    protected LocalDate birthDate;

    public MedicalServices(String Name, String SeName, LocalDate birthDate, Office office, int seniority) {
        this.Name = Name;
        this.SeName = SeName;
        this.birthDate = birthDate;
        this.office = office;
    }

    public MedicalServices() {
        this("Имя", "Фамилия", LocalDate.now(), new Office("Ветеринар"), 0);
    }

    public String getName() {
        return Name;
    }

    public String getSeName() {
        return SeName;
    }

    public Office getOffice() {
        return office;
    }
    public void setOffice(Office office) {
        this.office = office;
    }

    public void  getTimeOperations() {
        System.out.println(0d);
    }


    public void medicalСheckup() {
        System.out.println("Первичный осмотр проведен!");
    }
    public void operation() {
        System.out.println("Операция проведена успешно!");
    }
    @Override
    public String toString() {
        return String.format("Name = %s, SeName = %s, birthDate = %s, office = %s", Name, SeName, birthDate, office);
    }
}
