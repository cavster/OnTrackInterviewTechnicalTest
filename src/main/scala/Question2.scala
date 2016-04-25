/**
 * Created by Colm on 25/04/2016.
 */
object Question2 {
def incrementListByOne(list:List[Int]):List[Int] ={

 val listAsStringCombined = list.mkString("")
  val listPlusOne = listAsStringCombined.toInt + 1
  listPlusOne.toString.map(_.asDigit).toList
}
}
