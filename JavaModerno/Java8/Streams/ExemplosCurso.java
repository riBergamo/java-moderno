package Java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemplosCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
        //cursos.forEach(c -> System.out.println(c.getNome()));

        //TODA COLLECTION AGORA TEM STREAM() ANTES

        //'.filter()' : dado um curso(c) ele devolve true se c.getAlunos() for maior ou igual a 100
        //'.forEach()' : pra exibir a lista

        System.out.println("Cursos com mais de 100 alunos");

        //
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100) //não da pra usar reference pq tem comparação
                .forEach(c -> System.out.println(c.getNome()));

        //
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos)//pra mostrar alunos ou nome
                .forEach(System.out::println);

        // se quiser exibir tem que guardar em uma var
        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)//pega a quantidade de alunos dentro dele(nesse caso pra somar)
                .sum();
        System.out.println("Soma dos cursos com mais de 100 alunos: " + soma);

    }
}
