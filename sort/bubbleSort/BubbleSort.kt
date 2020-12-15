fun bubbleSort(numbers: Array<Int>) {
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble sort
        for (currentPosition in 0 until (numbers.size - pass - 1)) {
            // This is a single step
            if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                numbers[currentPosition] = numbers[currentPosition + 1].also { 
                    numbers[currentPosition + 1] = numbers[currentPosition] 
                }
            }
        }
    }
}

fun printArray(array: Array<Int>) {
    for ((i, e) in array.withIndex()) {
    	print("[$i] = $e ")
	}
    println()
}

fun main() {
    val array = arrayOf<Int>(5,2,3,1,6,8)
    printArray(array)
    
    bubbleSort(array)
    printArray(array)
}
