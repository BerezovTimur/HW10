package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldCreate(){
        Conditioner conditioner1 = new Conditioner();

        Conditioner conditioner2 = new Conditioner(0, "test", 32, 0, 2, true);

        assertEquals(conditioner1.getMaxTemperature(), conditioner2.getMaxTemperature());

        System.out.println("Hi!");
    }

}