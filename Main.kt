class Dog(val name: String,var weight : Int,val breed : String){
    fun bark(){
        println(if(weight<20) "Yay" else "Naa")
    }
}
fun main(){
    var myDog=Dog("Aryan",34,"Bul dog")
    var dogs= arrayOf(Dog("Alok",99,"Black mamal"),Dog("Aryan",99,"Big Dopg"))
    println(dogs[1].weight)
}
