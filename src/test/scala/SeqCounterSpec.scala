import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import scala.collection.mutable.Stack
import SeqCounter._

class SeqCounterSpec extends AnyFlatSpec with should.Matchers {

  // RTFM: https://www.scalatest.org/user_guide/writing_your_first_test
  "seqCounter" should "check if every two, three, n numbers in a sequence are followed by their sum" in {
    val listgood = Seq(1, 2, 3, 6, 0, 0, 0, 0, 1, 1, 1, 3)
    seqCounter(listgood, 3) shouldBe true

    val listbad = Seq(1, 2, 3, 5, 0, 0, 0, 1, 1, 1, 1, 4)
    seqCounter(listbad, 3) shouldBe false
  }

  it should "return true for empty list" in {
    val listempty = Seq()
    seqCounter(listempty, 3) shouldBe true
  }
}




