package com.example.events.service;


import com.example.events.event.ProductRegisteredEvent;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ProductImageManager implements ApplicationListener<ProductRegisteredEvent> {

    @Override
    public void onApplicationEvent(@NotNull ProductRegisteredEvent event) {
        System.out.println("Processing image of " + event.getProductName());
        System.out.println("The graphics is: " + event.getOtherData());
    }


}
