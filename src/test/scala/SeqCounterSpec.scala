import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import scala.collection.mutable.Stack
import SeqCounter._

class SeqCounterSpec extends AnyFlatSpec with should.Matchers {

  // RTFM: https://www.scalatest.org/user_guide/writing_your_first_test
  "My Great Suite" should "???" in {
    val listgood = Seq(1, 2, 3, 6, 0, 0, 0, 0, 1, 1, 1, 3)
    val listbad = Seq(1, 2, 3, 5, 0, 0, 0, 1, 1, 1, 1, 4)
    val listempty = Seq()
    seqCounter(listgood, 3) shouldBe true
    seqCounter(listbad, 3) shouldBe false
    seqCounter(listempty, 3) shouldBe true
  }
}




