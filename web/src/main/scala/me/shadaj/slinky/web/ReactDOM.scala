package me.shadaj.slinky.web

import me.shadaj.slinky.core.facade.{React, ReactElement, ReactInstance}
import org.scalajs.dom.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("react-dom", JSImport.Namespace, "ReactDOM")
object ReactDOM extends js.Object {
  def render(component: ReactElement, target: Element): ReactInstance = js.native
  def findDOMNode(instance: React.Component): Element = js.native
}
