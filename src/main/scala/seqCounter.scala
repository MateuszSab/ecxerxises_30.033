class seqCounter {

  def nth(ns: List[Int], n: Int): Option[Int] = {
    ns.drop(n).headOption
  }

  def SeqCounter(ns: List[Int], n: Int): Boolean = {
    val x = ns.take(n)
    if (ns.isEmpty) true
    else if (Option(x.sum) == nth(ns, n)) SeqCounter(ns.drop(n + 1), n)
    else false
  }
}




