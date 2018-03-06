object demo2 {
  def doWhile(): Unit = {
    var line = ""
    do {
      println("控制台输入：")
      line = readLine()
      println("控制台输出：" + line)
    } while (line != "")
  }

  def looper(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def main(args: Array[String]): Unit = {
    //    doWhile()
    println(looper(100, 298))
  }

}
