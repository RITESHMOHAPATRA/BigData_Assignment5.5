object Example {
	def main(args: Array[String]): Unit= {

    trait A {
      var x: Int = _
      def action = {
        x = x + 5
      }
    }

    trait B {
      var y: Int = _
      def action = {
        y = y + 1
      }
    }

    class AB extends A with B {//AB class extending traits A and B
     x = 4
     y = 6
     override def action = {
      super[A].action//calling A trait's function action
      super[B].action//calling B trait's function action
     }
    }

    var ab = new AB
    ab.action
    println("x value = "+ab.x)
    println("y value = "+ab.y)
  }
}