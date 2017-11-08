package patterns

class Admin extends Role {

  override def canAccess(page: String): Boolean = {
    if(page.equals("Admin")) false
    else true
  }

}
