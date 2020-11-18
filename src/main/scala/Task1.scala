// 1. Wykorzystaj Pattern Matching w funkcji przyjmującej parametr typu String. Dla stringów odpowiadających nazwom
// dni tygodnia funkcja ma zwrócić „Praca” i „Weekend” (odpowiednio dla dni roboczych i wolnych), dla pozostałych
// napisów „Nie ma takiego dnia”.
object Task1 extends App {
  def coto(dzien : String): String =
    dzien match {
      case "poniedziałek" => "praca"
      case "wtorek" => "praca"
      case "środa" => "praca"
      case "czwartek" => "praca"
      case "piątek" => "praca"
      case "sobota" => "weekend"
      case "niedziela" => "weekend"
      case _ => "nie ma takiego dnia"
    }

  println(coto("wtorek"))
}