package formatter

import models.{ConcreteElement, Entity, Link, Username}

class HtmlFormatter {
  def convert(post: String, listOfElements: List[ConcreteElement]): String = {
    val stringBuffer = new StringBuffer(post)
    val elements = listOfElements.sortWith(_.end > _.start).foreach(x => {
      stringBuffer.replace(x.start, x.end, Element(stringBuffer.substring(x.start, x.end), x.elementType))
    })
    return stringBuffer.toString()
  }
}

object Element {
  def apply( baseText: String, element:  String): String =
    element match {
      case "Entity" => new Entity(baseText).surroundedItem
      case "Link" => new Link(baseText).surroundedItem
      case "Twitter username" => new Username(baseText).surroundedItem

    }
}

