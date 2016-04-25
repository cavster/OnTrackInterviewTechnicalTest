import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

/**
 * Created by Colm on 25/04/2016.
 */

object Question1  {

  def f1: Future[Unit] = ???

  def f2: Future[Unit] = ???

  def f3: Future[Unit] = ???

  def f4: Future[Unit] = ???

  val noDependencies = for {
    myf1 <- f1
    myf2 <- f2
    myf3 <- f3
    myf4 <- f4
  } yield (myf1, myf2, myf3, myf4)

  //  f4 depends on f3 which depends on f2 which depends on f1

  val dependentFutures = for {
    myf2 <- Future {
     f1
    }
    myf3 <- Future {
      myf2
    }
    myf4 <- Future {
      myf3
    }
  } yield myf4

//  ­ f4 depends on f3 and f2, and f3 and f2 both depend on f1
  val dependentFutures2 =  for {
    myf2 <- Future {
      f1
    }
    myf3 <- Future {
      f1
    }
    myf4 <- Future {
     // myf3 + myf2 combine bothe futures together
    }
  }yield myf4
}
