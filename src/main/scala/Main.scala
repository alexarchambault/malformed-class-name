object Main {
  object B {
    final case class Foo()
  }
  final case class Foo()
  def main(args: Array[String]): Unit = {
    println(Foo().getClass.getName)
    println(Foo().getClass.getSimpleName)
    println(B.Foo().getClass.getName)
    println(B.Foo().getClass.getSimpleName) // throws

    /*

java.lang.InternalError: Malformed class name
  at java.lang.Class.getSimpleName(Class.java:1330)
  at Main$.main(Main.scala:10)
  at Main.main(Main.scala)
  at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
  at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  at java.lang.reflect.Method.invoke(Method.java:498)

     */
  }
}
