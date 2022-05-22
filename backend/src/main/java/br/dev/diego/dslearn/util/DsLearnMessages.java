package br.dev.diego.dslearn.util;

public class DsLearnMessages {

    private DsLearnMessages() {
        // Util class
    }

    public static String naoEncontrado(Long id, String className) {
        return "Não encontrado id: " + id + " entity: " + className;
    }

    public static String impossivelExcluir(Long id, String className) {
        return "Impossivel excluir. Possui entidades relacionadas id: " + id + " entity: " + className;
    }
}
