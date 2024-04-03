import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void removeTrailing_NullString_ReturnsNull() {
        assertNull(StringUtils.removeTrailing(null, "abc"));
    }

    @Test
    void removeTrailing_NullSequence_ReturnsOriginal() {
        String actual = (StringUtils.removeTrailing("qwerty", null));
        assertEquals("qwerty", actual);
    }

    @Test
    void removeTrailing_EmptySequence_ReturnsOriginal() {
        String actual = (StringUtils.removeTrailing("qwerty", ""));
        assertEquals("qwerty", actual);
    }

    @Test
    void removeTrailing_Once_RemovesTrailingOnce() {
        String actual = StringUtils.removeTrailing("abcabc", "abc", false);
        assertEquals("abc", actual);
    }

    @Test
    void removeTrailing_Recursive_RemovesAllTrailing() {
        String actual = StringUtils.removeTrailing("abcdefdef", "def", true);
        assertEquals("abc", actual);
    }

    @Test
    void removeTrailing_NumberSequence_RemovesTrailing() {
        String actual = StringUtils.removeTrailing("12341234", "1234", false);
        assertEquals("1234", actual);
    }

    @Test
    void removeTrailing_SymbolsSequence_RemovesAllTrailing() {
        String actual = StringUtils.removeTrailing("abc-def-def!", "-def!", true);
        assertEquals("abc-def", actual);
    }

    @Test
    void removeTrailing_NoMatch_ReturnsOriginal() {
        String actual = StringUtils.removeTrailing("qwerty", "abc", false);
        assertEquals("qwerty", actual);
    }

    @Test
    void removeTrailing_NotTrailing_ReturnsOriginal() {
        String actual = StringUtils.removeTrailing("abcabcxyz", "abc", false);
        assertEquals("abcabcxyz", actual);
    }

}