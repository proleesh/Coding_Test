// var smu = "세명대학교";
// console.log(smu);

// smu = "스마트IT학부";
// console.log(smu);


//===================================
//ES6기준 ECMA JavaScript 2015(let, const)
let smu = "세명대학교";
console.log(smu);

// let smu = "스마트IT학부"; 중복해서 let를 쓰면 (Error)오류
//그래서
smu = "스마트IT학부"; //smu에 새로운값 스마트IT학부를 할당해준다
console.log(smu); //그럼 웹브라우저나 console(콘솔)창에서 스마트IT학부가 출력된다

const smu_1 = "세명대학교";
console.log(smu_1);

//똑같이 중복하면 안되고, 새로운 값을 할당해줘도 안된다
//이것이 const의 특징이다.
// smu_1 = "스마트IT학부"; 오류가난다
// console.log(smu_1);

// document.getElementById('h2');

const smu_list = ["이성혁", "홍길동", "최땡땡"];

console.log(smu_list[0]); //이성혁 출력
console.log(smu_list[1]); //홍길동 출력
console.log(smu_list[2]); //최땡땡 출력
//또는 new Array()를 활용하는 방법도 있음
const smu_list2 = new Array(3); //new Array()의 괄호()중에 원하는 값의 량을 할당하는 것이다.
smu_list2[0] = "이성혁";
smu_list2[1] = "홍길동";
smu_list2[2] = "최땡땡";

console.log(smu_list2); //["이성혁", "홍길동", "최땡땡"] 출력
console.log(smu_list2[0]); //이성혁 출력
console.log(smu_list2[1]); //홍길동 출력
console.log(smu_list2[2]); //최땡땡 출력