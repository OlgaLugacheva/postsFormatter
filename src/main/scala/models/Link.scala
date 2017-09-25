package models


  class Link( val item: String )  extends ElementType{
    override def surroundedItem: String = "<a href= " + item + " >" + item + "</a>"
  }
