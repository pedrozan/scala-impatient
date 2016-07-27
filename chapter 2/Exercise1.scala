object Exercise1 {
  def main(args: Array[String]) {
    println(returnSigNum(10))
  }

  def returnSigNum(number : Int): Int = {
    number.signum
  }
}
