import scala.annotation.tailrec

object SeqCounter {

  @tailrec
  def seqCounter(ns: Seq[Int], n: Int): Boolean = {

    def nth(ns: Seq[Int], n: Int): Option[Int] = {
      ns.drop(n).headOption
    }

    if (ns.isEmpty) true
    else if (nth(ns, n).contains(ns.take(n).sum)) seqCounter(ns.drop(n + 1), n)
    else false
  }
}




