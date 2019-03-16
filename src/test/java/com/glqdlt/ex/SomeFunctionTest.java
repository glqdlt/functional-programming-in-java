package com.glqdlt.ex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author glqdlt
 * 2019-03-16
 */
public class SomeFunctionTest {
    List<Integer> fixture;

    @Before
    public void setUp() throws Exception {
        fixture = Arrays.asList(9,8,9,1, 6,6,7, 85,1,2,99);
    }

    @Test
    public void 리스트에서가장큰수찾기() throws Exception {
        Assert.assertEquals(99,SomeFunction.max(fixture));
    }

    @Test
    public void 겁나긴리스트에서가장큰수찾기() throws Exception {
        List<Integer> asd = IntStream.rangeClosed(0, 2999).boxed().collect(Collectors.toList());
        Assert.assertEquals(2999,SomeFunction.max(asd));
    }

    @Test
    public void 리스트다더하기() throws Exception {
        Assert.assertEquals(233,SomeFunction.sum(fixture));
    }
}