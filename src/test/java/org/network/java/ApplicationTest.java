package org.network.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    @DisplayName("Main")
    void mainTest() {
        String[] args = {};

        assertThatCode(() -> Application.main(args))
                .doesNotThrowAnyException();
    }

}
