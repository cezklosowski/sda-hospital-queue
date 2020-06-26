package pl.sda;

public class Patient {
    private String name;
    private String surname;
    private int howMuchAngry;
    private String diagnosedDisease;

    public Patient() {
    }

    public Patient(String name, String surname, int howMuchAngry, String diagnosedDisease) {
        this.name = name;
        this.surname = surname;
        this.howMuchAngry = howMuchAngry;
        this.diagnosedDisease = diagnosedDisease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHowMuchAngry() {
        return howMuchAngry;
    }

    public void setHowMuchAngry(int howMuchAngry) {
        this.howMuchAngry = howMuchAngry;
    }

    public String getDiagnosedDisease() {
        return diagnosedDisease;
    }

    public void setDiagnosedDisease(String diagnosedDisease) {
        this.diagnosedDisease = diagnosedDisease;
    }

}
