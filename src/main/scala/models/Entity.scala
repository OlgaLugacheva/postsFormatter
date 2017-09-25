package models


class Entity( val item: String )  extends ElementType{
  override def surroundedItem: String = "<strong>" + item + "</strong>"
}
