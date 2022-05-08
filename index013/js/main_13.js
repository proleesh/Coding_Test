//JSON변환 연습 Author: Sunghyuk Lee

//Storing data(데이터 저장)
const myObj = { name: "Sunghyuk", age: 24, city: "Seongnam" }
const myJSON = JSON.stringify(myObj)
//JSON.stringify()메서드는 JavaScript 값이나 객체를 JSON 문자열을 변환합니다.
//document.getElementById("demo").innerHTML = myJSON
localStorage.setItem("testJSON", myJSON) //set

//Retrieving data(데이터 검사)
let obj = JSON.parse(localStorage.getItem("testJSON")) //get
document.querySelector(".demo1").innerHTML = obj.name
document.querySelector(".demo2").innerHTML = obj.age
document.querySelector(".demo3").innerHTML = obj.city

//array to JSON표현
const arrJSON = JSON.stringify(["KT", "SKTelecom", "LGU+"])
document.querySelector("#demo1").innerHTML = arrJSON

//==============================날짜 문자열화(자동)==================================
function getTime() {
    const myDATE = { today: new Date() }
    const dateJSON = JSON.stringify(myDATE)
    document.getElementById("demo2").innerHTML = dateJSON
    //
}

function init() {//자동으로 시간을 갱신해서 쓴다
    getTime()
    setInterval(getTime, 1000)
}

init()
//==================================================================================
//문자열화 함수
//JSON에서 함수는 객체 값으로 허용되지 않습니다.
const stringJSON = {
    name: function () { return "Sunghyuk" },
    age: function () { return 24 },
    city: function () { return "Seongnam" }
}
// const nonJSON = JSON.stringify(stringJSON)
// document.getElementById("demo3").innerHTML = nonJSON//{} 아무것도 없다

//name, age, city의 값을 출력할 수 는 없어도 함수를 문자열로 변환할 수 는 있다.
stringJSON.name = stringJSON.name.toString()
stringJSON.age = stringJSON.age.toString()
stringJSON.city = stringJSON.city.toString()
const nonJSON = JSON.stringify(stringJSON)
document.getElementById("demo3").innerHTML = nonJSON
//출력내용은 다음과 같다.
//{"name":"function(){return \"Sunghyuk\"}"},"age":"function(){return 24}","city":"function(){return \"Seongnam\"}"}

//JavaScript 객체 값 Access
//우리는 (.)으로 객체 값을 Access한다
//예:Object.objectValue
const objectJSON = '{"name":"Sunghyuk", "age": 24, "car": "ferrari"}'
// JSON.parse()메서드는 JSON문자열의 구문을 분석하고, 그 결과에서 JavaScript 값이나 객체를 생성하다.
const parse1JSON = JSON.parse(objectJSON)
document.getElementById('demo4').innerHTML
    = parse1JSON.name + " " + parse1JSON.age + " " + parse1JSON.car
//Jonh 30 null
console.log(parse1JSON.name) //Jonh
console.log(parse1JSON.age) //30
console.log(parse1JSON.car) //null

//JavaScript 객체 값을 []으로 Access를 하는 법
//예: Object['objectValue'] 또는 Object[index value]
const equalsJSON = '{"name":"Sunghyuk", "age":24, "car": "ferrari"}'
const parse2JSON = JSON.parse(equalsJSON)
document.getElementById('demo5').innerHTML
= parse2JSON[0] + " " + parse2JSON["age"] + " " + parse2JSON["car"]
//Jonh 30 null

// 객체 루핑(Object Looping)
//for-in 루프를 사용하여 객체 속성을 반복할 수 있습니다.
const loopJSON = '{"name":"Sunghyuk", "age":24, "car": "ferrari"}'
const parse3JSON = JSON.parse(loopJSON)

let text1 = ''
for(const x in parse3JSON) {
    text1 += x + " "
}
document.querySelector('#demo6').innerHTML = text1
//출력 내용: name age car

const eloopJSON = '{"name":"Sunghyuk", "age":24, "car": ["Ferrari","Nissan", "Hyundai"]}'
const parse4JSON = JSON.parse(eloopJSON)

let text2 = ''
for(const y in parse4JSON){
    text2 += parse4JSON[y] + " "
}
document.getElementById("demo7").innerHTML = text2
//출력 내용: Sunghyuk 24 Ferrari,Nissan,Hyundai
document.getElementById("demo8").innerHTML = parse4JSON.car[2] // Hyundai

let text3 = ""
for(let i in parse4JSON.car){
    text3 += parse4JSON.car[i] + " "
}
document.getElementById('demo9').innerHTML = text3
//출력 내용: Ferrari Nissan Hyundai

let text4 = ""
for(let a = 0; a < parse4JSON.car.length; a++){
    text4 += parse4JSON.car[a] + " "
}
document.getElementById("demo10").innerHTML = text4
//출력 내용: Ferrari Nissan Hyundai

