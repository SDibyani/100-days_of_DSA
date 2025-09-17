package HASHMAP;
import java.util.Scanner;
import java.util.HashMap;

public class Calculate_Frequency_Of_Characters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
            
        //remove spaces
        str = str.toLowerCase().replaceAll("\\s+", "");
          
       HashMap<Character, Integer> freqMap = new HashMap<>();

       for(int i=0; i < str.length(); i++){
        char c = str.charAt(i);
        if(freqMap.containsKey(c)){
            freqMap.put(c, freqMap.get(c)+1);
        } else{
            freqMap.put(c,1);
        }
       }

       System.out.println("Character frequencies:");

       //convert keys to array
       Object[] keys = freqMap.keySet().toArray();

       for(int i=0; i< keys.length; i++){
         Character key = (Character) keys[i];  // get key at index i
         System.out.println(key + " ->" + freqMap.get(key));
       }

       sc.close();

    }
    
}
