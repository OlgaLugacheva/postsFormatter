import formatter.HtmlFormatter
import models.ConcreteElement

object Main {

	def main(args: Array[String]): Unit = {
		val post = "Obama visited Facebook headquarters: http://bit.ly/xyz @elversatile"
		val objects = List(new ConcreteElement("Entity", 0, 5),
			new ConcreteElement("Entity", 14, 22 ),
			new ConcreteElement("Twitter username", 55, 67 ),
			new ConcreteElement("Link", 37, 54))
		val formatted = new HtmlFormatter().convert(post, objects)
		println(formatted)
	}
}
