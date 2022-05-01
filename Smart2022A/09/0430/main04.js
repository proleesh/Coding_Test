// 작성자: 이성혁 Author: Sunghyuk Lee

// function practice 함수 연습
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// 함수 선언 function declaration
function doSomething_1(){
    console.log('hello')
}

// 함수 호출 function call
doSomething_1()//hello

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// 함수를 인자로 전달 Transfer function to factor
function doSomething_2(add){
    console.log(add)
    const result_1 = add(2, 3)

    console.log(result_1)
}

// 함수 호출 function call
const result_from_doSomething_2 = add(1, 2)
console.log(result_from_doSomething_2)//3

doSomething_2(add)//5 사용된 함수(function)는 add(더하기)

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// 값을 리턴하는 함수 Functions that return values
function add(a, b){
    const sum = a + b
    return sum
}

// 함수 호출 function call
console.log(add(2, 265)) //sum을 통해 267를 얻는다 sum = 2 + 265 -> 나온 값을 return해주고 add()로 호출하면 -> 267
console.log(add()) //add(a, b) 즉 a랑 b값을 할당 안해주면 NaN(Not a Number)이 출력된다

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// 함수를 변수에 할당 Assign a function to variable
const addFun = add;
console.log(add)
const result = addFun(1, 2)
console.log(result)//3

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Function 함수
/**
 * fundamental building block in the program 프로그램의 기본 구성요소
 * subprogram can be used multiple times 하위 프로그램은 여러 번 사용될 수 있다
 * performs a task or calculates a value 작업을 수행하거나 값을 계산하다
 */

function printHello(){
    console.log('Hello')
}
printHello() //Hello

function log(message){
    console.log(message)
}
log('안녕!') //안녕!
log(4698 + 565656) //570354

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// parameter 매개변수
/**
 * primitive parameters: pass by value 원시 매개변수: 값이 통한다
 * object parameters: passwd by reference 객체 매개변수: 참조에 의한 변수
 */
// 이름 수정하기
function changeName(obj){
    obj.name = '세명대학교'
    obj.subject = '스마트IT학부'
}
const smu = {
    name:'Semyung University' , 
    subject: 'SmartIT'
}
changeName(smu)
console.log(smu)//{ name: '세명대학교', subject: '스마트IT학부' }

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Default parameters (added in ES6) 기본 매개변수(ES6버전에서 추가되었다)
function showMessage(message, from = 'great'){
    //from에 (undefined)확실지 않은 변수를 주면 첫 번째이 실행되고
    //from에 (great) 변수를 주면 두 번째가 실행이된다
    //그리고 from에 아무값이 없는 경우 '' 그냥 else를 실행된다
    if(from === undefined){// from이 (undefined)확실하지 않으면 다음을 실행함
        from = 'Sunghyuk' //from에 값을 할당해준다
    }else if(from === 'great'){
        from = 'Programmer' //from에 값을 할당해준다
    }else{//아무값이 입력되지 않는 경우 다음을 실행함
        from = 'Not a Value'  //from에 값을 할당해준다
    }
    console.log(`${message} by ${from}`) //출력 형식을 작성한다
}
showMessage('Hello~')//message에 'Hello~'라는 값을 할당 해 준다.
//따라서 출력된 값은 Hello~ by Programmer

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Rest parameters (added in ES6) 나머지 매개변수(ES6버전에서 추가되었다)
function printAll(...args){// ...은 배열 형태로 전달됨
    // ...은 배열 리터럴(array literal)의 어디에서든 사용될 수 있으며 여러번 사용될 수도 있습니다.
    // 1)
    for(let i = 0; i < args.length; i++){ //i의 0부터 ~ i의 길이 까지 하나 씩 증가한다
        console.log(args[i])
    }
    // 2)
    for(const arg of args){//arg의 값은 args에서 가져온후 다음을 실행
        console.log(arg)
    }
    // 3)
    args.forEach((arg) => console.log(arg))//=>는 화살표 함수(arrow function expression)라고 한다
    // =>를 쓰는 이유는 일반적인 함수 표현을 대체할 수 있다. 
    // 원래 함수 표현으로 쓰면: (function(arg){console.log(arg)}) 의미랑 기능은 똑같다 보통 =>를 많이 쓴다 효율성↑
    /**
     * 화살표 함수(arrow function expression)의 몇가지 단점
     * this나 super에 대한 바인딩이 없고, methods로 사용될 수 없습니다.
     * new.target 키워드가 없습니다.
     * 일반적으로 스코프로 지정할 때 사용하는 call, apply, bind methods를 이용할 수 없습니다.
     * 생성자(Constructor)로 사용할 수 없습니다.
     * yield를 화살표 함수 내부에서 사용할 수 없습니다.
     */
    /** 
     * forEach()라는 함수는 주어진 callback을 배열에 있는 각 요소에 대해 오름차순으로
     * 한 번씩 실행합니다. 삭제했거나 초기화하지 않은 인덱스 속성에 대해서는 실행하지
     * 않습니다.
    */
}
printAll('Jabari', 'Jacey', 'Jackson', 'Jada')
// 3번씩이나 출력이 된다. 당황하겠지만 오류가 아니다. 다음 과정을 보자:
/**
 * function에 3번 출력 과정: 
 * 첫 번째 출력은 console.log(args[i])를 통해 출력이 되고.
 * 두 번째 출력은 console.log(arg)를 통해 출력이 되고.
 * 세 번째 출력은 arg.forEach((arg) => console.log(arg))를 통해 출력이 된다.
 */

