package com.example.larsnielsen.notalchemy;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by Anders on 22-Apr-17.
 */

public class Elements extends MainActivity{
    String value;
    boolean activation;
    public Elements(String value, boolean activation) {
        this.value = value;
        this.activation = activation;
    }

    public String getValue() {
        return value;
    }
    public boolean isActivation() {
        return activation;
    }

    public void changestate(String selector){
        if(selector == getValue()) {
            if(this.isActivation() == TRUE){
                activation = FALSE;
                statuscheck -= 1;
            }else{
                activation = TRUE;
                statuscheck += 1;
            }
        }
    }}