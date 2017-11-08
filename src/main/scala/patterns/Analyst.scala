package patterns

class Analyst extends Role {

  override def canAccess(page: String): Boolean = false

}
