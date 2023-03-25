package skypro;

import java.time.LocalDate;

public enum Appearsln {
    oneTimeTask(0),
    DailyTask(1),
    weeklyTask(7),
    monthlyTask(30),
    YearlyTask(365);

    private Integer remiderDay;

    Appearsln(Integer remiderDay){
        this.remiderDay=remiderDay;

    }

    public void remiderDays(LocalDate remiderDay){
//        LocalDate date= LocalDate.now();
//        Integer date = null;
//        date - Appearsln.valueOf( );

    }

    public boolean appearsln(LocalDate localDate) {
        return false;
    }

    @Override
    public String toString() {
        return "Appearsln{" +
                "remiderDay=" + remiderDay +
                '}';
    }
}
