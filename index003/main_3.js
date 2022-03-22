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
