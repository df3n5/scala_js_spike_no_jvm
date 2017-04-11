package tutorial.webapp

import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSImport

@JSImport("left-pad", JSImport.Namespace)
@js.native
object LeftPad extends js.Object {
  def apply(str: String, n: Int): String = js.native
}

object TutorialApp extends JSApp {
  def main(): Unit = {
    println(LeftPad("123", 5))
  }
}
