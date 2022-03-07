package Java8.Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsLambda {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura online");
        palavras.add("Editora cada do código");
        palavras.add("caelum");

        //sem enxutar
        palavras.sort(( o1, o2) -> {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                if (o1.length() > o2.length()) {
                    return 1;
                }
                return 0;
        });

        //enxuta
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));


        //o equivalente ao palavras.forEach(s -> System.out.println(s))
        //Do lado esquerdo tem que ter uma Interface Funcional que receba um objeto
        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);
        //LAMBDA :
        // quando implementa interfaces muito curtas e o codigo nao sera reutilizado (não usar muito)
        palavras.forEach(s -> System.out.println(s)); //para cada palavras 's' mostre 's', o Consumer fica implicito no forEach e o tipo(no caso String) ele consegue deduzir


    }
}




