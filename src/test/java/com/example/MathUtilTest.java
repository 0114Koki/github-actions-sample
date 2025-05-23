package com.example;

import org.junit.jupiter.api.*;
//(1) class名.メソッド名のクラス名を省略できる
import static org.junit.jupiter.api.Assertions.*;
//(2)
class MathUtilTest {
    //(3)
    @BeforeAll
    static void setUpBeforeClass(){
        System.out.println("全てのテストの前に1回");
    }
    //(4)
    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("全てのテストの後に1回");
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    //(7)
    @Test
    void test9(){
        double actualAnswer = MathUtil.power(1, 1);
        assertEquals(5.0, actualAnswer, "TC9:期待値と実際の値が異なります");
    }

    @Test
    void test16(){
        double actualAnswer = MathUtil.power(2, -2);
        assertEquals(0.25, actualAnswer, "TC16:期待値と実際の値が異なります");
    }

    @Test
    void test21(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> MathUtil.power(100, 0));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC21:期待値と実際の結果が異なります");
    }























}