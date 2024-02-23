fun vulnerableFunction() {
  val password = "password" // Vulnerability - hardcoded password
  if (!password.isNull()) println("null password!")
}

// Code Smell - Empty function
fun emptyFunction() {
}

fun buggyFunction(str: String){
  if (str == "beomtaek"){
    println("Hello beomtaek")
  } else if (str == "goodbye"){
    println("Goodbye!")
  } else if (str == "hello"){ // Bug - Duplicate condition
    println("Hello again!")
  }
}
