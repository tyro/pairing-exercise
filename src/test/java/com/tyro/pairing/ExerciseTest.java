package com.tyro.pairing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExerciseTest {

    @Test
    void shouldFail() {
        assertThat(true, is(false));
    }

}
