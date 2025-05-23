package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseMathTest {
    @BeforeAll
    static void setUpBeforeClass(){
    }

    @AfterAll
    static void tearDownBeforeClass(){
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testFactorial1() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath.factorial(-1));
        assertEquals("0以下の値は不正です。", expectedException.getMessage(), "TC21:期待値と実際の結果が異なります");
    }

    @Test
    void testFactorial2(){
    }

    @Test
    void testFactorial3(){
    }

    @Test
    void testFactorial4(){
    }

    @Test
    void testFactorial5(){
    }

    @Test
    void testFactorial6(){
    }

    @Test
    void testFactorial7(){
    }

    @Test
    void testFactorial8(){
    }

    @Test
    void testFactorial9(){
    }

    @Test
    void testFactorial10(){
    }
}