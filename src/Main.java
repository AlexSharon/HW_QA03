import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee Maxim = new Employee("Max", 30, 'm', 8);
        Manager Oleg = new Manager("Oleg", 45, 'm', 10, 2);

        //System.out.println(Maxim.getSalary(MonthUtils.MONTHS));

        List list = MonthUtils.quarters(2);
        System.out.println(list.get(0));

    }

}
