//Необходимо создать класс Manager с полями:
// имя, возраст, пол, ЗП в день и количество подчиненных.
// Все поля сделать приватными и для каждого поля добавить
// методы set и get. Класс должен иметь метод -
// getSalary(Month[] monthArray), метод возвращает зарплату
// за те месяцы которые были переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого
// подчиненного.

public final class Manager extends BaseEmployee {

    private int numOfSubordinates;

    public Manager(String name, int age, char gender, double dailySalary, int num) {
        super(name, age, gender, dailySalary);
        this.numOfSubordinates = num;
    }

    public void setNumOfSubordinates(int num) {
        this.numOfSubordinates = num;
    }

    public int getNumOfSubordinates() {
        return numOfSubordinates;
    }

    @Override
    public double getSalary(MonthUtils.Month[] monthArray) {
        double factor = numOfSubordinates / 100.0 + 1;
        return this.getSalary(monthArray) * factor;
    }
}
