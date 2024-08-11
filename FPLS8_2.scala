val categorizingNumber = (x: Int) => {
    if(x % 3 == 0 && x % 5 == 0){
        "Multiple of Both Three and Five"
    }else if(x % 3 == 0){
        "Multiple of Three"
    }else if(x % 5 == 0){
        "Multiple of Five"
    }else{
        "Not a Multiple of Three or Five"
    }
}

@main def ls8q2() = {
    println("Enter an integer: ")
    val number = scala.io.StdIn.readInt()
    println(categorizingNumber(number))
}