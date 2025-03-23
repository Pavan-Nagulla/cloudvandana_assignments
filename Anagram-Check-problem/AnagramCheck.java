import java.util.Arrays;

public class AnagramCheck{

    public static boolean areAnagrams(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        
        //converting string to characters
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are the strings \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagrams(str1, str2));


        String str3 = "hello";
        String str4 = "world";
        System.out.println("Are the strings \"" + str3 + "\" and \"" + str4 + "\" anagrams? " + areAnagrams(str3, str4));


        
    }
}