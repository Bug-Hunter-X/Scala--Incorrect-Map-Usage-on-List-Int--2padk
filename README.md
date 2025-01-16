# Scala Bug: Incorrect Map Usage on List[Int]

This repository demonstrates a common Scala error related to the misuse of the `map` function on a `List[Int]`. The bug arises from attempting to apply a mapping function designed for nested collections to a flat `List[Int]`.  The solution showcases the correct way to double each element in the list.

## Bug Description
The original code attempts to use `map` on `List[Int]` with a function that internally uses `map` assuming the input to be a collection. This leads to a runtime `java.lang.ClassCastException`. 

## Solution
The solution provides a corrected `map` operation that correctly doubles the integers within the list.
