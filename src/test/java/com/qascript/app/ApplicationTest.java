package com.qascript.app;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    Application app = new Application();

    @Test
    public void testApplication(){
        try{
            Assert.assertEquals("Hello World!", app.getMessage());
            System.out.println("Abhimanyu");
        }
        catch (Exception e){
            Assert.fail("Message is  not Hello World!");
        }
    }
}
