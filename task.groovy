def countElements(list) {
    def elementCount = [:].withDefault { 0 }
    list.each { elementCount[it]++ }
    return elementCount
}

def inputList = [1, 3, 4, 5, 1, 5, 4]
println countElements(inputList)
