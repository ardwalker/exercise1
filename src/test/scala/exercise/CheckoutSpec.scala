package exercise

import exercise.Item.{Apple, Orange}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CheckoutSpec extends AnyFlatSpec with Matchers {
  "It" should "scan no items" in {
    Checkout.scan(List()) shouldEqual 0
  }

  "It" should "scan an apple" in {
    Checkout.scan(List(Apple)) shouldEqual 60
  }

  "It" should "scan an orange" in {
    Checkout.scan(List(Orange)) shouldEqual 25
  }

  "It" should "scan 2 apples now on buy one get one free offer" in {
    Checkout.scan(List(Apple,Apple)) shouldEqual 60
  }

  "It" should "scan 2 oranges" in {
    Checkout.scan(List(Orange,Orange)) shouldEqual 50
  }

  "It" should "scan apples and oranges" in {
    Checkout.scan(List(Apple,Orange)) shouldEqual 85
  }

  "It" should "scan apples on buy one get one free offer and an orange" in {
    Checkout.scan(List(Apple,Apple,Orange)) shouldEqual 85
  }

}
