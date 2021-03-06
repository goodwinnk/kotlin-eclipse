// !DIAGNOSTICS: -CONFLICTING_JVM_DECLARATIONS
trait One {
  public open fun foo() : Int
  private fun boo() = 10
}
trait Two {
  public open fun foo() : Int
}

trait OneImpl : One {
  public override fun foo() = 1
}
trait TwoImpl : Two {
  public override fun foo() = 2
}

<!MANY_IMPL_MEMBER_NOT_IMPLEMENTED!>class Test1<!>() : TwoImpl, OneImpl {}
class Test2(a : One) : One by a, Two {}
<!MANY_IMPL_MEMBER_NOT_IMPLEMENTED!>class Test3<!>(a : One, b : Two) : Two by b, One by a {}