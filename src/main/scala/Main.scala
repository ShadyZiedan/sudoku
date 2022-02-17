package dev.sudoko

import SudokuValidator.isValidSudoku

object Main {

  def main(args: Array[String]): Unit = {
    val solution: List[List[Int]] = List(
      List(7, 9, 2, 1, 5, 4, 3, 8, 6),
      List(6, 4, 3, 8, 2, 7, 1, 5, 9),
      List(8, 5, 1, 3, 9, 6, 7, 2, 4),
      List(2, 6, 5, 9, 7, 3, 8, 4, 1),
      List(4, 8, 9, 5, 6, 1, 2, 7, 3),
      List(3, 1, 7, 4, 8, 2, 9, 6, 5),
      List(1, 3, 6, 7, 4, 8, 5, 9, 2),
      List(9, 7, 4, 2, 1, 5, 6, 3, 8),
      List(5, 2, 8, 6, 3, 9, 4, 1, 7)
    )

    val answer = if (isValidSudoku(solution)) "корректно" else "некорректно"
    println(answer)

  }

}
