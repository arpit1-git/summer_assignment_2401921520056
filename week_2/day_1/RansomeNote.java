package week_2.day_1;

public class RansomeNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[256];
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']--;
            if (freq[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
    

