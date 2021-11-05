import java.util.Locale;

public class MonthUtils {

    public static class Month {
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
    };

}
