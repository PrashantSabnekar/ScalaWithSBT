package patterns

object RoleTester {

  def getRole(roleName : String) = roleName match {
    case "Root" => new Root
    case "Admin" => new Admin
    case "Analyst" => new Analyst
  }

  def main(args: Array[String]): Unit = {

    val root = getRole("Root")
    println(root.canAccess("Admin"))

    val analyst = getRole("Analyst")
    println(analyst.canAccess("Admin"))
  }

}
