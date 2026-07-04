import java.util.HashMap;

class Solution {
    public int romanToInt(String s) 
    {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        int prevVal = 0; 
        for (char ch : s.toCharArray())
        {
            int currentVal = romanMap.get(ch);
            if (currentVal > prevVal) 
            {
                total += (currentVal - 2 * prevVal);
            } 
            else 
            {
                total += currentVal;
            }
            prevVal = currentVal;
        }
        return total;
    }
}

