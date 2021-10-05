package com.company;

public class Mint extends TeaDecorator {

    private Tea tea;

    public Mint(Tea tea) {

        this.tea = tea;
    }

    @Override
    public String description() {

        return tea.description() + "mint, ";
    }

}
