package exercise

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CheckoutSpec extends AnyFlatSpec with Matchers {
  "Checkout" should "scan no items" in {
    Checkout.scan(List()) shouldEqual 0
  }
}
