package com.kongbig.sparkproject.scala

/**
  * Describe: 品类二次排序key
  * Author:   kongbig
  * Data:     2018/2/9.
  */
class SortKey(val clickCount: Int, val orderCount: Int, val payCount: Int)
  extends Ordered[SortKey] with Serializable {

  override def compare(that: SortKey): Int = {
    if (clickCount - that.clickCount != 0) {
      clickCount - that.clickCount
    } else if (orderCount - that.orderCount != 0) {
      orderCount - that.orderCount
    } else if (payCount - that.payCount != 0) {
      payCount - that.payCount
    } else {
      0
    }
  }

}