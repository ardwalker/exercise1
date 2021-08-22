package exercise

sealed abstract class Item(val price: Int) extends Product

object Item {
  case object Apple  extends Item(60)
  case object Orange extends Item(25)
}

