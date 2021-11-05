//Необходимо создать класс Employee с полями:
// имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля
// добавить методы set и get. Класс должен иметь
// метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые
// были переданы в качестве аргумента.

public class Employee {
    private String name;
    private int age;
    private char gender;
    private double dailySalary;

    public Employee(String name, int age, char gender, double dailySalary) {
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

    public double getSalary(MonthUtils.Month[] monthArray) {
        int days = 0;
        for (MonthUtils.Month m : monthArray) {
            days += m.getWDays();
        }
        return days * dailySalary;
    }
}
