/**
 * Created by Colm on 25/04/2016.
 */
import org.scalatest.FunSuite
import Question2.incrementListByOne

class incrementListByOne extends FunSuite {

  test("incrementListByOne test1") {
    val output = incrementListByOne(List(0))
    val expectedOut = List(1)
    assert(output == expectedOut)
  }

  test("incrementListByOne test2") {
    val output = incrementListByOne(List(1,2,3))
    val expectedOutput =List(1,2,4)
    assert(output == expectedOutput)
  }
  test("incrementListByOne test3") {
    val output = incrementListByOne(List(9,9,9))
    val expectedOutput =List(1,0,0,0)
    assert(output == expectedOutput)
  }
}
