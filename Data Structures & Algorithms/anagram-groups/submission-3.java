public class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        // In Java, we use ArrayList or LinkedList for List implementation
        List<String> stringstocheck0 = new ArrayList<String>(); 	
        Map<String, List<String>> Mapstringvsalphabets = new HashMap<String, List<String>>();
        Map<String, List<String>> finalResult = new HashMap<String, List<String>>();
        List<List<String>> finalResultList = new ArrayList<>();
        List<String> splittedstring = new ArrayList<String>();
        String sortedstring = "";

        for (int i = 0; i < strs.length; i++) {
            //"act"
            // Note: In Java, stringstocheck0 is a List, but you are assigning a String from strs[i]
            // To maintain your logic exactly, we wrap the string in a list or fix the assignment
            String currentStr = strs[i]; 
            
            // Java Strings don't have a .sort() method; we convert to char array to sort
            char[] tempArray = currentStr.toCharArray();
            Arrays.sort(tempArray);
            sortedstring = new String(tempArray);
            
            // Simulating your .split(',') logic
            splittedstring = Arrays.asList(sortedstring.split("")); 

            if (Mapstringvsalphabets.containsKey(sortedstring)) {
                // To keep your logic of finalResult.put(string, string)
                // Java Maps need the List initialized to add items
                finalResult.get(sortedstring).add(currentStr);
            } else {
                Mapstringvsalphabets.put(sortedstring, splittedstring);
                List<String> newList = new ArrayList<>();
                newList.add(currentStr);
                finalResult.put(sortedstring, newList);
            }
        }

        for (List<String> str : finalResult.values()) {
            finalResultList.add(str);
        }
        
        return finalResultList;
    }
}