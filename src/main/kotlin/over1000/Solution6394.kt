package s1000

//Extra Characters in a String
class Solution6394 {

    fun minExtraChar(s: String, dictionary: Array<String>): Int {

        var str = s
        for (word in dictionary) {
            str = str.replace(word, "")
        }

        return str.length
    }
}

fun main() {
    //add examples
    var ans = Solution6394().minExtraChar("abracadabra", arrayOf("abra", "cadabra"))
    println(ans)


    ans = Solution6394().minExtraChar("dwmodizxvvbosxxw",
    arrayOf("ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"))
    println(ans)
}