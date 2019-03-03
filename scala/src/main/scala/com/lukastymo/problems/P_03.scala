package com.lukastymo.problems

import eu.timepit.refined.types.numeric.NonNegInt

object P_03 {
  val zero = NonNegInt(0)

  def nth[A](n: NonNegInt, xs: List[A]): Option[A] =
    (xs, n) match {
      case (x :: _, `zero`) => Some(x)
      case (_ :: ys, nn)    => nth(NonNegInt.unsafeFrom(nn.value - 1), ys)
      case (Nil, _)         => None
    }
}
