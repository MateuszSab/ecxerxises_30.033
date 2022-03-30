def nth(ns: List[Int], n: Int): Option[Int] = {
  ns.drop(n).headOption
}

def SeqCounter(ns: List[Int], n: Int): Boolean = {
  val x = ns.take(n)
  if (ns.isEmpty) true
  else if (Option(x.sum) == nth(ns, n)) SeqCounter(ns.drop(n + 1), n)
  else false
}

val listsimple = List(1,2,3)
val listgood = List(1,2,3,6,0,0,0,0,1,1,1,3)
val listbad = List(1,2,3,5,0,0,0,1,1,1,1,4)



SeqCounter(listsimple, 2)
SeqCounter(listgood, 3)
SeqCounter(listbad, 2)