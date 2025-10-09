package classes_extras;

import interfaces.Classificavel;
import modelos.Audio;

public class Recomendacao {

    public void maisCurtidos (Classificavel classificavel) {

        if (classificavel.getClassificacao() >= 30000) {
            System.out.println("Está entre os mais curtidos. :)");

        } else {

            System.out.println("Não está entre os mais curtidos. :(");
        }
    }

}
