package classes_extras;

import interfaces.Classificavel;

public class MaisRecentes {

    public void maisRecentes (Classificavel classificavel) {

        if (classificavel.getRecentes() >= 2024) {
            System.out.println("""
                             Recente
                    """);

        } else {

            System.out.println("""
                             Antigo
                    """);
        }
    }

}
