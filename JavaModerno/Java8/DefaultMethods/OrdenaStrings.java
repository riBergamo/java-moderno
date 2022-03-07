package Java8.DefaultMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura online");
        palavras.add("Editora cada do código");
        palavras.add("caelum");

        Comparator<String> comparator = new ComparadorPorTamanho();

        palavras.sort(comparator);


        //formato antigo, antes do java 8
        for (String p : palavras) {
            System.out.println(p);
        }

        //for "novo"
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);


        //LAMBDA
        palavras.forEach(s -> System.out.println(s));


    }
}

class ComparadorPorTamanho implements Comparator<String> { //Compara da String menor para String maior

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return -1;
        }
        if (o1.length() > o2.length()) {
            return 1;
        }
        return 0;
    }

}

class ImprimeNaLinha implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