// 나머지 매개변수 rest parameters 이렇게 쓸수도 있다
function test01(...theArgs){
    return theArgs.reduce((previous, current) => {
        // reduce() 메서드는 배열의 각 요소에 대해 주어진 감속기(또는 리듀서)(reducer) 함수를 실행하고, 
        // 하나의 결과값을 반환합니다.
        // reducer 함수는 네 개의 인자를 가집니다.
        //1. 누산기(acc) 2. 현재 값(cur) 3. 현재 인덱스(idx) 4. 원본 배열(src)
        //예: arr.reduce(callback[, initialValue초기값])
        return previous + current
    })
}
console.log(test01(100, 100)) // 200
console.log(test01(100, 300, 1000,)) // 1400
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Local scope 지역 범위
// 밖에서는 안이 보이지 않고, 안에서만 밖을 볼 수 있다.
let globalMessage = 'global' //globalMessage에 global라는variable(변수)를 할당해 준다
function printMessage(){
    let message = 'hello'
    console.log(message) //local variable(지역변수)
    console.log(globalMessage)
    // 중첩된 함수에서 자식의 함수가 부모 함수에 정의된 변수들의 접근이 가능한 것을 closure라고 한다.
    function printAnother(){
        console.log(message)
        let childMessage = 'hello' //closure
    }
    // return undefined 생략 가능
} 
printMessage()//console.log(message)로 쓰면 error발생
//hello console.log(message)를 통해
//global 출력 console.log(globalMessage)를 통해
console.clear()
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Return a value
function sum(a, b){
    return a + b
}
const result_2 = sum(343, 343)
console.log(result_2)//686
console.log(`sum: ${sum(343, 343)}`)//sum: 686
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Early return, early exit
// 추천하지 않는 사용법
function ungradeUser_1(user){
    if(user.print > 10){
        //long upgrade logic...
    }
}
// 추천된 사용법
/**
 * 조건이 맞지 않을 경우, 값이 undefined 인 경우, 값이 0인 
 * 경우에는 빨리 return 하고 필요한 로직은 그 뒤에 작성한다.
 */
function ungradeUser_2(user){
    if(user.point <= 10){
        return
    }
    //long upgrade logic...
}
// function expression 함수 표현법
/**
 * First-class function
 * functions are treated like any other variable. 함수는 다른 변수와 동일하게 취급됩니다.
 * can be assigned as a value to variable. 변수에 값으로 할당이 가능하다.
 * can be passed as an argument to other functions. 다른 함수에 대한 인수로 전달이 가능하다.
 * can be returned by another function. 다른 함수의 return 값으로 전달이 된다.
 * a function declaration can be called earlier than it is defined. (hoisted, 위로 올려주다)함수가 선언되기 전에 호출하여도 가능하다.
 * function declaration은 hoisted(위로 올려주다)가 된다.
 * 이유는 JavaScript 엔진이 선언된 것을 제일 위로 올려주기 때문이다.
 * a function expression is created when the execution reaches it. 함수 표현은 할당된 다음부터 호출이 가능하며, 선언 전에 에러가 발생한다.
 */
const print = function(){ // anonymous function 익명 함수
    console.log('print')
}
print() //print

const printAgain = print
printAgain() //print

const sumAgain = sum
console.log(sumAgain(1, 3)) //4

// Callback function using function expression 함수표현을 이용한 콜백 함수
function randomQuiz(answer, printYes, printNo){
    if(answer === 'Hello World'){
        printYes()
    }else{
        printNo()
    }
}
//anonymous function 익명함수
const printYes = function(){
    console.log('yes!')
}
//named function 명명함수 여기서 우리는 print로 명명을 했다
//better debugging in debugger's statck traces 디버거의 스택 추적에서 더 나은 디버깅
//recursions 재귀
const printNo = function print(){
    console.log('no!')
    //print() recursions -> call stack error 발생
}
randomQuiz('Hi~', printYes, printNo) //no
randomQuiz('Hello World', printYes, printNo) //yes

// arrow function 화살표 함수(방금 설명한 것이다.)
// always anonymous 항상 익명이다
// const simplePrint = function(){
//     console.log('simplePrint!')
// } <- 보통 함수표현 대로 쓰면 이렇게 된다
// 간소화 하기위해 화살표 함수를 쓴다
const simplePrint = () => console.log('simplePrint!')
// 또 하나의 예제
simplePrint()//simplePrint!
const simpleMultiply = (a, b) => {
    return a * b
}
console.log(simpleMultiply(121, 454)) //54934
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
// IIFE: Immediately Invoked Function Expression 즉시 호출된 함수 식
// (function hello(){
//     console.log('IIFE')
// })()
// hello()
function calculate(command, a, b){
    switch(command){
        case 'add':
            return a + b
        case 'substract':
            return a - b
        case 'multiply':
            return a * b
        case 'divide':
            return a / b
        case 'remainder':
            return a % b
        default:
            throw Error('unknown command')
    }
}
console.log(`곱하기: ${calculate('multiply', 45, 5)}`)//곱하기: 225
console.log(`나누기: ${calculate('divide', 45, 5)}`)//나누기: 9
console.log(`더하기: ${calculate('add', 45, 5)}`)//더하기: 50
console.log(`빼기: ${calculate('substract', 45, 5)}`)//빼기: 40
console.log(`나머지: ${calculate('remainder', 45, 5)}`)//나머지: 0