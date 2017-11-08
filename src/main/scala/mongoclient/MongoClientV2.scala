package mongoclient

class MongoClientV2(val user : String) extends MongoClient{

  require(user !=null, "Null User")

  def this() = this("Prashnt")
}
