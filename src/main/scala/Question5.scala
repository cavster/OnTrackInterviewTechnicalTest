/**
 * Created by Colm on 25/04/2016.
 */
class Question5 {
  //Provide 2 examples of how you can safely use the string in this option:
  val myStringOption = Some("test")

  val safeMethodOne = myStringOption.getOrElse("")
  myStringOption match {
    case Some(s) => println("access value safely here " + s)
    case None => println("do something about the none")
  }
}
