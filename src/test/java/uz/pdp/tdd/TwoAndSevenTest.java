package uz.pdp.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TwoAndSevenTest {
    TwoAndSeven twoAndSeven;

    @BeforeEach
    void setUp() {
        twoAndSeven = new TwoAndSeven();
    }

    @Test
    void testForNotNullValues() {
        twoAndSeven.convert(1);
    }

    @Test
    void testForTwo() {
        assertEquals("Two", twoAndSeven.convert(22));
    }

    @Test
    void testForSeven() {
        assertEquals("Seven", twoAndSeven.convert(49));
    }

    @Test
    void testForTwoAndSeven() {
        assertEquals("TwoAndSeven", twoAndSeven.convert(140));
    }
    @ParameterizedTest(name = "{displayName} => {index} : {arguments}")
    @CsvFileSource(resources = "/source.csv", useHeadersInDisplayName = true)
    void testForTwoAndSevenWithCvsFile(int a, String expected) {
        assertEquals(expected, twoAndSeven.convert(a));
    }
}
