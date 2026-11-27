
import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (words.length == 0 || s.length() == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen) {
            return result;
        }

        // Store frequency of each word
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Try each possible starting offset
        for (int i = 0; i < wordLen; i++) {

            int left = i;
            int count = 0;

            Map<String, Integer> seen = new HashMap<>();

            for (int right = i; right + wordLen <= s.length();
                 right += wordLen) {

                String word = s.substring(right, right + wordLen);

                // Word is not present in words
                if (!wordMap.containsKey(word)) {
                    seen.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                seen.put(word, seen.getOrDefault(word, 0) + 1);
                count++;

                // Remove extra occurrences
                while (seen.get(word) > wordMap.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);

                    seen.put(leftWord, seen.get(leftWord) - 1);

                    left += wordLen;
                    count--;
                }

                // All words matched
                if (count == wordCount) {
                    result.add(left);

                    String leftWord = s.substring(left, left + wordLen);

                    seen.put(leftWord, seen.get(leftWord) - 1);

                    left += wordLen;
                    count--;
                }
            }
        }

        return result;
    }
}
