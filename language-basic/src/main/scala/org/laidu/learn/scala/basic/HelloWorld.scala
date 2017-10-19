package org.laidu.learn.scala.basic

class People(_name: String, _sex: String) {
  var name: String = _name
  var sex: String = _sex
}

object MainApp {
  def main(args: Array[String]): Unit = {

    var people = new People("xiaoming", "man")

    println(people)
    println("hello world")
  }
}
