package org.langera;

public class HelloWorldMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
