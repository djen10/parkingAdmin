package com.parkingadmin;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParkingAdminApplicationTests {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll method call");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("");
        System.out.println("BeforeEach method call");
    }

    @Test
    void succeedingTest() {
        System.out.println("succeedingTest method call");
    }

    @Test
    void succeedingTest_2() {
        System.out.println("succeedingTest_2 method call");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach method call");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll method call");
    }
}
