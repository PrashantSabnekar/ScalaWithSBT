package files

import java.io.{File, PrintWriter}
import scala.io.Source

class FileOperations {

  def callFromjava() = {
    "This is called from java"
  }
}

object FileOperations {

  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("Test.txt"))
    writer.write("Hello file\n")
    writer.write("Line 1\n")
    writer.write("Line 2\n")
    writer.write("Line 3\n")
    writer.close()

    Source.fromFile("Test.txt").getLines().foreach( x => println(x) )

    println("**************")

    val lines : List[String] = Source.fromFile("Test.txt").getLines().toList
    for(line <- lines) {
      println(line)
    }
  }
}
