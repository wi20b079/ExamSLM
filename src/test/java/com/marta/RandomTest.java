package com.marta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RandomTest {


    @Test
    public void randomTest_smaller()
    {
        // Arrange
        RandomTest rt = new RandomTest();

        // Act
        int result = rc.random();

        // Assert
        Assertions.assertEquals(true, result <101);
    }
    @Test
    public void randomTest_bigger()
    {
        // Arrange
        RandomTest rt = new RandomTest();

        // Act
        int result = rc.random();

        // Assert
        Assertions.assertEquals(true, result >=0);
    }
}
