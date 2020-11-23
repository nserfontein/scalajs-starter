package starter.webapp

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.ext._
import utest._

object StarterTest extends TestSuite {

  // Initialize App
  StarterApp.setupUI()

  def tests = Tests {
    test("HelloWorld") {
      assert(document.querySelectorAll("p").count(_.textContent == "Hello World") == 1)
    }
    test("ButtonClick") {
      def messageCount = document.querySelectorAll("p").count(_.textContent == "You clicked the button!")

      val button = document.querySelector("button").asInstanceOf[dom.html.Button]
      assert(button != null && button.textContent == "Click me!")

      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }
  }

}
