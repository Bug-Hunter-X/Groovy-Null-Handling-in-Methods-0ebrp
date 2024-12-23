# Groovy Null Handling Subtlety

This repository demonstrates a common, yet subtle, error in Groovy related to null handling in method parameters.  The `myMethod` function returns `null` if either `a` or `b` is `null`. While seemingly straightforward, this approach can lead to unexpected `NullPointerExceptions` further down the application's logic if subsequent code doesn't check for nulls explicitly.

The provided solution showcases a more robust and explicit way to handle potential null inputs, using the Elvis operator (`?:`).

## How to reproduce

1. Clone this repository
2. Run `groovy bug.groovy`