package com.zheli.appletest.shorturl;

import org.junit.Assert;
import org.junit.Test;

import static com.zheli.appletest.shorturl.NumberUtils.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Zhe Li on 03/18/2018.
 */
public class NumberUtilsTest {

    @Test
    public void testDecimal2base62() {
        Assert.assertEquals("0", NumberUtils.decimal2base62(0L));
        Assert.assertEquals("A", NumberUtils.decimal2base62(36L));
    }

    @Test
    public void testBase62ToDecimal() {
        Assert.assertEquals(Long.valueOf(0l), NumberUtils.base62ToDecimal("0"));
        Assert.assertEquals(Long.valueOf(36L), NumberUtils.base62ToDecimal("A"));
    }

    @Test
    public void testAscii2integer() {
        Assert.assertEquals(0, NumberUtils.ascii2integer('0'));
        Assert.assertEquals(10, NumberUtils.ascii2integer('a'));
        Assert.assertEquals(35, NumberUtils.ascii2integer('z'));
        Assert.assertEquals(36, NumberUtils.ascii2integer('A'));
        Assert.assertEquals(61, NumberUtils.ascii2integer('Z'));
    }

    @Test
    public void test() {
        System.out.println(NumberUtils.base62ToDecimal("8g"));
        System.out.println(NumberUtils.base62ToDecimal("gw"));
    }

}