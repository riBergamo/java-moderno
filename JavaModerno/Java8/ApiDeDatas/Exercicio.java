package Java8.ApiDeDatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercicio {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate date = LocalDate.of(2099, Month.JANUARY, 25);

        Period period = Period.between(now, date);
        System.out.println(period);

        DateTimeFormatter formatting = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = now.format(formatting);
        System.out.println(formatted);

    }
}
