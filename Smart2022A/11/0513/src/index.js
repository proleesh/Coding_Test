//author: Sunghyuk Lee(이성혁)

// brace key 또는 curly bracket ==> { }

//  1) Function Declaration (함수 선언식) => bubbling /capturing(x)
showMessage() //이 것은 어디에 있어도 오류가 나지 않는다.
function showMessage(){
    console.log('안녕!')
}

//  2) Function Expression (함수 표현식)
/**
 * Function Expression은 실제 실행 흐름이 행당 function에
 *  도달했을 때 function을 생성한다.
 * Compile time -> PASS 1 (o)  <- TypeScript (보통 요즘 대기업에서 프로젝트 개발은 컴파일 타임을 쓴다.)
 * (Compile time은 DataBase 사용한 resource 반납.)
 * Compile time Error 예시: Syntax error, Type check error
 * Run time -> PASS 2 (x) (보통 책에 나온 것이 런타임으로 되어있다.)
 * (런타임의 단점은 코드가 문제가 생기면 유지보수하기 매우 어렵다.)
 * Run time Error 예시: 0 나누기 오류, null 참조 오류 등
 */
let sayHi = function(){
    console.log("Hi~")
}
/** Assignment operator(할당 연산자)가 literal type(문자열 형식)으로 
 * 변하는 순간 바로 Function Expression 즉 함수 표현식
 * */
//다음 출력은 반드시 function뒤에 써야 오류가 안 나온다.
console.log(sayHi) //[Function: sayHi]
sayHi()//Hi~
// ES6이전 -> polyfill(자동적으로 mapping 해준다) MS IE (x MS사의 쓰레기 作) -> MS edge -> Chormium Edge
// ES6 - Modern JavaScript - ES2015)
// 3) Arrow Function --> Anonymous Function(익명 함수 즉 이름없는 함수 -> 다른 말로 callback function(callback))
// Callback Hell(콜백 지옥) --> Closure 
// Asynchronous (DataBase) -> Callback Function으로 되어있다
// Promise() --> async ~ await

let sum = function(a, b){ // a, b => Parameter
    return a + b;
}
console.log(sum(1212, 656)) // 1212, 656 => Argument

//{} brace key 필요없고 return도 필요없다
//Anonymouse Function (익명함수)
let sum2 = (a, b)=> a + b;
console.log(sum2(454,458))

/**
 * function이 있는 표현법:
 * let double = function(n){
 *  return n * 2
 * }
 * 
 */
//function이 없는 표현법:
//람다식의 표현은 Scala Language에서 나왔다.
let double = n => n * 2 //Functional Programming => Java; Lambda Expression (->)
console.log(double(3))
//이상 결과는 똑 같다.


// [3] class 클래스
/**
 * Java <-> Kotlin
 * JavaScript <-> TypeScript
 * 
 */

class User{
    constructor(name){
        this.name = name
    }
    sayHi(){
        console.log(this.name)
    }
}

//사용법: variable(변수)선언해서 new Operation을 하면 된다.
// Object Variable 객체 변수 (JavaScript의 특유이다) <-> 확률변수(random variable): 1:1 함수
let user = new User("성혁")
user.sayHi() //성혁