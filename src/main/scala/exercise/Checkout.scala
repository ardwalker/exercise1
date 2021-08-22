package exercise

import exercise.Item.{Apple, Orange}

object Checkout {
  def scan(items: List[Item]) = {
    val applePrice = items.filter(_ == Apple).sliding(1,2).flatten.map(_.price).sum
    val orangePrice = items.filter(_ == Orange).map(_.price).sum
    applePrice + orangePrice
  }
}
