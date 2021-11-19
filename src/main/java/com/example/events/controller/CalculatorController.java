package com.example.events.controller;

import com.example.events.aspects.LogApiCall;
import com.example.events.event.CalculationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @LogApiCall
    @GetMapping(path = "/calcs/add")
    public int add(@RequestParam int firstNumber, @RequestParam int secondNumber) {
        System.out.println("Add numbers: " + firstNumber + " and " + secondNumber);
        publisher.publishEvent(
                new CalculationEvent(
                        this,
                        firstNumber,
                        secondNumber));
        return firstNumber + secondNumber;
    }

    @LogApiCall
    @GetMapping(path = "/calcs/substract")
    public int substract(@RequestParam int firstNumber, @RequestParam int secondNumber) {
        System.out.println("substract numbers: " + firstNumber + " and " + secondNumber);
        publisher.publishEvent(
                new CalculationEvent(
                        this,
                        firstNumber,
                        secondNumber));
        return firstNumber - secondNumber;
    }

    @LogApiCall
    @GetMapping(path = "/calcs/multiply")
    public int multiply(@RequestParam int firstNumber, @RequestParam int secondNumber) {
        System.out.println("multiply numbers: " + firstNumber + " and " + secondNumber);
        publisher.publishEvent(
                new CalculationEvent(
                        this,
                        firstNumber,
                        secondNumber));
        return firstNumber * secondNumber;
    }

    @LogApiCall
    @GetMapping(path = "/calcs/devide")
    public int devide(@RequestParam int firstNumber, @RequestParam int secondNumber) {
        System.out.println("devide numbers: " + firstNumber + " and " + secondNumber);
        publisher.publishEvent(
                new CalculationEvent(
                        this,
                        firstNumber,
                        secondNumber));
        return firstNumber / secondNumber;
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
