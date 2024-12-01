import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert() {
        String expected = "A";
        String actual = converter.convert (100);
        assertEquals (expected, actual);
    }
    @Test
    public void testConvert2() {
        String expected="A";
        String actual  = converter.convert (90);
        assertEquals (expected, actual);
    }
    @Test
    public void testConvert7() {
        String expected="B";
        String actual  = converter.convert (89);
        assertEquals (expected, actual);
    }
    @Test
    public void testConvert3() {
        String expected="B";
        String actual  = converter.convert (80);
        assertEquals (expected, actual);
    }
    @Test
    public void testConvert8() {
        String expected="C";
        String actual  = converter.convert (79);
        assertEquals (expected, actual);
    }
    @Test
    public void testConvert4() {
        String expected="C";
        String actual  = converter.convert (70);
        assertEquals (expected, actual);
    }
    @Test
    public void testConvert5() {
        String expected="D";
        String actual  = converter.convert (59);
    }
    @Test
    public void testConvert9() {
        String expected="D";
        String actual  = converter.convert (50);
    }
    @Test
    public void testConvert6() {
        String expected="E";
        String actual  = converter.convert (49);
        assertEquals (expected, actual);
    }
    @Test
    public void testConvert10() {
        String expected="E";
        String actual  = converter.convert (0);
        assertEquals (expected, actual);
    }
}
}