//19000057
//Q4

object q4 extends App{
  def findEven (n:Int):Unit = {
    if (n == 0) println("even")
    else if (n == 1) println("odd")
    else findEven(n - 2)
  }

  findEven(4)
}
