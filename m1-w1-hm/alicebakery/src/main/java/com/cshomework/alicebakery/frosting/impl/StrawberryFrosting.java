package com.cshomework.alicebakery.frosting.impl;

import com.cshomework.alicebakery.frosting.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting {

    @Override
    public void getFrostingType() {
        System.out.print("Strawberry Frosting");
    }

}
