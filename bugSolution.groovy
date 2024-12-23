```groovy
def myMethod(a, b) {
  // Use the Elvis operator to provide default values for null inputs
  a = a ?: 0
  b = b ?: 0
  return a + b
}

println myMethod(1, 2) //prints 3
println myMethod(null, 2) //prints 2
println myMethod(1, null) //prints 1
println myMethod(null, null) //prints 0
```