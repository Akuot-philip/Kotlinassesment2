fun main(){
  var din=  CurrentAccount("23456","balanciaga",10000.00,50.6)
    din.deposit(2000.00)
    println(din.balance)
    din.withdraw(500.00)
    println(din.balance)


    var car=product("jeep",45.0,1000,"other")
    var vegetables=product("cabbage",6.0,50,"groceries")
    var health=product("patient",59.0,1000,"hygiene")
    print(car)
    print(vegetables)
    println(health)





    println(evnIndices("babygirl"))





}
//quiz 1
class CurrentAccount(var accountnumber:String,var accountname:String,var balance:Double,amount: Double){
    fun deposit(amount:Double){
        var ongeza=balance
        balance+=amount
        println(amount)
    }
 open fun withdraw(amount:Double){
//      var decrease=balance
     balance-=amount
        println(amount)



 }
    fun details(){
        println("Account number $accountnumber with balance $balance is operated by $accountname")
    }
}

//quiz 2
class SavingAccount(accountnumber: String,accountname: String,balance: Double,var withdrawals:Int){
     fun withdraw(amount: Double) {
        if(withdrawals<4){

        }
    }

}




//quiz3

data class product(var name:String,var weight:Double,var price:Int,var category:String)
fun takeprdct(product:product){

    var groceriesLists= mutableListOf<product>()
    var hygieneLists= mutableListOf<product>()
    var otherLists= mutableListOf<product>()
    when(product.category){
        "groceries"-> groceriesLists.add(product)
        "hygiene"->hygieneLists.add(product)
        "other"->otherLists.add(product)
    }
    println( listOf(product))

}



//quiz 4
fun evnIndices(name:String):String{
    var x =""
    for (char in name){
        if (name.indexOf(char)%2==0){
            x+=char
        }

    }
    return x
}




