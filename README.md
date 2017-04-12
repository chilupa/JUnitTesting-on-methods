# JUnitTesting on Methods of a Class

Wrote Unit test cases for two methods in a class. 

# Test Cases
1. Truncate character 'A' if it's found in the first two positions of a String.
2. First and Last Two Characters are Same in a String

# Method used for Testing: 
`assertEquals()` method takes two arguemnts. One is the expected Output and the other is actual Output.

**Syntax:**

`assertEquals(expected, output);`

# Input and Expected Output: 
- AACD --> CD 
- ACD --> CD 
- CDEF --> CDEF 
- CDAA --> CDAA

# Pro Tip:

**On Windows,**

Use `Alt+Shift+I` on any local variable to **Refactor** it into an inline statement.  

``` 
  String actual = helper.truncateAInFirst2Positions("AACD");
  String expected = "CD";
  assertEquals(expected, actual);
```
Consider the local variable (inside a method). Select `actual` and press `Alt+Shift+I`. It formats your code to: 
  ```  
  String expected = "CD";
  assertEquals(expected, helper.truncateAInFirst2Positions("AACD")); 
  ```
 In this way, you can even Refactor the code for `expected` variable too!
