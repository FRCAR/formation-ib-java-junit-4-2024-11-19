package com.bigcorp.crm.test;


import com.bigcorp.crm.ServiceA;
import com.bigcorp.crm.ServiceB;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceA {

    private ServiceA serviceA;

    @Mock
    private ServiceB serviceB;

    @Before
    public void setUp() {
        this.serviceA = new ServiceA();
        serviceA.setServiceB(serviceB);
        when(serviceB.isValid("roberto")).thenReturn(false);
        when(serviceB.isValid("roberta")).thenReturn(true);
        when(serviceB.isValid("robertu")).thenReturn(true);
    }

    @Test
    public void testSaveRoberto() {
        boolean result = this.serviceA.save("roberto");
        Assert.assertFalse(result);
    }



    @Test
    public void testSaveRoberta() {
        boolean result = this.serviceA.save("roberta");
        Assert.assertTrue(result);
    }



    @Test
    public void testSaveRobertuTwice() {
        boolean result = this.serviceA.save("robertu");
        Assert.assertTrue(result);
        result = this.serviceA.save("robertu");
        Assert.assertFalse(result);
    }
}