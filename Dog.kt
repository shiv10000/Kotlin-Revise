class Dog(var name : String,var weight : Int, breed_param: String){
    var activities = arrayOf("Walks")
    val breed=breed_param.uppercase()
    init {
        println("Dog $name has been initialized")
    }

}
fun main(){

}