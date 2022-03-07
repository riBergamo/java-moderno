package Java8.MaisStreamsCollectorsAPIs;

import Java8.Streams.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class ExemplosCursoMais {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average(); //média ele devolve um OPTIONAL double

        System.out.println("Soma dos cursos com mais de 100 alunos: " + media);


        //mais streams collectors apis
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()//.findAny() : pega um curso aleatorio
                .ifPresent(c -> System.out.println(c.getNome())); //.ifPresent() : Se não tiver um curso com os filtros ele não exibe nada(Nem uma excepction, nem null)



        //com LIST<>
        System.out.println("\nLista com LIST");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList())//pega esses elementos e guarda em uma List
                .forEach(c -> System.out.println(c.getNome() + ", " + c.getAlunos()));

        System.out.println("\nLista com MAP");

        //com MAP<tipo da chave, tipo do valor>
        cursos.stream() //.parallelStream() : (mais rápido para quando tem muitos elementos)
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(m -> m.getNome(), m -> m.getAlunos()))//.toMap(chave, valor) : dado o 'nome' de um curso eu quero guardar a 'quant. de Alunos' dele. / recebe duas function(Lambda)
                .forEach((nome, alunos) -> System.out.println("O curso " + nome + " tem " + alunos + " alunos"));


        /* mesma função que o .ifPresent()
        Curso curso = optionalCurso.orElse(null); // orElse : devolve o curso ou null(ou o parametro q vc definir d acordo com oq ele aceita) / (.get() daria uma exception)
        System.out.println(curso.getNome());

        obs : na esquerda do "cursos.stream()..." teria que ter "Optional<Curso> curso = "

        Optional : ajuda a trabalhar com null(caso n tenha nenhum curso com mais de 100 alunos), ele fala tipo "pode ser que ele exista ou não",
        evitando de usar try cacth como nos casos de fazer if que ficaria um codigo extenso e feio.
        */
    }
}
