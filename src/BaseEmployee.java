public abstract class BaseEmployee {
    private String name;
    private int age;
    private char gender;
    private double dailySalary;

    public BaseEmployee(String name, int age, char gender, double dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public abstract double getSalary(MonthUtils.Month[] monthArray);
}
