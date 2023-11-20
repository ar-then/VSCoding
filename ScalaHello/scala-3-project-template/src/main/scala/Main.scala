import scala.collection.mutable.ListBuffer


@main def hello: Unit = 
  val sec = List(1,2,3,4,5)
  val arrs = Map(1 -> "one")
  
  println("Hello world!")
  println(msg)
  println(double(List(1000325, 254890)))
  println(sec.intersect(List(3,5,7,9,11)))
  println(sec.sortWith(_ > _))
  println(sec.map(_ * 4))
  println(sec.head)
  println(sec.tail)
  println(sec.take(3))
  println(sec.takeRight(3))
  println(sec.takeWhile(_ < 3))
  println(sec.headOption)
  println(sec.filter(_ >= 4))
  println(sec.init)
def msg = "I was compiled by Scala 3. :)"

def double(ints:List[Int]):List[Int] =
   val buffer: ListBuffer[Int] = new ListBuffer[Int]()
   for i <- ints do
    buffer += i * 2
   buffer.toList



def isTruthy(a: Matchable) = a match
  case 0 | "" => false
  case _ => true


enum Colored:
  case Blue, Green, Red


