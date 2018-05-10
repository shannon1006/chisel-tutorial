// See LICENSE.txt for license details.
package problems

import chisel3.iotesters.PeekPokeTester

class CounterTest(c: Counter) extends PeekPokeTester(c) {
  val maxInt  = 7
  var curCnt  = 0

  def intWrapAround(n: Int, max: Int) = 
    if(n > max) 0 else n

  //poke(c.io.inc, 0)
  //poke(c.io.amt, 0)

  // let it spin for a bit
  //for (i <- 0 until 5) {
  //  step(1)
  //}

  for (i <- 0 until 15) {
    //val inc = rnd.nextBoolean()
    //val amt = rnd.nextInt(maxInt)
    val amt = 1
    //poke(c.io.inc, if (inc) 1 else 0)
    //poke(c.io.amt, amt)
    //step(1)
    curCnt = intWrapAround(curCnt + amt, 7)
    //expect(c.io.tot, curCnt)
  }
}
