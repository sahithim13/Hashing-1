/* Grouping Anagrams with Sorting Solution
 * Time Complexity: O(nk)
 * Space Complexity:O(nk)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str : strs){
            double primeP = primeProduct(str);
            if(!map.containsKey(primeP)){
                map.put(primeP, new ArrayList<>());
            }
            map.get(primeP).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    public double primeProduct(String s){
        int [] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        double result = 1;
        for (int i = 0; i<s.length();i++){
            result*= primes[s.charAt(i) - 'a'];
        }
        return result;
    } 
}
