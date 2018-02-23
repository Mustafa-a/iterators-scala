package imperative.modular

trait calculateAverage extends Task with Output[Double]{
  def run(input: Iterator[String]): Unit = {
    var count = 0
    var sum = 0d
    for(value <- input){
      sum += value.toDouble
      count += 1
      doOutput(sum/count)
    }
  }
}


object CumulativeAverage extends Main[Double] with calculateAverage