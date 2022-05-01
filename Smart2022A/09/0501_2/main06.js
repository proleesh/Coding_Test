'use strict'

// Declaration
const arr1 = new Array(2)
const arr2 = [1, 2]

// Index position
const fruits = ['apple', 'banana']
console.log(fruits)
console.log(fruits.length)//2
console.log(fruits[0])//apple
console.log(fruits[1])//banana
console.log(fruits[fruits.length - 1])//banana 2 - 1 = 1
console.clear()

//Looping over an array
//print all fruits
//a. for
for(let i = 0; i < fruits.length; i++){
    console.log(fruits[i]) //apple banana
}
//b. for of
for(let fruit of fruits){
    console.log(fruit) //apple banana
}
//c. forEach
fruits.forEach((fruit, index) => console.log(fruit, index))//apple 0 banana 1

//Addition, deletion, copy
//push: add an item to the end
fruits.push('strawberry', 'peach')
console.log(fruits)//['apple', 'banana', 'strawberry', 'peach']

//pop: remove an item from the end
fruits.pop()
fruits.pop()
//지금까지 뒤에 두개 인덱스를 삭제
console.log(fruits) //['apple', 'banana']

//shift: remove an item from the beginning
fruits.shift()
fruits.shift()
//지금까지 앞에 두개 인덱스를 삭제
console.log(fruits)// []

//결론: pop()은 뒤 삭제, shift()는 앞 삭제, push()는 값 넣기

fruits.push('tomato', 'blueberry', 'lemon')
console.log(fruits)//['tomato', 'blueberry', 'lemon']
fruits.splice(1, 1) //여기에 1번 인덱스에 한개 요소 제거 즉 blueberry를 제거한다
console.log(fruits)//['tomato', 'lemon']
fruits.splice(1, 1, 'tomato', 'watermelon') //1번 인덱스에 한개 요소를 제거하고 tomato와 watermelon을 추가한다.
console.log(fruits)//['tomato','tomato', 'watermelon']

//combine two arrays 두 배열을 연결 시킨다
const fruits2 = ['melon', 'mango']
const newFruits = fruits.concat(fruits2)
console.log(newFruits)//[ 'tomato', 'tomato', 'watermelon', 'melon', 'mango' ]

// indexOf: find the index
console.clear()
console.log(fruits)
console.log(fruits2.indexOf('apple')) //-1
console.log(fruits2.indexOf('melon')) //0
console.log(fruits2.indexOf('mango')) //1

//includes
console.log(fruits2.includes('watermelon')) //false
console.log(fruits2.includes('melon')) //true

console.log(fruits2)

//lastIndexOf
console.log(fruits2.lastIndexOf('melon')) //0