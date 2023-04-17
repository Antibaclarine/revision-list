fun main(){
   println( list(listOf("apple","mango","table","chair","mercy","dog","cow","cat","meaw","mary")))
    var person=personHeight(45.0,35.0)
    println(person)
    personList(mutableListOf(Persona("ian",25,6.2,50.0),
        Persona("Vincent",21,4.2,60.0),
        Persona("Mercy",20,5.5,40.0),
        Persona("Mary",22,3.0,70.0)))
    addHumans(mutableListOf(Persona("Ann",10,2.5,20.0),Persona("Jael",42,1.0,75.0)))

}
//       Quiz 1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
     //input
//list of 10 strings <string>
    //output
//list of strings
    //process
//loop through each string while getting the index
fun list(list: List<String>):List<String> {
    var names= mutableListOf<String>()
    for (i in list.indices step 2){
        names.add(list[i])
    }
        return names

//return list.filterIndexed { index, _ -> index%2==0}

}
//     Quiz 2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

      //input
//list of people heights
       //output
//average height
//total height
      //process
//create  a data class.data class will help to return a pair of elements at once
//data class will take two parameter that is average height and total height
//create one functions that will return the total  and average height

data class personHeight(var totalheight:Double,var average:Double)
fun people(height: List<Double>):personHeight{
    var sumheight=height.sum()
    var avgheight=height.average()
    return personHeight(sumheight,avgheight)
}
        //Quiz 3
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
        // input
//list objects
       //output
//sorted list in decending order
       //process
//create a data class
//create a function that will take in person object(custom data type)
data class Persona(var name:String,var age:Int,var height:Double,var weight:Double)
fun personList(person: List<Persona>){
    println(person.sortedByDescending { p->p.age})

}
fun addHumans(twos: MutableList<Persona>){

}
