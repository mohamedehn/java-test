package fr.wildcodeschool.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if (candidate == null) {
            return null;
        }
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    private static final String UNIQUE_VOWELS = "aeiouyAEIOUY";

    public static String uniqueVowels(String candidate) {
        if (candidate == null) {
            return null;
        }
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (UNIQUE_VOWELS.indexOf(letters[i]) >= 0) {
                if (vowels.indexOf(letters[i]) < 0) {
                    vowels += letters[i];
                }
            }
        }
        return vowels;
    }
}
