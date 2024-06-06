public class Anagrams {

    public static void main(String[] args) {
        System.out.println(isAnagram("aab", "baa"));
        System.out.println(isAnagram("dog", "god"));
        System.out.println(isAnagram("hello", "goodbye"));

    }

    private static boolean isAnagram(String str1, String str2) {
        int count[] = new int[256];

        for(int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;

        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                return false;

            }

        }

        return true;

    }

}