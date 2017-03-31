package org.langera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(final String[] args) {
        final ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        final MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
