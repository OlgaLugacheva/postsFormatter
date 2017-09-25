package models

class Username( val item: String) extends ElementType{
  override def surroundedItem: String = "@ <a href= http://twitter.com/" + item.substring(1) + " >" + item.substring(1) + "</a>"
}
