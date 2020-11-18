// 2. Zdefiniuj klasę KontoBankowe z metodami wplata i wyplata oraz własnością stanKonta - własność ma być tylko do
// odczytu. Klasa powinna udostępniać konstruktor przyjmujący początkowy stan konta oraz drugi, ustawiający początkowy
// stan konta na 0.
object Task2 extends App {
  case class KontoBankowe (_początkowyStanKonta: Int) {
    def this() {
      this(0);
    }
    def wplata(ile: Int): Unit = {
      _stanKonta += ile
    }
    def wyplata(ile: Int): Unit = {
      _stanKonta -= ile
    }
    private var _stanKonta = _początkowyStanKonta
    def stanKonta: Int = _stanKonta
  }

  new KontoBankowe();
  var konto2 = KontoBankowe(2);
}
