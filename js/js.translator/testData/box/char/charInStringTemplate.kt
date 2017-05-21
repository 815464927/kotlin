package foo

fun box(): String {
    val name = run { "John" }        // Force compiler to actually do some concatenation
    assertEquals("${'$'}name = $name", "\$name = John")

    val ch1: Char? = null
    assertEquals("${ch1}name = $name", "nullname = John")

    val ch2: Char? = '$'
    assertEquals("${ch2}name = $name", "\$name = John")

    return "OK"
}