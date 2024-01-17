package fr.wildcodeschool.test;

import fr.wildcodeschool.unittesting.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // ALL VOWELS TEST
    @Test
    public void shouldReturnVowels(){
        String vowels = StringUtils.vowels("xzyyyyyy");
        assertEquals("yyyyyy", vowels);
        System.out.println("vowels=" + vowels);
    }
    @Test
    public void shouldThrowException(){
        String vowels = StringUtils.vowels(null);
        assertNull(vowels);
        System.out.println("vowels=" + vowels);
    }
    @Test
    public void testVowelsContract() {
        String vowels = StringUtils.vowels("aeiouyAEIOUY");
        assertEquals("aeiouyAEIOUY", vowels);

        vowels = StringUtils.vowels("aeiouyAEIOUY");
        assertEquals("aeiouyAEIOUY", vowels);
        System.out.println("vowels=" + vowels);
    }

    // UNIQUE VOWELS TEST
    @Test
    public void shouldReturnUniqueVowels(){
        String uniqueVowels = StringUtils.uniqueVowels("xzyaeiiiiii");
        assertEquals("yaei", uniqueVowels);
        System.out.println("uniqueVowels=" + uniqueVowels);
    }

    @Test
    public void shouldThrowExceptionUniqueVowels(){
        String uniqueVowels = StringUtils.uniqueVowels(null);
        assertNull(uniqueVowels);
        System.out.println("uniqueVowels=" + uniqueVowels);
    }

    @Test
    public void testUniqueVowelsContract() {
        String uniqueVowels = StringUtils.uniqueVowels("aeiouyAEIOUYYYY");
        assertEquals("aeiouyAEIOUY", uniqueVowels);

        uniqueVowels = StringUtils.uniqueVowels("aeiouyAEIOUYYYY");
        assertEquals("aeiouyAEIOUY", uniqueVowels);
        System.out.println("uniqueVowels=" + uniqueVowels);
    }
}
