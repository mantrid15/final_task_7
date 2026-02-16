import scala.io.StdIn.readLine

object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
//    var result = List[String]()
//    for (str <- strings) {
//      if (str.length > 3) {   // выбираем короче трех символов
//        result = result :+ str.toUpperCase // преобразуем оставшиеся строки в верхний регистр в цикле
//      }
//    }
//    result
    //  ФУНКЦИОНАЛЬНОЕ РЕШЕНИЕ:
    //  Используем filter вместо цикла с условием
    //  Используем map вместо ручного добавления в result
    //  Композиция функций через цепочку вызовов
    //  Иммутабельность - не создаем и не изменяем переменные
    strings
      .filter(str => str.length > 3) // Оставляем  строки длиннее 3 символов
      .map(str => str.toUpperCase) // Преобразуем оставшиеся строки в верхний регистр


  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
