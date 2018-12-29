package ru.cosmo;

import org.springframework.beans.factory.annotation.Autowired;

public class IndependedMessageRenderer {
    @Autowired
    private MessageRenderer renderer;
    public void print() {
        renderer.printMessage();
    }

}
