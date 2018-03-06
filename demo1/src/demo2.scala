object demo2 {
  /**
    * 显示控制台输入方法
    */
  def doWhile(): Unit = {
    var line = ""
    do {
      println("控制台输入：")
      line = readLine()
      println("控制台输出：" + line)
    } while (line != "exit")
  }

  /**
    * 求y除以x的整数部分
    *
    * @param x
    * @param y
    */
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

  /**
    * tuple
    */
  def tupleDemo(): Unit = {
    val triple = (100, "spark", "scala")
    println(triple._1)
    println(triple._2)
    println(triple._3)
  }

  /**
    * Array
    */
  def arraryDemo(): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    //    for (i <- 0 until arr.length){
    //      println(arr(i))
    //    }
    //简化
    for (i <- arr) {
      println(i)
    }
  }

  /**
    * Map
    */
  def mapDemo(): Unit = {
    val ages = Map("tom" -> 29, "jack" -> 25)
    for ((k, v) <- ages) println(k + ":" + v)
    for ((k, _) <- ages) println("key=" + k)
  }

  /**
    * 主函数
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //调用显示控制台输入方法
    //    doWhile()

    //调用求y除以x的整数部分
    //    println(looper(100, 298))

    //scala的判断
    //    var str="scala变量"
    //    if(!args.isEmpty) str=args(0)
    //    println(str)
    //简化
    //    println(if (!args.isEmpty) args(0) else "scala变量")

    //调用tuple
    //    tupleDemo()

    //调用arrary
    //    arraryDemo()

    //调用map
    mapDemo()


  }

}
