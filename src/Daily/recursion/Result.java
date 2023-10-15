//package Daily.recursion;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//    /*
//     * Complete the 'findReviewScore' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. STRING review
//     *  2. STRING_ARRAY prohibitedWords
//     */
//
//    static class Trie{
//
//        final boolean revert;
//        Trie[] children = new Trie[26];
//        boolean eow;
//
//        public Trie(boolean revert){
//            this.revert = revert;
//
//        }
//
//        int match(char[] c , int from, int to){
//            Trie child;
//            Trie[] arr = children;
//
//            for(int i=0;i< to-from;i++){
//                child = arr[c[revert ? to - i-1 : i +from] -'a'];
//                if(child == null)
//                    return 0;
//                if(child.eow){
//                    return i+1;
//
//                }
//                arr =child.children;
//            }
//            return 0;
//        }
//
//        void add(String key){
//            Trie child =null;
//            Trie[] arr = children;
//            char[] chars = key.toCharArray();
//            for(int i=0;i<chars.length;i++){
//                char c= chars[revert ? chars.length - i-1:i];
//                child = arr[c-'a'];
//                if(child == null){
//                    child = new Trie(revert);
//                    arr[c-'a']=child;
//                }
//                arr = child.children;
//            }
//        }
//
//    }
//
//    public static int findReviewScore(String review, List<String> prohibitedWords) {
//        // Write your code here
//
//        Trie revert = new Trie(true);
//        prohibitedWords.forEach(revert::add);
//
//        char[] chars =review.toCharArray();
//
//
//
//        int ans =0;
//        int start =0;
//        int end =1;
//
//
//        while(end <=chars.length){
//            int r = revert.match(chars, start, end);
//            if(r == 0){
//                ans = Math.min(ans,end-start);
//                end++;
//            }else{
//                start = Math.max(start+1,end-r+1);
//                end=start+1;
//            }
//        }
//
//        return ans;
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String review = bufferedReader.readLine();
//
//        int prohibitedWordsCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> prohibitedWords = IntStream.range(0, prohibitedWordsCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        int result = Result.findReviewScore(review, prohibitedWords);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
//
//
//
//import java.util.ArrayList;
//        import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println(longestSubstring("abcd", new String[]{"a", "d"}));
//        System.out.println(longestSubstring("aaaa", new String[]{"ab"}));
//        System.out.println(longestSubstring("abcddefxyz", new String[]{"ac", "de", "xyz"}));
//    }
//
//    public static int longestSubstring(String word, String[] strs) {
//        List<int[]> strIntvls = new ArrayList<>();
//        for (String s : strs) {
//            strIntvls.addAll(findAll(word, s));
//        }
//
//        if (strIntvls.isEmpty()) {
//            return word.length();
//        }
//
//        List<int[]> mIntvls = mergeIntervals(strIntvls);
//        int res = 0;
//
//        for (int i = 0; i < mIntvls.size(); i++) {
//            int curMax;
//            if (i == 0) {
//                curMax = mIntvls.get(i)[0];
//            } else {
//                curMax = mIntvls.get(i)[0] - mIntvls.get(i - 1)[1] - 1;
//            }
//            res = Math.max(res, curMax);
//        }
//
//        return res;
//    }
//
//    public static List<int[]> findAll(String word, String s) {
//        int pos = 0;
//        List<int[]> res = new ArrayList<>();
//        while (pos != -1) {
//            pos = word.indexOf(s, pos);
//            if (pos >= 0) {
//                res.add(new int[]{pos, pos + s.length() - 1});
//                pos += s.length();
//            }
//        }
//        return res;
//    }
//
//    public static List<int[]> mergeIntervals(List<int[]> intvl) {
//        if (intvl.isEmpty()) {
//            return new ArrayList<>();
//        }
//
//        intvl.sort((a, b) -> Integer.compare(a[0], b[0]));
//        List<int[]> res = new ArrayList<>();
//        res.add(intvl.get(0));
//
//        for (int i = 1; i < intvl.size(); i++) {
//            if (res.get(res.size() - 1)[1] < intvl.get(i)[0]) {
//                res.add(intvl.get(i));
//            } else {
//                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], intvl.get(i)[1]);
//            }
//        }
//        return res;
//    }
//}
//
