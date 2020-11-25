// 3. Zdefiniuj klasę Osoba z własnościami imie i nazwisko. Stwórz kilka instancji tej klasy. Zdefiniuj funkcję, która
// przyjmuje obiekt klasy osoba i przy pomocy Pattern Matching wybiera i zwraca napis zawierający przywitanie danej
// osoby. Zdefiniuj 2-3 różne przywitania dla konkretnych osób (z określonym imionami lub nazwiskami) oraz jedno
// domyślne.
object Task3 extends App {
  case class Osoba(val imie: String, val nazwisko: String)

  val Daria = new Osoba("Daria", "Olko")
  val Maria = new Osoba("Maria", "Curie-Skłodowska")
  val Jan = new Osoba("Jan", "Kowalski")

  def przywitaj(kogo: Osoba): String = {
    kogo match {
      case Osoba(imie, "Olko") => s"Cześć $imie."
      case Osoba("Jan", nazwisko) => s"Witaj $nazwisko."
      case _ => "Dzień dobry."
    }
  }
  println(przywitaj(Daria))
  println(przywitaj(Maria))
  println(przywitaj(Jan))
}
