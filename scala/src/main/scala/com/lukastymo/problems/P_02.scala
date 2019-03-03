package com.lukastymo.problems

import cats.implicits._

import scala.annotation.tailrec

object P_02 {

  def penultimate[A](xs: List[A]): Option[A] =
    xs match {
      case x :: _ :: Nil => x.some
      case _ :: xs => penultimate(xs)
      case _ => None
    }
}

