import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import scala.collection.mutable.Stack

class SeqCounterSpec extends AnyFlatSpec with should.Matchers {

  // RTFM: https://www.scalatest.org/user_guide/writing_your_first_test
  "My Great Suite" should "???" in {
    val sC = new seqCounter
    val listgood = List(1, 2, 3, 6, 0, 0, 0, 0, 1, 1, 1, 3)
    val listbad = List(1, 2, 3, 5, 0, 0, 0, 1, 1, 1, 1, 4)
    val listempty = List()
    sC.SeqCounter(listgood, 3) shouldBe true
    sC.SeqCounter(listbad, 3) shouldBe false
    sC.SeqCounter(listempty, 3) shouldBe true
  }
}




