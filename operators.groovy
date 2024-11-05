//OPERADORES ARITMETICOS
//OPERADORES ARITMERICOS NORMALES
assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 10 % 3 == 1
assert 2 ** 3 == 8
assert 9 / 5 == 1

//INCREMENTO Y DECREMENTO
def a = 2
def b = a++ * 3             

assert a == 3 && b == 6

def c = 3
def d = c-- * 2             

assert c == 2 && d == 6

def e = 1
def f = ++e + 3             

assert e == 2 && f == 5

def g = 4
def h = --g + 1

assert g == 3 && h == 4

//OPERADORES ARITMETICOS
// +=

// -=

// *=

// /=

// %=

// **=

def a = 4
a += 3

assert a == 7

def b = 5
b -= 3

assert b == 2

def c = 5
c *= 3

assert c == 15

def d = 10
d /= 2

assert d == 5

def e = 10
e %= 3

assert e == 1

def f = 3
f **= 2

assert f == 9

//OPERADORES RELACIONALES

// ==

// equal

// !=

// different

// <

// less than

// <=

// less than or equal

// >

// greater than

// >=

// greater than or equal

// ===

// identical (Since Groovy 3.0.0)

// !==

// not identical (Since Groovy 3.0.0)

assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//OPERADORES LOGICOS

// &&: logical "and"

// ||: logical "or"

// !: logical "not"

assert !false           
assert true && true     
assert true || false

assert (!false && false) == false
assert true || true && false


//BITWISE OPERATORS

// &: bitwise "and"

// |: bitwise "or"

// ^: bitwise "xor" (exclusive "or")

// ~: bitwise negation

int a = 20
int b = 25
println (a & b)

println Integer.toBinaryString(20)
println Integer.toBinaryString(25)
println Integer.parseInt("10000", 2)

//OPERADORES CONDICIONALES
assert (!true)    == false                      
assert (!'foo')   == false                      
assert (!'')      == true

//OPERADOR TERNARIO
//OPCION 1
if (string!=null && string.length()>0) {
    result = 'Found'
} else {
    result = 'Not found'
}

//OPCION 2
result = (string!=null && string.length()>0) ? 'Found' : 'Not found'

//OPCION 3
result = string ? 'Found' : 'Not found'

//EJEMPLO 
def ouput1 = (1>0) "1 is greater" : "1 is not greater"
println ouput1