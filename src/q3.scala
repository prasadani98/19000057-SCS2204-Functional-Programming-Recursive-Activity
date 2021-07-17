//19000057
//Q3

object q3 extends App{
  def sum(n:Int): Int ={
    if(n<=1){
       n
    }
    else{
       n+sum(n-1)
    }
  }
  println(sum(5))
}
