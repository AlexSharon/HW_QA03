
public final class Employee extends BaseEmployee {

    public Employee(String name, int age, char gender, double dailySalary) {
        super(name, age, gender, dailySalary);
    }

    @Override
    public double getSalary(MonthUtils.Month[] monthArray) {
        int days = 0;
        for (MonthUtils.Month m : monthArray) {
            days += m.getWDays();
        }
        return days * super.getDailySalary();
    }
}
