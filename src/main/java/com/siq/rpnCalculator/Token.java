package com.siq.rpnCalculator;

public class Token {

    public Token(String input) {
    }

    public String toString() {
        return "";
    }

    /**
     * Checks to see if the token is known operator
     *
     * @return boolean
     */
    public boolean isOperator() {
        return false;
    }

    /**
     * Checks if token requires only one operand
     *
     * @return boolean
     */
    public boolean isMonadic() {
        return false;
    }

    /**
     * Checks if the token requires two operands
     *
     * @return boolean
     */
    public boolean isDyadic() {
        return false;
    }

    /**
     * Checks if the token contains an operator to be performed
     * on the stack
     *
     * @return boolean
     */
    public boolean isStackOperator() {
        return false;
    }

    /**
     * Checks if the token is a known operand
     *
     * @return boolean
     */
    public boolean isOperand() {
        return false;
    }

    /**
     * Checks if the token is an integer
     *
     * @return boolean
     */
    public boolean isInteger() {
        return false;
    }

    /**
     * Checks if the token is a float
     *
     * @return boolean
     */
    public boolean isFloat() {
        return false;
    }

}
