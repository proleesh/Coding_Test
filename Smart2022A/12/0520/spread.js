// Destructuring Assignment (구조 분해 할당)


// (1)array => spread operator
let arr1 = [1,2,3,4,5]
let arr2 = [...arr1, 6,7,8,9]
console.log(arr2)
/**[
  1, 2, 3, 4, 5,
  6, 7, 8, 9
] */

// String
let str1 = 'Semyung Univ.'
let str2 = [...str1];

console.log(str2)
/**
 * [
  'S', 'e', 'm', 'y',
  'u', 'n', 'g', ' ',
  'U', 'n', 'i', 'v',
  '.'
]
 */

// (2) ES6 이전
//concat라는 메서드 쓴다 연결하는 메서드(이젠 안 쓴다 너무 길고 코드 질량이 안 좋음)
var arr1_var = [1,2,3,4,5]
var arr2_var = [6,7,8,9]

// var arr_var = arr1_var.concat(arr2_var)
var arr_var = [...arr1_var,...arr2_var]//ES6이후 즉 현재
console.log(arr_var)

// (3) Copy Arrays (ES6이전 코딩방법이다 이젠 이렇게 안 쓴다)
// (3)-1. 단순 변수 할당
var arrs1 = ['Smart', 'Ict']
// var arrs2 = arrs1

// arrs2.push('SMU')
// console.log(arrs2)//[ 'Smart', 'Ict', 'SMU' ]
// 원본 배열이 영향을 받는다
// console.log(arrs1)//[ 'Smart', 'Ict', 'SMU' ]
//-----------------------------------------------------------
// 원본 배열이 영향을 안 받는 방법 slice() 메서드를 쓴다.
var arrs2 = arrs1.slice()
arrs2.push('SMU')
console.log(arrs2) //[ 'Smart', 'Ict', 'SMU' ]
// 원본 배열이 영향을 안 받는다.
console.log(arrs1) //[ 'Smart', 'Ict' ]

// ES5 map() ------ reduce()
const arr1_map = ['Smart', 'Ict']
const arr2_map = arr1_map.map((item) => item)
arr2_map.push('SMU')
console.log(arr2_map) //[ 'Smart', 'Ict', 'SMU' ]
console.log(arr1_map) //[ 'Smart', 'Ict' ]


//구조 분해 할당 (Destructuring Assignment) <====> 자료구조 (Data Structure)

//(1) Array Destructuring

let arrUni = ["Smart", "ICT"]
let [first, second] = arrUni
//한 몸체를 분해해서 각각에 할당해 주었다 그래서 구조 분해 할당이라고 한다.
console.log([first, second]) //[ 'Smart', 'ICT' ] 인덱스 출력 방식이다. "Smart"는 index 0번 "ICT"는 index 1번
console.log(first) // Smart
console.log(second) // ICT
console.log(first, second) // Smart ICT 즉 Smart를 first에, ICT를 second에

