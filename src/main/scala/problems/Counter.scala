// See LICENSE.txt for license details.
package problems

import chisel3._
// import Counter._

// Problem:
//
// Counter should be incremented by the 'amt'
// every clock if 'en' is asserted
//
object Counter {

  def counter(zero: Bool) = {
    val n = RegInit(0.U(3.W))
    Mux(zero, n + 1.U, 0.U)
  }

  // Modify below ----------
  //def counter(zero: Bool): UInt = {
    //val x = RegInit(0.U(3.W))
    //x := wrapAround(x + 1.U, 7.U)
    //x := Mux(zero, x + 1.U, 0)
    //x
  //}
  // Modify above ----------

}

class Counter extends Module {
  val io = IO(new Bundle {
    //val inc = Input(Bool())
    //val amt = Input(UInt(4.W))
    val zero = Input(Bool())
    val tot = Output(UInt(8.W))
  })

  io.tot := Counter.counter(io.zero)

}
