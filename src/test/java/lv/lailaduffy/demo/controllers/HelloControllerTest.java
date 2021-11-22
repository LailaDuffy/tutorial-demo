package lv.lailaduffy.demo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController controller = new HelloController(); // arrange
        String response = controller.hello("World"); // act
        assertEquals("Hello, World", response);// assert
    }
}