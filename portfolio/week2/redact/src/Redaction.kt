// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(
    input: String,
    textToRedact: String,
    replacement: Char = 'X'
): String {
    if (textToRedact.isEmpty()) return input

    val replacementText = replacement.toString().repeat(textToRedact.length)
    return input.replace(textToRedact, replacementText)
}
