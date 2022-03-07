package Java8.MethodReferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsMR {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura online");
        palavras.add("Editora cada do código");
        palavras.add("caelum");


        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //METHOD REFERENCES : mais sucinto (tambem é um lambda)
        //opção 1 :
        //(String::length) :
        //String Ordene/'::' palavras pelo tamanho/lenght.
        palavras.sort(Comparator.comparing(String::length));

        //opção 2 :
        //compara um s com os outros s e ordena
        palavras.sort(Comparator.comparing(s -> s.length()));
        //

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);


        System.out.println(palavras);

    }
}
