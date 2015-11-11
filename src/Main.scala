import itv._
import bound.bound_t

/**
 * @author esteffin
 */
object Main {
  def main(args: Array[String]) {

    //itv.itv_print(itv_set_top)

    val a = itv_t.interval(3, 3)
    val b = itv_t.interval(1, 2)

    // a - (floor(a / b) * b)

    println("b: " + a)
    println("c: " + b)
    val arg = itv_div(a, itv_abs(b)) //b/|c|
    println("b/c: " + arg)
    println("trunc(b/c): " + itv_trunc(arg))
    val dif = itv_mul(itv_trunc(arg), b) //b/|c|
    println("(floor(b / c) * c): " + dif)
    println("mod(b,c): " + itv_sub(a, dif))

    /*println("b: " + a)
    println("c: " + b)
    val fst = itv_sub(a, itv_abs(b)) // b-|c|
    println("b-|c|: " + fst)
    val arg = itv_div(a, itv_abs(b)) //b/|c|
    println("b/|c|: " + arg)
    println("trunc(b/|c|): " + itv_trunc(arg))
    println("mod(b,c): " + itv_mul(fst, itv_trunc(arg)))*/

    println("or" + itv_mod(a, b))

    println("\nHI there!")
  }
}
