package org.langera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService messageService() {
        return new HelloWorldMessageService();
    }

    public static void main(final String[] args) {
        final ApplicationContext context =
            new AnnotationConfigApplicationContext(Application.class);
        final MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
