//지도교수: 이명호 작성자: 이성혁 Author: Sunghyuk Lee

let x = 3
let y = 5

console.log(x += y) //x = x + y 
console.log(x -= y) //x = x - y
console.log(x *= y) //x = x * y
console.log(x /= y) //x = x / y

// Comprasion Operators
console.log(34 < 3) //false
console.log(3 < 34) //true

//Logical Operators OR --> || AND --> &&
const val1 = true
const val2 = 34 < 23 //false
let check
console.log(`OR: ${val1 || val2 || check()}`)//true
console.log(`AND: ${val1 && val2 && check()}`)//false
/**
 * OR(||):
 * true || true = true
 * true || false = true
 * false || true = true
 * false || false = false
 * AND(&&):
 * true && true = true
 * true && false = false
 * false && true = false
 * false && false = flase
 * XOR(^): 읽는 법: 익스클루시브 OR Exclusive OR
 * 1    1   1 --> true
 * 1    0   0 --> false
 * 0    1   0 --> false
 * 0    0   0 --> false
 */