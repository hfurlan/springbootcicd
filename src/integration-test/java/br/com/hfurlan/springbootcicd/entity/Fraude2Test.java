package br.com.hfurlan.springbootcicd.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Fraude2Test {

    @Test
    public void setId_ValidNumber_Updated(){
        Fraude fraude = new Fraude();
        fraude.setId(10);
        Assertions.assertEquals(10, fraude.getId());
    }
}
