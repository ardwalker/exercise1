package exercise

object Checkout {
  def scan(items: List[String]) = {
    items match {
      case x :: xs if x eq "Apple"  => 60
      case x :: xs if x eq "Orange" => 25
      case _       => 0
    }
  }
}
