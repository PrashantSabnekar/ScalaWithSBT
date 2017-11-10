package traitdemo

trait Animal {

  def hunt : String

  def common : Unit = {
    println("Common functionality ...")
  }

}
