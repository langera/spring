package org.langera;

import org.springframework.context.annotation.Bean;

public class HelloWorldMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
