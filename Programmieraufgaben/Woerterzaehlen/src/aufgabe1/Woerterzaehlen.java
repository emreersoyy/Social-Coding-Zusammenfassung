package aufgabe1;


import java.util.HashMap;



public class Woerterzaehlen {
	
	 String text = "No,no,no I kill the bus driver";
     
     String[] words = text.split(" ");
     HashMap <String, Integer> wordMap = new HashMap<String, Integer> ();{ // word | anzahl
     
     for(int i=0;i<words.length;++i){
         if(!wordMap.containsKey(words[i])){
             wordMap.put(words[i], 1);
         }
         else{
             wordMap.put(words[i],wordMap.get(words[i])+1);
         }
     }
     
     System.out.println(wordMap);
    }
}