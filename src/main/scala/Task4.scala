//4. Zdefiniuj funkcję przyjmującą dwa parametry - wartość całkowitą i funkcję operującą na wartości całkowitej.
// Zastosuj przekazaną jako parametr funkcję trzykrotnie do wartości całkowitej i zwróć wynik.
object Task4 extends App {
  def trzykroć(wartość: Int, funkcja: Function[Int, Int]): Int = funkcja(funkcja(funkcja(wartość)))

  def pomnóżPrzezDwa(wartość: Int): Int = wartość*2

  println(trzykroć(1, pomnóżPrzezDwa))
}
