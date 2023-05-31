package com.devskiller.tests;

import org.assertj.core.error.ShouldHaveToString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AtmServiceTest {

    public static final String CARDNO = "1234";
    private AtmService atmService;

    @Before
    public void setUp() {
	atmService = AtmServiceProvider.getAtmService();
    atmService.deposit(CARDNO, 200);
    }

    // Write your tests here

    @Test
    public void testAmountGteq0() {
        String result  =  atmService.withdraw(CARDNO, -1);
        Assert.assertEquals("Amount should be greater than zero",result);
    }

    @Test
    public void testAmountMulOf10() {
        String result  =  atmService.withdraw(CARDNO, 1);
        Assert.assertEquals("Amount should be the multiple of the 10 USD",result);
    }


    @Test
    public void testInsufficientFund() {
        String result  =  atmService.withdraw(CARDNO, 300);
        Assert.assertEquals("Insufficient funds",result);
    }

    @Test
    public void testSuccessfulWithdraw() {
        String result  =  atmService.withdraw(CARDNO, 100);
        Assert.assertEquals("Success! Amount left: 100 USD",result);
    }


}
