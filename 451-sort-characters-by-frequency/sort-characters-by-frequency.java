class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map= new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>>maxHeap=new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        StringBuilder sb=new StringBuilder();

        // loop through all the string and 
        // set all the occurence
        for(Character alphabet:s.toCharArray()){
            map.put(alphabet,map.getOrDefault(alphabet,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            maxHeap.add(entry);
        }

        while(!maxHeap.isEmpty()){
            System.out.println("peekHeap "+maxHeap);
            Map.Entry<Character,Integer> currentVariable=maxHeap.poll();

            sb.append(String.valueOf(currentVariable.getKey()).repeat(currentVariable.getValue()));
        }



        return sb.toString();
    }
}