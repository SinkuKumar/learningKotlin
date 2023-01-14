/* 
 * Variables with nullable types
 */
fun main(){
    var name: String? = null
    val length: Int
    length = name?.length ?: 0      // length, If name is null, then length = 0
    //length = name?.length ?:return  // length, If name is null, then return
    //length = name?.length ?: throw NullPointerException("name is null") // length, If name is null, then throw NullPointerException
}

