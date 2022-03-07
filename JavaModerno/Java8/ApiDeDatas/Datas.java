package Java8.ApiDeDatas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now(); //.now() : pega a data de hoje e guarda na ref hoje
        System.out.println(hoje);

        LocalDate olimpiadasDoRio = LocalDate.of(2024, Month.APRIL, 23);

        int anos = olimpiadasDoRio.getYear() - hoje.getYear();
        System.out.println(anos);

        Period period = Period.between(hoje, olimpiadasDoRio);
        System.out.println(period.getDays());

        LocalDate proximasOlimpiadas = olimpiadasDoRio.plusYears(4);

        System.out.println(proximasOlimpiadas);

        //formatação da DATA
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//pra add Horas e Minutos(hh/mm) tem que criar um novo formatter

        //formataçao do proximasOlimpiadas
        String valorFormatter = proximasOlimpiadas.format(formatter);
        System.out.println(valorFormatter);

        //
        DateTimeFormatter formatterComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatterComHora));

        //
        YearMonth mes = YearMonth.of(2001, Month.APRIL);//mes de um ano espécifico
        System.out.println(mes);

        LocalTime intervalo = LocalTime.of(15, 30);//hora especifica
        System.out.println(intervalo);


    }
}
