package com.dewaldv.kata02;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.*;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class KarateChopTest {

    @Test
    public void shouldReturnIndex() {
        KarateChop karate = new KarateChop();

        assertThat(karate.chop(3, emptyList()), is(-1));
        assertThat(karate.chop(3, singletonList(1)), is(-1));
        assertThat(karate.chop(1, singletonList(1)), is(0));
        assertThat(karate.chop(1, asList(1, 3, 5)), is(0));
        assertThat(karate.chop(3, asList(1, 3, 5)), is(1));
        assertThat(karate.chop(5, asList(1, 3, 5)), is(2));
        assertThat(karate.chop(0, asList(1, 3, 5)), is(-1));
        assertThat(karate.chop(2, asList(1, 3, 5)), is(-1));
        assertThat(karate.chop(4, asList(1, 3, 5)), is(-1));
        assertThat(karate.chop(6, asList(1, 3, 5)), is(-1));
        assertThat(karate.chop(1, asList(1, 3, 5, 7)), is(0));
        assertThat(karate.chop(3, asList(1, 3, 5, 7)), is(1));
        assertThat(karate.chop(5, asList(1, 3, 5, 7)), is(2));
        assertThat(karate.chop(7, asList(1, 3, 5, 7)), is(3));
        assertThat(karate.chop(0, asList(1, 3, 5, 7)), is(-1));
        assertThat(karate.chop(2, asList(1, 3, 5, 7)), is(-1));
        assertThat(karate.chop(4, asList(1, 3, 5, 7)), is(-1));
        assertThat(karate.chop(6, asList(1, 3, 5, 7)), is(-1));
        assertThat(karate.chop(8, asList(1, 3, 5, 7)), is(-1));
    }
}