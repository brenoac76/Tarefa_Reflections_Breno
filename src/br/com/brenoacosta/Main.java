package br.com.brenoacosta;

public class Main {
    public static void main(String[] args) {
        // Obtém a classe Cliente em tempo de execução
        Class<?> clazz = Cliente.class;

        // Verifica se a classe possui a anotação Tabela
        if (clazz.isAnnotationPresent(Tabela.class)) {
            // Recupera a anotação Tabela aplicada à classe Cliente
            Tabela tabela = clazz.getAnnotation(Tabela.class);

            // Imprime o nome da tabela
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A classe não tem a anotação Tabela.");
        }
    }
}

