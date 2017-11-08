package mongoclient

class MongoClient (val host:String, val port : Int){
  def this() = this("127.0.0.1", 8080)
}
