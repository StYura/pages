package com.example.demo;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DummyTest {
    @Test
    public void test() {
        assertThat(true).as("Positive test").isTrue();
    }
    @Test
    public void test2() {
        assertThat(false).as("Negative test").isTrue();
    }
}
