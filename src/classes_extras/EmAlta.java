package classes_extras;

import modelos.Audio;

public class EmAlta {
    public void emAlta(Audio audio) {
        if (audio.getClassificacao() == 1) {
            System.out.println("Está em Alta 🔥🔥🔥");
        } else {
            System.out.println("Não está em alta 😔");
        }
    }
}
