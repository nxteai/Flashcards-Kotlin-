package flashcards

fun main() {
    // Step 1: Get the number of flashcards to create
    println("Input the number of cards:")
    val numberOfCards = readln().toInt()  // Read and convert the user's input to an integer

    // Create a map to store the cards and their definitions
    val flashcards = mutableMapOf<String, String>()

    // Step 2: Create the flashcards in a loop
    for (n in 1..numberOfCards) {
        // Prompt the user for the term of the card
        println("Card #$n:")  // Print the card number
        val term = readln()  // Read the term (the front of the flashcard)

        // Prompt the user for the definition of the card
        println("The definition for card #$n:")
        val definition = readln()  // Read the definition (the back of the flashcard)

        // Store the term and its corresponding definition in the flashcards map
        flashcards[term] = definition
    }

    // Step 3: Test the user's knowledge of the flashcards
    for ((term, correctDefinition) in flashcards) {
        // Prompt the user to give the definition of the current term
        println("Print the definition of \"$term\":")  // Term is printed in quotes
        val userAnswer = readln()  // Read the user's input

        // Check if the user's answer matches the correct definition
        if (userAnswer == correctDefinition) {
            println("Correct!")  // If the answer is correct
        } else {
            println("Wrong. The right answer is \"$correctDefinition\".")  // If the answer is wrong
        }
    }
}
