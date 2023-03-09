import java.lang.Math.abs

fun main(args: Array<String>) {

    val arr = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)
    )

    val result = diagonalDifference(arr)

    println(result)
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var firstLine = 0
    var secondLine = 0

    val n = arr.size
    var l = n-1


    for( i in 0..n-1){

        firstLine += arr[i][i]

        secondLine += arr[i][l]
        if(l<=n-1){
            l--
        }
    }

    return abs(firstLine-secondLine)
}