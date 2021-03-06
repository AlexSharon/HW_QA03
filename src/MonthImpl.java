public class MonthImpl {

    public class MonthUtils {

        private static final class Month implements IMonth {
            private String name;
            private int cDays;
            private int wDays;

            private Month(String name, int cDays, int wDays) {
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
    }

}
