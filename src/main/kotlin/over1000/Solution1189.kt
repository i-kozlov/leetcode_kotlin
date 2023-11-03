package over1000

import other.TreeNode
import kotlin.math.roundToInt

class Solution1189 {

    fun maxNumberOfBalloons(text: String): Int {
        val chars = mutableMapOf<Char, Double>(
            'b' to 0.0,
            'a' to 0.0,
            'l' to 0.0,
            'o' to 0.0,
            'n' to 0.0
        )

        var times = Double.MAX_VALUE
        for(c in text){
            if(c !in chars) continue;

            val add = if(c == 'l' || c == 'o') 0.5 else 1.0
            chars[c] = chars[c]!! + add
        }

        for( (k,v) in chars){
            times = Math.min(times, v)
        }


        return Math.floor(times).toInt()
    }
}
