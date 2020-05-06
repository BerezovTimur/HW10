package ru.netology.domain.constructor;

import lombok

@NoArgsConstructor


public class Conditioner {
    private int id;
    private String name="noname";
    private int maxTemperature = 32;
    private int minTemperature = 13;
    private int currentTemperature = 22;
    private boolean on;

}
