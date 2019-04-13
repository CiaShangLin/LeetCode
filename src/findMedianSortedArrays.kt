class findMedianSortedArrays {
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    //兩個陣列都是以排序好的 所以只要兩個同時比對 小的加入陣列裡面就好了 最後如果有剩下的就全部加進去
    var list = mutableListOf<Int>()
    var i: Int = 0
    var j: Int = 0
    while (i < nums1.size && j < nums2.size) {
        if (nums1[i] < nums2[j]) {
            list.add(nums1[i++])
        } else {
            list.add(nums2[j++])
        }
    }
    if (i < nums1.size) {
        for (index in i..nums1.size - 1) {
            list.add(nums1[index])
        }
    }
    if (j < nums2.size) {
        for (index in j..nums2.size - 1) {
            list.add(nums2[index])
        }
    }

    var size = list.size

    if (size % 2 != 0) {
        return list[size / 2].toDouble()
    }
    return ((list[size / 2] + list[size / 2 - 1]) / 2.0).toDouble()

}