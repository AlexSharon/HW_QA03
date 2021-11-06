
public final class Employee extends BaseEmployee {

    public Employee(String name, int age, char gender, double dailySalary) {
        super(name, age, gender, dailySalary);
    }

    public double getSalary(IMonth[] monthArray) {
        int days = 0;
        for (IMonth m : monthArray) {
            days += m.getWDays();
        }
        return days * super.getDailySalary();
    }
}
