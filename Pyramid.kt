class Structure() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("🍹")
                ++k
            }
            println()
        }
    }
}
class Structure2() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("😃")
                ++k
            }
            println()
        }
    }
}
class Structure3() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("😉")
                ++k
            }
            println()
        }
    }
}
fun main(args: Array<String>) {
    val p = Structure()
    p createPyramid 21 
    // p.createPyramid(4)
    val p2 = Structure2()
    p2 createPyramid 21
    val p3 = Structure3()
    p3 createPyramid 21
}
