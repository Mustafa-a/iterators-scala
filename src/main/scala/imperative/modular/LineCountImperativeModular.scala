package imperative.modular

/**
 * Provides a main method for reading lines and printing line count along with line itself.
 * Depends on a suitable Output provider.
 */
trait CountLines extends Task with Output[(Int, String)] {
  /*handles the run */
  def run(input: Iterator[String]) = {
    var count = 0
    for (line <- input) {
      count += 1
      doOutput((count, line)) // a method call to doOuput instead directly printing to the console
    }
  }
}

/** A concrete main application object. */
object LineCountImperativeModular extends Main[(Int, String)] with CountLines