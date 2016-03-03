package com.mac.chris.debugging;

import com.mac.chris.debugging.TP.FT_Math;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by admin on 3/3/2016.
 */
public class CR_Test {

    @Test
    public void addTest() {

        FT_Math fT = new FT_Math();

        assertEquals(7, fT.ftAdd(3,4));
    }

    @Test
    public void multTest() {

        FT_Math fT = new FT_Math();

        assertEquals(12, fT.ftMult(3,4));
    }
}
