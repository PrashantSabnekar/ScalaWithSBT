package accessmodifiers.packone

class PackageAccessDemo {

  private [accessmodifiers] def packageAccess = println("This function is accessible to package packone")
  //private [packone] def packageAccess = println("This function is accessible to package packone")

}
