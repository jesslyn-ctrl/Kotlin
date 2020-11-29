package DataClass_dan_Collections

/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
        "type" to "Motorcycle",
        "maxSpeed" to "230Km/s",
        "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle["type"]
    val maxSpeed = vehicle.getValue("maxSpeed")
    val maxTank = vehicle.get("maxTank")

    // TODO 3
    println("Vehicle\n" +
            "Type: $type\n" +
            "Maximal Speed: $maxSpeed\n" +
            "Maximal Tank: $maxTank")
}