package com.company;

public class Lemon extends TeaDecorator {

    private Tea tea;

    public Lemon(Tea tea) {

        this.tea = tea;
    }

    @Override
    public String description() {

        return tea.description() + " with lemon, ";
    }
}