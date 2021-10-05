package com.company;

public class Sugar extends TeaDecorator{

    private Tea tea;

    public Sugar(Tea tea) {

        this.tea = tea;
    }

    @Override
    public String description() {
        return tea.description() + "and sugar.";
    }
}
