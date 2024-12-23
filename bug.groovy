```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // This is where the subtle bug lies
  }
  // ... rest of the method
}

// Example usage:
println myMethod(1,2) //prints 3 (assuming the rest of the method works correctly)
println myMethod(null, 2) //prints null
println myMethod(1, null) //prints null
println myMethod(null, null) //prints null
```