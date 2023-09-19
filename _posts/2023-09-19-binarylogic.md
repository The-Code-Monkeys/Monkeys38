---
layout: post
title: U3 Boolean Logic
description: Lesson on boolean logics!
courses: {'csa': {'week': 1}}
type: hacks
---

# Data Tables!


Truth tables are used to easily describe boolean algebra operations. Boolean algebra is an branch of mathematics dealing with, rather than the vast stretches of integers, two digits: **1** and **0** (or `true` and `false`). 

There are many different types of boolean operations, and we'll be covering them all here. We also have an interactive quiz that allows you to see how good you are at this!


## NOT (and states).

### Boolean states
As you may know, binary and boolean states are very simple, 1 and 0, true and false. Boolean operations occur based off the comparison of two binary values, or inversion. Thus, these two boolean states are imperative to understanding. 1 and 0 are inverses, like on to off. They are also mutually exclusive. You can't have a state that's both on and off at the same time!

### NOT

The **NOT** operator inverses whatever it is affecting. 

The most basic operation is one that does

## Operation(s): **AND**

### AND 

AND is a boolean operation that you see in your everyday life! And in english is a conjugation, which denotes a combination of two or more objects, and in programming *and* binary math, it is very similar. 

For Example, in English you'd say:
`Take this and that`
and you would not be fulfilling the request unless both `this` and `that` were taken.

Similarly, in Binary math, when you use the and operator, you are only considering the output true unless both are true. 

**AND: (XY)**<br>
python: `True and False`<br>
javascript: `true && false`<br>
java: `true && false`

<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
</table>

### NAND

**NAND** is the not operator for and. In other words, it is the complete inverse of the AND function. 

In english this would be: `DON'T take this and that`. Note how the `DON'T` is a negative, asking you not to take both, but to take either. 

In binary this would be: 

**NAND: (XY)'** (The `'` denotes inverse)<br>
python: `not (True and False)`<br>
javascript: `!(true && false)`<br>
java: `!(true && false)`

<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>TRUE</td>
  </tr>
</table>

### Inhibition

**Inhibition** is a pseudo-and (not actual jargon) function. Written in plain-text, the Inhibition function can be two things: *X·NOT(Y)* or *NOT(X)·Y*. It is when one input is True, but the other is False. This is the inverse of either X or Y, but not both. It can be written as X or Y Inhibition. 

**Inbiting X: (X'Y)**<br>
python: `(Not X)&Y`<br>
javascript: `!(X)&&Y`<br>
java: `!(X)&&Y`

<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
</table>

**Inbiting Y: (XY')**<br>
python: `X&(Not Y)`<br>
javascript: `X&&!(Y)`<br>
java: `X&&!(Y)`

<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
</table>

Note how the first and second terms (in their respective inhibitions) are inverted.

## Operation(s): OR

**AND** operations require both arguments in the function to be true in order to return true. However, or operations only require one to be true to return true. **OR** gates being more forgiving makes them great to check for different cases that AND simply cannot take. However, there are many variations that allow for greater specificity. 

### OR

English Example: `Take either this or that`. Here, if you take `this`, you fulfill the request. But if you also took `that`, you would also fulfill the request. In fact, if you took *both*, you'd actually be fulfilling the request, because they didn't specify to not take both. 

Translated to binary, this is:
**OR: (X + Y)**<br>
python: `True or False`<br>
javascript: `true || false`<br>
java: `true || false`

<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
</table>

### NOR

Remember NAND? This is NAND, but for or. It takes the complete output of OR, and takes the inverse of it. 

**NOR: (X + Y)'**<br>
python: `not (True or False)`<br>
javascript: `!(true || false)`<br>
java: `!(true || false)`
<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>False</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>True</td>
  </tr>
</table>

### XOR

**XOR**, eXclusive OR, *or* bitwise OR allows for a coder to only return true if specifically only one input is true, but the other input is false. For example, this would be a situation where, if you have two objects, you can only take one or the other, not both, and not none. 

**XOR: (X^Y)**<br>
python: `True^False`<br>
javascript: `true^false`<br>
java: `true^false`

<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr> 
</table>

### XNOR
XNOR is the Exclusive NOR. This is the direct inverse of the XOR function, so it would be pretty simple.

**XNOR: (X^Y)'**<br>
python: `not (True^False)`<br>
javascript: `!(true^false)`<br>
java: `!(true^false)`

<table>
  <tr>
    <th>X</th>
    <th>Y</th> 
    <th>Output</th>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>TRUE</td> 
    <td>TRUE</td>
  </tr>
  <tr>
    <td>TRUE</td>
    <td>FALSE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>TRUE</td> 
    <td>FALSE</td>
  </tr>
  <tr>
    <td>FALSE</td>
    <td>FALSE</td> 
    <td>TRUE</td>
  </tr>
</table>


### A Weird Example: 420 && 66

What do you think this value would be?

# Hacks:


Complete the following quiz below **(this is extra credit)**! Once you are done, take a screen shot of your score, and blog about the questions you got wrong. If you got everything right, reflect a bit on the quiz and congrats! This should be pretty simple/

{% include binarylogic.html %}
