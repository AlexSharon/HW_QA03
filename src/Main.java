
public class Main {
    public static void main(String[] args) {

        Employee Maxim = new Employee("Max", 30, 'm', 8);
        Manager Oleg = new Manager("Oleg", 45, 'm', 10, 2);

        System.out.println(Maxim.getSalary(MonthUtils.MONTHS));
        System.out.println(Oleg.getSalary(MonthUtils.MONTHS));

    }

}