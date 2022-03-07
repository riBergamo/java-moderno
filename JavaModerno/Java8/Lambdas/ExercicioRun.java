package Java8.Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExercicioRun {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura online");
        palavras.add("Editora cada do código");
        palavras.add("caelum");

        //como tava
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }

        }).start();

        //como fico
        new Thread(() -> System.out.println("Executando um Runnable")).start();

        //02
        palavras.sort(Comparator.comparing(String::length));



    }
}
