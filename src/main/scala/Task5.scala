//5. Zdefiniuj klasę Osoba i trzy traity: Student, Nauczyciel, Pracownik. Osoba powinna mieć własności read only: imie,
// nazwisko, podatek. Pracownik powinien mieć własność pensja (z getterem i seterem). Student i Pracownik powinni
// przesłaniać własność podatek – dla Studenta zwracamy 0, dla Pracownika 20% pensji. Nauczyciel powinien dziedziczyć
// z Pracownika, dla niego podatek zwraca 10% pensji. Stwórz obiekty z każdym z traitów, pokaż jak podatek działa dla
// każdego z nich. Stwórz obiekty z traitami Student i Pracownik, pokaż jak podatek zadziała w zależności od kolejności
// w jakiej te traity zostały dodane przy tworzeniu obiektu.
object Task5 extends App {
  class Osoba(private var _imie: String, private var _nazwisko: String, private var _podatek: Double) {
    def imie: String = _imie
    def nazwisko: String = _nazwisko
    def podatek: Double = _podatek
  }
  trait Student extends Osoba {
    override def podatek: Double = 0
  }
  trait Nauczyciel extends Pracownik {
    override def podatek: Double = 0.1 * pensja
  }
  trait Pracownik extends Osoba {
    var pensja: Int = 0

    override def podatek: Double = 0.2 * pensja
  }

  val student = new Osoba("Jan", "Kowalski", 20) with Student
  val nauczyciel = new Osoba("Marta", "Kamińska", 40) with Nauczyciel
  nauczyciel.pensja = 1000
  val pracownik = new Osoba("Janusz", "Polkowicz", 30) with Pracownik
  pracownik.pensja = 1100

  println(student.podatek, nauczyciel.podatek, pracownik.podatek)

  val pracownikoStudent = new Osoba("Mateusz", "Knopers", 40) with Student with Pracownik
  pracownikoStudent.pensja = 950
  val studentoPracownik = new Osoba("Jan", "Kamiński", 10) with Pracownik with Student
  studentoPracownik.pensja = 900

  println(pracownikoStudent.podatek, studentoPracownik.podatek)
}
