import itv._
import bound.bound_t

/**
 * @author esteffin
 */
object Main {
  def main(args: Array[String]) {

    itv.itv_print(itv_set_top)

    itv.itv_print(itv_mul(new itv_t(bound_t.num(5), bound_t.num(7)), new itv_t(bound_t.num(5), bound_t.num(7))))

    println("HI there!")
  }
}
