import java.util.*;
public class java_strings {


    public static boolean palindrome(String str){
        int n = str.length();
        for(int i = 0 ; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
    
    public static float shortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0 ; i<path.length() ; i++){
            char dir = path.charAt(i);
            if(dir == 's'){
                y--;
            }
            else if(dir == 'n'){
                y++;
            }
            else if(dir == 'w'){
                x--;
            }
            else{
                x++;
            }
        }
        int X = x*x;
        int Y = y*y;
        int exp = X+Y;
        return (float)Math.sqrt(exp);
    }
    
    public static String subString(String name, int start , int end){
        String substring = "";
        for(int i = start; i <end ; i++){
            substring +=  name.charAt(i);
        }
        return substring;
        
    }
    // largest with length
    // public static void largestString(String a , String b , String c){
    //     int strA = a.length();
    //     int strB = b.length();
    //     int strC = c.length();
    //     if(strA > strB && strA > strC){
    //         System.out.println("String A is largest");
    //     }
    //     else if(strB > strA && strB > strC){
    //         System.out.println("String B is largest");
    //     }
    //     else{
    //         System.out.println("String C is largest");
    //     }
    // }


    // largest through lexigraphy
    
    public static void lexigraphy(String[] fruits){
        String largest = fruits[0];
        for(int i = 1 ; i < fruits.length ; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }


    // to upper case sentence's first word
    public static String upperCase(String str1){
        StringBuilder sb = new StringBuilder("");
        char ch1 = Character.toUpperCase(str1.charAt(0));
        sb.append(ch1);
        for(int i = 1; i < str1.length(); i++){
            
            if(str1.charAt(i) == ' ' && i < str1.length()-1){
                sb.append(str1.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str1.charAt(i)));
            }
            else{
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }

    // STRING COMPRESSION 

    public static String stringComp(String str2){ 
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str2.length() ; i++){
            int count = 1;
            while(i < str2.length()-1  && str2.charAt(i) == str2.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str2.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    // isLowerCase():

    public static int countlower(String str3){
        int count = 0;
        for(int i = 0 ; i<str3.length() ; i++){
            char ch = str3.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }


    // anagram 

    public static boolean anagram(String str4 , String str5){
        str4 = str4.toLowerCase();
        str5 = str5.toLowerCase();
        char arrayone[] = str4.toCharArray();
        char arraytwo[] = str5.toCharArray();

        Arrays.sort(arrayone);
        Arrays.sort(arraytwo);

        if(Arrays.equals(arrayone,arraytwo)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "mom";
        palindrome(str);
        String path = "wneenesennn";
        System.out.println(shortestPath(path));
        String name = "HelloWorld";
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(subString(name,start,end));
        System.out.println(name.substring(3,6));
        String[] fruits = {"apple","banana","mango"};
        lexigraphy(fruits);

        // to upper case sentence's first word
        String str1 = "hi, i am mohammed faizan ahmed";
        System.out.println(upperCase(str1));

        String str2 = "aabbccddeeffff";
        System.out.println(stringComp(str2));

        String str3 = "ABaeioU";
        System.out.println(countlower(str3));

        String str4 = "Mom";
        String str5 = "omm";
        System.out.println(anagram(str4, str5));
    }
    
    
    
        
       
        
}
