package Sem_1.main.base.medPersonal;

import Sem_1.main.base.VeterinaryClinic;

import java.time.LocalDate;

public abstract class MedPersonal extends VeterinaryClinic {
    protected String Name, SeName;
    protected Office office;
    protected LocalDate birthDate;


    public MedPersonal(String Name, String SeName, LocalDate birthDate, Office office) {
        this.Name = Name;
        this.SeName = SeName;
        this.birthDate = birthDate;
        this.office = office;
    }

    public MedPersonal() {
        this("Имя", "Фамилия", LocalDate.now(), new Office("Ветеринар"));
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

    @Override
    public String toString() {
        return String.format("Name = %s, SeName = %s, birthDate = %s, office = %s", Name, SeName, birthDate, office);
    }


}
