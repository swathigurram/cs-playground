package com.cshomework.alicebakery.cakebaker;

import com.cshomework.alicebakery.frosting.Frosting;
import com.cshomework.alicebakery.syrup.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    Frosting frosting;
    Syrup syrup;

    CakeBaker(Frosting frosting,@Qualifier("strawberrySyrup") Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.print("Bake the Cake using ");
        frosting.getFrostingType();
        System.out.print(" and ");
        syrup.getSyrupType();
    }
}
