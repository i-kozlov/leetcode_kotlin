package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.lintcode.com/problem/659/
public class SolutionEncodeDecode {
    private final String symbol = "#";

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        List<String> list = strs.stream().map(word -> word.length() + symbol + word).toList();
        return String.join("", list);
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        var list = new ArrayList<String >();
        var i = 0;
        while (i < str.length()) {
            var j = str.indexOf(symbol, i);
            var len = Integer.parseInt(str.substring(i, j));
            list.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return list;
    }

    public static void main(String[] args) {
        var s = new SolutionEncodeDecode();

        var e = s.encode(Arrays.asList("lint", "code", "love", "you"));
        System.out.println(e);
        System.out.println(s.decode(e));
    }
}