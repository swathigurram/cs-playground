package com.cshomework.alicebakery.syrup.impl;

import com.cshomework.alicebakery.syrup.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chocolateSyrup")
public class ChocolateSyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
