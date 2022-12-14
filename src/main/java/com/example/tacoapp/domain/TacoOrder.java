package com.example.tacoapp.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos;

    public TacoOrder() {
        this.tacos = new ArrayList<>();
    }

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
