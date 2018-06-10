
class Person {
  var salary:Float = 100000
}
class Department extends Person{//Department class inherits Person class
     var bonus:Int = 5000  
     println("Salary = "+salary) //As it inherits, able to access Salary 
     println("Bonus = "+bonus)  
}  
      
object MainObject{  
   def main(args:Array[String]){  
        new Department()  
    }  
}  