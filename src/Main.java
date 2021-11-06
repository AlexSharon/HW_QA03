import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee Maxim = new Employee("Max", 30, 'm', 8);
        Manager Oleg = new Manager("Oleg", 45, 'm', 10, 2);

        //System.out.println(Maxim.getSalary(MonthUtils.MONTHS));


       IMonth[] q1 = MonthUtils.q(4);
        for (int i = 0; i < q1.length; i++) {
            System.out.println(q1[i].getName());
        }

    }

}
