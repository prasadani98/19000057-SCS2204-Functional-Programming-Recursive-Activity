//19000057
//Q2

object q2 extends App{
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case _ => GCD(b,a%b)
  }

  def prime(p:Int,n:Int=2):Int= n match {
    case x if p==1 => 0
    case x if x==p => 1
    case x if GCD(p,x)>1 => 0
    case x => prime(p,x+1)
  }
  def primeSeq(n:Int,i:Int=1):Unit={
    if(i<=n) {
      if(prime(i)==1) {
        print(i +", ")
        primeSeq(n,i+1)
      }
      else
        primeSeq(n,i+1)
    }
  }
  primeSeq(10)
}
