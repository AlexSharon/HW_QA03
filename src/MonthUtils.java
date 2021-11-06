import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MonthUtils {

    public static final class Month {
        private String name;
        private int cDays;
        private int wDays;

        public Month(String name, int cDays, int wDays) {
            this.name = name;
            this.cDays = cDays;
            this.wDays = wDays;
        }

        public String getName() { return name; }
        public int getCDays() { return cDays; }
        public int getWDays() { return wDays; }
    }

    public static final Month[] MONTHS = {
        new Month("Jan", 31, 18),
        new Month("Feb", 28, 20),
        new Month("Mar", 31, 22),
        new Month("Apr", 30, 21),
        new Month("May", 31, 22),
        new Month("Jun", 30, 21),
        new Month("Jul", 31, 22),
        new Month("Aug", 31, 22),
        new Month("Sep", 30, 21),
        new Month("Oct", 31, 22),
        new Month("Nov", 30, 21),
        new Month("Dec", 31, 22),
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

    public static Month[] q(int q) {

        Month[] listQ;
        switch (q) {
            case 1:
                return new Month[]{MONTHS[0], MONTHS[1], MONTHS[2]};
            case 2:
                return new Month[]{MONTHS[3], MONTHS[4], MONTHS[5]};
            case 3:
                return new Month[]{MONTHS[6], MONTHS[7], MONTHS[8]};
            case 4:
                return new Month[]{MONTHS[9], MONTHS[10], MONTHS[11]};
            default:
                return null;
        }
    };
}
