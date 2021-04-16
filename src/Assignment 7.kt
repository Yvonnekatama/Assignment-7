fun main(){
 number()
    println(namesArray("Yvonne","Mnyazi","katy"))
    decisions(4)
    decisions(10)
    decisions(12)
    numberRange()
}

fun number(){
    for(num in 1..100){
        if(num%2!=0)
            println(num)
    }
}

fun namesArray(name1:String,name2:String,name3:String):Int {
    var names=arrayOf(name1,name2,name3)
    var arrayCount=0
    for(name in names ){
        if(name.length>5){
       arrayCount++
        }
    }
    return arrayCount
}



fun decisions(age:Int) {
    if (age > 6) {
        println("serve a glass of milk")
    } else if (age < 15 && age > 6) {
        println("serve a bottle of fanta orange")
    } else {
        println("serve a bottle of cocacola")
    }
}
fun numberRange(){
    for(num in 1..100) {
   if(num%3==0) {
       println("FIZZ")
   }
        if(num%5==0){
       println("BUZZ")
   }
        if(num%3==0 && num%5==0){
       println("FIZZ BUZZ")
   }
        if(num%3!=0 && num%5!=0){
            println(num)
        }
    }
}



