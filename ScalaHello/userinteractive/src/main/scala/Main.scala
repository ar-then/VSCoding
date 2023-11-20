import scala.io.StdIn.readLine

@main def helloInteractive() =
   val names = List("chris", "ed", "maurice")
   val capNames = for name <- names yield name.capitalize
   val fruits = List("lime", "apple", "orange")
   val fruitsLength = for f <- fruits yield f.length()


   println(interactiveUser("alexium"))
   Printer()
   tryExceptions()
   println(capNames)
   println(fruitsLength)
   println(getClassAsString(List(5,6,7,8)))
   println(getClassAsString(names))
   println(getClassAsString(1))
   println(getClassAsString("Sasha"))


def getClassAsString(x: Matchable): String = x match
  case s: String => s"$s is a string"
  case i: Int => s"$i is an integer"
  case l: List[?] => s"$l is a list"
  case _ => "unknown"

def tryExceptions(): Unit =
  try 
    val result = 3 / 0
  catch
    case e: ArithmeticException => println("Error: Division by zero")
    case _ => println("Unknown error")

def Printer(): Unit =
  for 
    i <- 1 to 3
    j <- 'a' to 'c'    
  do
    println(s"i = $i, j = $j")

def interactiveUser(user:String): String =
  println(s"Enter your name, $user")
  val name = readLine()
  s"Your name is $name"