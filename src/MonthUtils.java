import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MonthUtils {

    private static final class MonthImpl implements IMonth {
        private String name;
        private int cDays;
        private int wDays;

        public MonthImpl(String name, int cDays, int wDays) {
            this.name = name;
            this.cDays = cDays;
            this.wDays = wDays;
        }

        public String getName() { return name; }
        public int getCDays() { return cDays; }
        public int getWDays() { return wDays; }
    }

    public static final IMonth[] MONTHS = {
        new MonthImpl("Jan", 31, 18),
        new MonthImpl("Feb", 28, 20),
        new MonthImpl("Mar", 31, 22),
        new MonthImpl("Apr", 30, 21),
        new MonthImpl("May", 31, 22),
        new MonthImpl("Jun", 30, 21),
        new MonthImpl("Jul", 31, 22),
        new MonthImpl("Aug", 31, 22),
        new MonthImpl("Sep", 30, 21),
        new MonthImpl("Oct", 31, 22),
        new MonthImpl("Nov", 30, 21),
        new MonthImpl("Dec", 31, 22),
    };

    //метод возвращающий кварталы (массивы по 3 месяца соответственно)
    public static List quarters(int q) {

        List listQ = new ArrayList();

        for (int i = 0; i < 3; i++) {
            switch (q) {
                case 1:
                    listQ.add(i, MONTHS[i]);
                case 2:
                    listQ.add(i, MONTHS[i+2]);
                case 3:
                    listQ.add(i, MONTHS[i+5]);
                case 4:
                    listQ.add(i, MONTHS[i+8]);
            }
        }
        return listQ;
    };

    public static IMonth[] q(int q) {

        IMonth[] listQ;
        switch (q) {
            case 1:
                return new IMonth[]{MONTHS[0], MONTHS[1], MONTHS[2]};
            case 2:
                return new IMonth[]{MONTHS[3], MONTHS[4], MONTHS[5]};
            case 3:
                return new IMonth[]{MONTHS[6], MONTHS[7], MONTHS[8]};
            case 4:
                return new IMonth[]{MONTHS[9], MONTHS[10], MONTHS[11]};
            default:
                return null;
        }
    };
}
