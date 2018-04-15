package org.plaltar;

public class Calculator {

    private Operation operation;

    public void use(Operation operation) {
        this.operation = operation;

    }

    public double calculate(String first, String second) {
        return operation.execute(Double.parseDouble(first), Double.parseDouble(second));
    }

}
