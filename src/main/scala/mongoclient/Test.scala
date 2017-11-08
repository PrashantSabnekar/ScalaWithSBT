package mongoclient

object Test {

  def main(args: Array[String]): Unit = {

    val mongoClient = new MongoClient()
    println("host: " + mongoClient.host + " port:" + mongoClient.port)

    val mongoClientV2 = new MongoClientV2()
    println("host: " + mongoClient.host + " port:" + mongoClient.port + " user:" + mongoClientV2.user)

  }

}
