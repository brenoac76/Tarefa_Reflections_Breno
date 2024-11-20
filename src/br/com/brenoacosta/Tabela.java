package br.com.brenoacosta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  // Indica que a anotação se aplica a tipos (classes, interfaces)
@Retention(RetentionPolicy.RUNTIME)  // A anotação estará disponível em tempo de execução
public @interface Tabela {
    String nome();  // A anotação tem um elemento nome
}

