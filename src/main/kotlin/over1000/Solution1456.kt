package over1000

class Solution1456 {

    fun maxVowels(s: String, k: Int): Int {
        var (L, R) =  0 to 0
        var maxVowels = 0
        var vowels = 0
        while(R < k){
            val c = s[R++]
            if(isVowel(c)){
                vowels++
            }
        }

        while(L < s.length - k) {
            if(vowels == k) return k;


            if(isVowel(s[L++])){
                vowels--
            }

            if(isVowel(s[R++])){
                vowels++
            }
            maxVowels = Math.max(maxVowels, vowels)
        }


        return maxVowels
    }

    private fun isVowel(c : Char) : Boolean{
        val set = setOf('a', 'e', 'i', 'o', 'u')
        return c in set
    }
}
