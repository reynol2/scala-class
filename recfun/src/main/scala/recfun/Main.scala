package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def findClose(chars: List[Char], count: Int): Boolean = {
        if (chars.isEmpty) count == 0
        //        else if (chars.head == ')') true
        else if (chars.head == '(') findClose(chars.tail, count + 1)
        else if (chars.head == ')') count > 0 && findClose(chars.tail, count - 1)
        else findClose(chars.tail, count)
      }
      findClose(chars, 0)
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
