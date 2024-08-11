val alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val alphabetLower = "abcdefghijklmnopqrstuvwxyz"

def encrypt(inputText_E: String, n: Int): String = {

    inputText_E.map((c: Char) => {
        
        if(c.isUpper){
            val x = alphabetUpper.indexOf(c)
            alphabetUpper((x + n) % alphabetUpper.size)
        }else if(c.isLower){
            val x = alphabetLower.indexOf(c)
            alphabetLower((x + n) % alphabetLower.size)
        }else{
            c
        }

    })

}

def decrypt(inputText_D: String, n:Int): String = {

    inputText_D.map((c: Char) => {
        
        if(c.isUpper){
            val x = alphabetUpper.indexOf(c)
            alphabetUpper((x - n + alphabetUpper.size) % alphabetUpper.size)
        }else if(c.isLower){
            val x = alphabetLower.indexOf(c)
            alphabetLower((x - n + alphabetLower.size) % alphabetLower.size)
        }else{
            c
        }

    })

}

def ceaserCipher(text: String, n: Int, operation: (String, Int) => String): String = {
    operation(text, n)
}

@main def ls8q1() = {

    print("Shift by: ")
    val n = scala.io.StdIn.readInt()
    
    val inputText_E = scala.io.StdIn.readLine("\nText to encrypt: ")
    val outputText_E = ceaserCipher(inputText_E, n, encrypt)
    println("Encrypted Text: ")
    println(outputText_E)

    val inputText_D = scala.io.StdIn.readLine("\nText to decrypt: ")
    val outputText_D = ceaserCipher(inputText_D, n, decrypt)    
    println("Decrypted Text: ")
    println(outputText_D)

}


