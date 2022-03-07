package Java8.MaisStreamsCollectorsAPIs;

import Java8.Streams.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst()//pega so o primeiro item da lista
                .ifPresent(x -> System.out.println(x.getNome()));

    }
}
