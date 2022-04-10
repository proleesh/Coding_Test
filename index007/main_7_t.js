const person = {
    firstName: "Sunghyuk",
    lastName: "Lee",
    university: "Semyung University",
    student_id: 2022240029,
}

//객체의 일부 데이터 표시
//innerHTML 내부HTML
document.getElementById("name").innerHTML = 
person.firstName + " " + person.lastName;//브라우저에서 Sunghyuk Lee 출력

document.getElementById('university').innerHTML =
person['university'];//브라우저에서 Semyung University 출력

document.getElementById('stu_id').innerHTML = 
person['student_id']; //브라우저에서 2022240029 출력
