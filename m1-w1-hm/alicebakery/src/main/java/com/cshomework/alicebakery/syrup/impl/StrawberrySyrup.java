package com.cshomework.alicebakery.syrup.impl;

import com.cshomework.alicebakery.syrup.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("strawberrySyrup")
public class StrawberrySyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("Strawberry Syrup");
    }
}
