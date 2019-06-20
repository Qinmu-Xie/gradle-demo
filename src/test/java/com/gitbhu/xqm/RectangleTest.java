package com.gitbhu.xqm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(1, 2);
    }

    @Test
    public void should_get_correct_perimeter() {
        assertEquals(6, rectangle.getPerimeter());
    }


    @Test
    public void should_get_correct_acreage() {
        assertEquals(2, rectangle.getAcreage());
    }
}