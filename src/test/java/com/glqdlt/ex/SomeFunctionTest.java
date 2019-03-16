package com.glqdlt.ex;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author glqdlt
 * 2019-03-16
 */
public class SomeFunctionTest {

    @Test
    public void 리스트에서가장큰수찾기() throws Exception {
        int res = SomeFunction.max(Arrays.asList(1, 6, 8));
        Assert.assertEquals(8,res);
    }
}