package exercise

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CheckoutSpec extends AnyFlatSpec with Matchers {
  "It" should "scan no items" in {
    Checkout.scan(List()) shouldEqual 0
  }

  "It" should "scan an apple" in {
    Checkout.scan(List("Apple")) shouldEqual 60
  }

  "It" should "scan an orange" in {
    Checkout.scan(List("Orange")) shouldEqual 25
  }

}
