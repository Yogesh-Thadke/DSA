class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;

        if(!word.matches("[a-zA-Z0-9]+")) return false;

        boolean containsVovel = word.matches(".*(?i)[aeiou].*");
        boolean containsConsonent = word.matches(".*(?i)[b-df-hj-np-tv-z].*");

        return containsVovel && containsConsonent;

    }
}