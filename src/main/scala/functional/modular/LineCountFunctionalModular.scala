package functional.modular

/** Reads lines and prints line count along with line itself. */
object LineCountFunctionalModular extends Main[(Int, String)] {

  def run(lines: Iterator[String]): Iterator[(Int, String)] = {
    val counts = Iterator.from(1)
    counts.zip(lines)
  }
}
