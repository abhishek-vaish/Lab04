package lab04;

public class Student extends Person {
    private long uniRollNumber;
    private double currentCPI;

    public Student(String name, int Age, char Gender, long uniRollNumber, double currentCPI) {
        super(name, Age, Gender);
        this.currentCPI = currentCPI;
        this.uniRollNumber = uniRollNumber;
    }

    public long setUniRollNumber() {
        return uniRollNumber;
    }

    public double setCurrentCPI() {
        return currentCPI;
    }

    public void getUniRollNumber(long uniRollNumber) {
        this.uniRollNumber = uniRollNumber;
    }

    public void getCurrentCPI(double currentCPI) {
        this.currentCPI = currentCPI;
    }

    public String toString() {
        StringBuilder show = new StringBuilder();
        show.append(super.toString());
        show.append("University Roll Number : " + setUniRollNumber());
        show.append("Current CPI : " + setCurrentCPI());
        return show.toString();
    }

}

