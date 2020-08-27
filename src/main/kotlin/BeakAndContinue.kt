fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("inside Loop")
            if (j > 5) break@loop
        }
    }
}