package com.example.events.event;

import org.springframework.context.ApplicationEvent;

public class CalculationEvent extends ApplicationEvent {

    private int firstNumber;
    private int secondNumber;

    public CalculationEvent(Object source, int firstNumber, int secondNumber) {
        super(source);
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
}
