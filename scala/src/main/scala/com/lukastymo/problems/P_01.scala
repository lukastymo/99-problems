package com.lukastymo.problems
import cats.implicits._
import scala.annotation.tailrec

object P_01 {

  @tailrec
  def last[A](xs: List[A]): Option[A] =
    xs match {
      case x :: Nil => x.some
      case _ :: xs => last(xs)
      case Nil => None
    }
}

