fun main() {
    names("Angela", "Benjamin")
    numbers(arrayOf(45,67,89,90,34))



}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun names(name1: String, name2: String): String{
    if (name1==name2){
       return name1[1]
} else if (name1 != name2){

}

//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(num: Array<Int>): Int{
    num.max()
        num.min()
      num.average()

}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun say(word: String){
    var sentences = arrayOf(String)

}