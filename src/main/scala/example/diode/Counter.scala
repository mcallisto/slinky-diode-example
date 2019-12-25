package example.diode

import slinky.core.FunctionalComponent
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._

@react object Counter {

  case class Props(counter: Int, updateCounter: Int => Unit)

  val component: FunctionalComponent[Props] = FunctionalComponent[Props] { props =>

    div(
      p(s"Count is ${props.counter}"),
      div(Fragment(
        button(onClick := (_ => props.updateCounter(props.counter + 1)))("Increment"),
        button(onClick := (_ => props.updateCounter(props.counter - 1)))("Decrement"),
        button(onClick := (_ => props.updateCounter(0)))("Reset")
      ))
    )
  }

}
