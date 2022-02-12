package dailyleetcode;

import java.util.LinkedList;
import java.util.*;

public class Main127 {
    class Solution {

        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> dict = new HashSet<>(wordList);
            if(!dict.contains(endWord)) {
                return 0;
            }

            int level=1;
            Queue<String> queue = new LinkedList<>();
            queue.add(beginWord);
            while(!queue.isEmpty()) {
                int size = queue.size();
                while(size-->0) {
                    String word = queue.poll();
                    if(word.equals(endWord)) {
                        return level;
                    }
                    for(int i=0;i<word.length();i++) {
                        for(int ch='a';ch<='z';ch++) {
                            char[] arr = word.toCharArray();
                            if((char)ch!=arr[i]) {
                                arr[i]=(char)ch;
                                String newWord = new String(arr);
                                if(dict.contains(newWord)) {
                                    queue.add(newWord);
                                    dict.remove(newWord);
                                }
                            }
                        }
                    }
                }
                level++;
            }
            return 0;
        }



    }
}
