package com.company;

public class Main {

    public static void main(String[] args) {

        Tea tea = new Tea();

        tea = new Lemon(tea);
        tea = new Mint(tea);
        tea = new Sugar(tea);

        System.out.println("You ordered " + tea.description());

    }

}
