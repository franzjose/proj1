import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period
import java.util.*

fun main() {

//    println("Name please:")
//    var name = readLine()
    println("Byear:")
    var byear = readLine()!!
    println("Bmonth:")
    var bmonth = readLine()!!
    println("Bday:")
    var bday = readLine()!!
//    var date = SimpleDateFormat("dd/mm/yyyy hh:mm:ss").format(Date())
    var date = LocalDate.now()
    var birthday = LocalDate.of(Integer.valueOf(byear), Integer.valueOf(bmonth), Integer.valueOf(bday))
    var age = birthday.until(date)
//
//    println(name)
    println(2021-Integer.valueOf(byear))
    println(Period.between(birthday,date).years)
    println("Im ${age.years}years "+ age.months + "months and days " + age.days)
//    println(bday)

//    var name="easdfasf"
//    var inside=name.subSequence(1,name.length-1)
//    print("${name.subSequence(1,name.length-1)}")

//
//    var product = "apple"
//    var qty = 12
//    var price = 3
//
//    print("The $product cost is ${qty*price}")


//    var name ="Francis happy1"
//    var namename ="Francis happy"
//    println(name.substring(startIndex=8, endIndex=13))
//    println(name.substring(8,12))
//    println(name.compareTo(namename))
//    println(name.uppercase())
//    println(name.lowercase())
//    println(17)
//    println("><(((*>")
//    println('\\')
}