package com.siq.rpnCalculator;

public class Token {

    public Token(String input) {
    }

    public String toString() {
        return "";
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isMonadic() {
        return false;
    }

    public boolean isDyadic() {
        return false;
    }

    public boolean isStackOperator() {
        return false;
    }

    public boolean isOperand() {
        return false;
    }

    public boolean isInteger() {
        return false;
    }

    public boolean isFloat(){
        return false;
    }

}
