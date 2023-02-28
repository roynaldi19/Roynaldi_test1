fun main() {
    for (i in 1..100){
        when{
            i % 15 == 0 -> print("ApaBole, ")
            i % 5 == 0 -> print("Bole, ")
            i % 3 == 0 -> print("Apa, ")
            else -> print("$i, ")

        }
    }
}



