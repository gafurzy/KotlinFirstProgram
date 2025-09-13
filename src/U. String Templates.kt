fun main(args: Array<String>) {
    val a = 7
    val b = 8
    val c = a + b
    val s = "Kalau dikasi $a dan $b, mako dapatlah $c"
    println(s)
    println("Kalau dikasi $a dan $b, mako dapatlah ${a + b}")
    val price = """
 ${"Rp "}15.000
 """
    println(price)
}