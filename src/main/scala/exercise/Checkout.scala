package exercise

object Checkout {
  def scan(items: List[Item]) = items.map(_.price).sum
}
