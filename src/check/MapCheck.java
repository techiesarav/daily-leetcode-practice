package check;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapCheck {
	
	 public static String  mostCommonWord(String paragraph, String[] banned) {
	        Set<String> bannedWords = new HashSet<String>(Arrays.asList(banned));
	        Predicate<String> checkBanned = inp -> !bannedWords.contains(inp);
	        Map<String,Long> resultMap=Arrays.stream(paragraph.split(" "))
	            .map(input -> input.toLowerCase().trim())
	        .filter(checkBanned)
	        .collect(Collectors.groupingBy(
	                                Function.identity(), Collectors.counting()
	                        ));
	        long largest =0;
	        String res ="";
	        if(resultMap.isEmpty()){
	            return res;
	        }
	        for(String key : resultMap.keySet()){
	            long val = resultMap.get(key);
	            if(val > largest){
	                largest=val;
	                res = key;
	            }
	        }
	        return res;
	        }
	 
	public static void main(String[] args) {
		String[] inpArr = {"a"};
		mostCommonWord("a, a, a, a, b,b,b,c, c"
				, inpArr);
	}

}
