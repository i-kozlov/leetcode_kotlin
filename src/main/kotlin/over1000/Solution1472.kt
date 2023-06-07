package s1000

class Solution1472 {

    class BrowserHistory(homepage: String) {
        private var current: ListNode = ListNode(homepage)

        fun visit(url: String) {
            val visited = ListNode(url)
            visited.prev = current

            current.next = visited
            current = visited
        }

        fun back(steps: Int): String {
            var i = 0
            while (i < steps && current.prev != null) {
                current = current.prev!!
                i++
            }

            return current.url
        }

        fun forward(steps: Int): String {
            var i = 0
            while (i < steps && current.next != null) {
                current = current.next!!
                i++
            }

            return current.url
        }

        class ListNode(var url: String) {
            var next: ListNode? = null
            var prev: ListNode? = null
            override fun toString(): String {
                return "other.ListNode(url='$url', next=${next?.url}, prev=${prev?.url})"
            }

        }

    }
}

fun main() {
    val browserHistory = Solution1472.BrowserHistory("leetcode.com")
    browserHistory.visit("google.com")       // You are in "leetcode.com". Visit "google.com"
    browserHistory.visit("facebook.com")     // You are in "google.com". Visit "facebook.com"
    browserHistory.visit("youtube.com")      // You are in "facebook.com". Visit "youtube.com"
    println(browserHistory.back(1))                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
    println(browserHistory.back(1))                   // You are in "facebook.com", move back to "google.com" return "google.com"
    println(browserHistory.forward(1))                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
    browserHistory.visit("linkedin.com")     // You are in "facebook.com". Visit "linkedin.com"
    println(browserHistory.forward(2))                // You are in "linkedin.com", you cannot move forward any steps.
    println(browserHistory.back(2))                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
    println(browserHistory.back(7))                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
}