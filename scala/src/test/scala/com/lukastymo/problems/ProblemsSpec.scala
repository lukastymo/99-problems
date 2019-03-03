package com.lukastymo.problems
import cats.syntax.option._
import com.lukastymo.problems.P_01._
import com.lukastymo.problems.P_02._
import com.lukastymo.problems.P_03._
import eu.timepit.refined.types.numeric.NonNegInt
import org.scalacheck.Prop._
import org.scalacheck.{Properties, _}
import org.scalatest.Matchers
import org.scalatest._

object ProblemsSpec extends Properties("99 Problems") with Matchers {

  property("P_01") = forAll { xs: List[Int] =>
    last(xs) === xs.lastOption
  }

  property("P_02") = forAll { xs: List[Int] =>
    penultimate(xs) === xs.dropRight(1).lastOption
  }

  property("P_03") = forAll { (xs: List[Int], n: NonNegInt) =>
    nth(n, xs) === {
      if (n.value < xs.length) (xs)(n.value).some else None
    }
  }

  implicit lazy val nonNegxIntGen: Arbitrary[NonNegInt] = Arbitrary(
    Gen.chooseNum(0, Int.MaxValue).flatMap(NonNegInt.unsafeFrom)
  )
}
