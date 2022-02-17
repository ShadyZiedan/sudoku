package dev.sudoko

import scala.annotation.tailrec

object SudokuValidator {

  private def isUnique(l: List[Int]): Boolean = l.distinct.size == l.size

  def isValidSudoku(solution: List[List[Int]]): Boolean = {
    @tailrec
    def _isValid(rows: List[List[Int]]): Boolean = {
      rows match {
        case ::(head, next) =>
          if (isUnique(head)) _isValid(next)
          else false
        case Nil => true
      }
    }

    lazy val squares = {
      val ranges = (0 to 9 by 3).flatMap(i => List(i, i)).tail.init.grouped(2).toList
      ranges.map(_.toList).flatMap { case start :: end :: Nil => solution.flatMap(_.slice(start, end)).grouped(9).toList }
    }
    _isValid(solution) && _isValid(solution.transpose) && _isValid(squares)
  }

}
