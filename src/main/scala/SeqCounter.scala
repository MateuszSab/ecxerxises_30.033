object SeqCounter {

  def seqCounter(ns: Seq[Int], n: Int): Boolean = {

    def nth(ns: Seq[Int], n: Int): Option[Int] = {
      ns.drop(n).headOption
    }

    val x = ns.take(n)
    if (ns.isEmpty) true
    else if (Option(x.sum) == nth(ns, n)) seqCounter(ns.drop(n + 1), n)
    else false
  }
}




