object Hello {
  def main(args: Array[String]): Unit = {
    println("hello world")

    for(arg <- args) println(arg)
  }
}
