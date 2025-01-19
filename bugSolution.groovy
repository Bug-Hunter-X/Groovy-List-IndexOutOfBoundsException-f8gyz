def list = [1, 2, 3, 4, 5]

//Safe way to access the element
try{
    println list[5]
}catch (IndexOutOfBoundsException e){
    println "Index is out of bounds"
}

// Another safe way is to check the index before accessing it
if (list.size() > 5){
    println list[5]
} else {
    println "Index is out of bounds"
}

//Using elvis operator
println list.getAt(5) ?: "Index is out of bounds"