// let age = 10;

// if(age < 18){
//     welcome();
//     function welcome(){
//         alert("Hello! teenager");
//     }
//     welcome();
// }else{
//     function welcome(){
//         alert("Hello Adult!!!")
//     }
    
// } 이렇게 선언하지 마세요 나쁜 코드 작성형식입니다.
let user = {
    name: "sunghyuk",
    age: 24,
    "student": true
};
console.log(user.name = "lee")
console.log(user.name)

//set
user["likes food"] = "Naengmyeon"
//get
console.log(user["likes food"]) //Naengmyeon
//delete
delete user["likes food"]
console.log(user["likes food"]) //undefined 못찾았다고 나옵니다.

let key = prompt("찾으실 이름을 입력하세요: ", "name")

alert(user[key])
//user.key 안된다

let fruit = prompt("어떤 과일을 찾으십니까?", "apple")

let bag = {
    [fruit]: 5,
};

alert(bag.apple);


//property value shorthand(프로퍼티 값 단축 구문)
//실무에서 가장 흔한 사용법 기존 변수에서 받아와 사용하는 경우
// function makeUser(name, age, year){
//     return{
        
//         name: name,
//         age: age,
//         year: year
//     }
// }


//name:name대신 name만 적어주어도 property를 설정할 수 있다.
function makeUser(name, age, year){
    return{
        name,  //name: name 과 같음
        age,   //age: age 과 같음
        year   //year: year 과 같음
    }
}

let users = makeUser("sunghyuk", 24, 1999)
alert(users.name);
alert(users.age);
alert(users.year);

//property name엔 어떻게 해도 제약이 없다.
let obj = {
    for: 1,
    let: 2,
    return: 3
}
alert(obj.for + obj.let + obj.return);

let obj1 = {
    0: "good"
}
alert(obj1["0"]) //good
alert(obj1[0]) //good

//__proto__

let obj2 = {};
obj2.__proto__ = 5; //할당
alert(obj2.__proto__) //[object Object]

let users1 = {};

alert(users1.noSuchProperty === undefined) //ture

//"key" in object

let groups = {
    names: "June",
    ages: 35,
    hobby: "coding"
}

alert("hobby" in groups) //true
alert("ages" in groups) //true
alert("gender" in groups) //false

//""없애면 이렇게 쓰면 된다
let keys = "ages";
alert(keys in groups) //true

//왜 in operator가 있는 거지?
//대부분의 경우, comparison operator(일치/비교 연산자)를 사용하여 property 존재 여부를 알아내는 방법("===undefined")은 꽤 잘 동작한다. 그런데 가끔은 이 방법이 실패할 때도 있다.
//이럴 때 in을 사용하면 property 존재 여부를 제대로 판별할 수 있다.
//property는 존재하는데, 값에 undefined를 할당한 예시를 살펴보자.
let obj3 = {
    test: undefined
}

//값이 undefined이므로, 창엔 똑같이 undefined로 출려된다.
//그런데 property name값은 존재한다.
alert(obj3.test) //undefined

// in operator를 사용하면 바로 유무확인 가능하다
alert("test" in obj3) //true 존재한다


//undefined는 변수는 정의되어 있으나 value가 할당되지 않은 경우에 쓰기 때문에 property value가 undefined인 경우는 흔치 않다.
//value를 '알 수 없거나(unknown)' 값이 '비어 있다는(empty)' 것을 나타낼 때는 주로 null을 사용한다.

for(let key in groups){
    //key
    alert(key); //names, ages, hobby
    //key에 해당하는 값
    alert(user[key]); //June, 35, coding
}

let codes = {
    "82": "대한민국",
    "86": "중화인민공화국",
    "49": "독일",
    "1": "미합중국"
}

for(let code in codes){
    alert(code) // 1, 49, 82, 86
}

alert(String(Math.trunc(Number('82')))); //82

alert(String(Math.trunc(Number('+82')))) //82

alert(String(Math.trunc(Number('1.2')))) //1

let add = {
    name: "Jannie",
    sex: "female"
}

add.nation = "South Korea" //property를 하나 추가

//integer property가 아닌 property는 추가된 순서대로 나열된다
for(let prop in add){
    alert(prop) //name, sex, nation
}

//82(대한민국 국가 번호)를 가장 위에 출력되도록 하려면 국가 번호가 integer로 취급되지 않도록 속임수를 쓰면 된다.
//즉 각 나라 번호 앞에 "+"를 붙여본다
let codes1 = {
    "+82": "대한민국",
    "+86": "중화인민공화국",
    "+49": "독일",
    "+1": "미합중국"
}

for(let code_code in codes1){
    alert(+code_code); //82, 86, 49, 1
}


