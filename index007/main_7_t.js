const person = {
    firstName: "Sunghyuk",
    lastName: "Lee",
    university: "Semyung University",
    student_id: 2022240029,
    fullName: function(){
        return this.firstName + " " + this.lastName;
    }
}
console.log(person.fullName())//콘솔에서 Sunghyuk Lee 출력

// alert(person.fullName());//Sunghyuk Lee 창이 뜬다
//객체의 일부 데이터 표시
//innerHTML 내부HTML
document.getElementById("name").innerHTML = 
// person.firstName + " " + person.lastName;//브라우저에서 Sunghyuk Lee 출력
person.fullName(); //똑같이 Sunghyuk Lee 출력

document.getElementById('university').innerHTML =
person['university'];//브라우저에서 Semyung University 출력

document.getElementById('stu_id').innerHTML = 
person['student_id']; //브라우저에서 2022240029 출력

function displayDate(){
    document.getElementById('date_2').innerHTML = Date();
}

const text = '대한민국'
// document.querySelector('#phrases').innerHTML = text; //대한민국
const length = text.length;
console.log(length) //4 문자의 길이

document.querySelector('#phrases').innerHTML = typeof text; //string
//typeof 자료형을 출력


const log = document.querySelector('#mouseClick_log');

document.addEventListener('mousemove', inputChange)

function inputChange(e){
    log.innerText = `Client Position: ${e.clientX}, ${e.clientY}
                     Screen Position: ${e.screenX}, ${e.screenY}`
}

const x = new String('Kakao')
const y = new String('Naver')
const num_1 = new Int16Array(10)
const num_2 = new Int16Array(100)

 document.getElementById('typeof').innerHTML = 
 (x === y) //false 즉 Kakao 와 Naver는 같지않다

document.getElementById('typeof_1').innerHTML =
(num_1 < num_2)//true 즉 num_1은 num_2보다 작다