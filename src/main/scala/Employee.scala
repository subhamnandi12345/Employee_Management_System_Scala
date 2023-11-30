import scala.collection.mutable.ListBuffer

case class Employee(Id :Int,name:String,Address:String,Mobile:Long)

object example {
  def main(args: Array[String]): Unit = {
    val empList: ListBuffer[Employee] = ListBuffer.empty[Employee]

    // Function to add an employee
    def addEmployee(employee: Employee): Unit = {
      empList += employee
      println(s"Employee ${employee.name} added successfully.")
    }

    // Function to delete an employee
    def deleteEmployee(employee: Employee): Unit = {
      if (empList.contains(employee)) {
        empList -= employee
        println(s"Employee ${employee.name} deleted successfully.")
      } else {
        println(s"Employee not found.")
      }
    }

    // Function to update an employee
    def updateEmployee(existingEmployee: Employee, updatedEmployee: Employee): Unit = {
      if (empList.contains(existingEmployee)) {
        val index = empList.indexOf(existingEmployee)
        empList.update(index, updatedEmployee)
        println(s"Employee ${existingEmployee.name} updated successfully.")
      } else {
        println(s"Employee not found.")
      }
    }
    def displayEmployee(): Unit = {
      empList.foreach(println)
    }

    val employee1 = Employee(1, "Subham", "Pune", 811624)
    val employee2 = Employee(2, "Chanchal", "Kolkata", 623333)
    val employee3 = Employee(3, "Rohan", "Delhi", 723333)
    addEmployee(employee1)
    addEmployee(employee2)
    addEmployee(employee3)

    displayEmployee()

    val updatedEmployee = Employee(2, "Chanchal", "Chandigarh", 444789)
    updateEmployee(employee2, updatedEmployee)

    displayEmployee()

    deleteEmployee(employee3)
    displayEmployee()
  }
}