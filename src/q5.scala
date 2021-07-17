//19000057
//Q5

object q5 extends App{

  def addition(n:Int):Int={
    if(n>=2 && n%2==0)
        n-2 + addition(n-2)
    else if(n>2 && n%2==1)
        n-1+addition(n-2)
    else
      0
  }
  print(addition(4))
}
