// document.write("Hello JavaScript^^")

// var yesorno = confirm("성별은 ??? 확인 남자 취소 여자")
// if(yesorno == true){
//     document.write("당신은 남자 입니다. ")
// }else{
//     document.write("당신은 여자 입니다.")
// }

let name = prompt("클라인트의 이름을 적어주세요.", "홍길동")
let school = prompt("클라인트의 학교를 적어주세요.", "XXX대학교")
let sex = prompt("클라이언트의 성별를 적어주세요.")
//prompt("메세지", "디폴트값") prompt: 입력상자
document.write("안녕하세요!^^ <font color=green>" + name + "</font> 님 <br>")
document.write("<font color=green>" + school + "</font> 출신입니다. ")
document.write("당신의 성별은 <font color=green>" + sex +  "</font> 입니다.")
var num1 = 100;
var num2 = 200;
num1 > num2 ? document.write("num1이 num2 보다 큽니다.") : document.write("num2가 num1 보다 큽니다.")
//object ? document.write():document.write() ==> if...else...
document.write(++num1+"<br>") //1씩 증가
document.write(--num1) //1씩 감소
let answer = prompt("아무 숫자를 입력하세요",)
if(answer > 0){
    alert("입력하신 숫자는 양수 입니다");
}else if(answer < 0){
    alert("입려하신 숫자는 음수 입니다")
}else{
    alert("아무나 입력을 안하거나 오류입니다.")
}
let today = new Date(); //날짜값 시스템에서 금일 날짜를 가져옵니다.
let weekly = today.getDay(); //요일값 weekly에 virable를 담습니다.
switch(weekly){
    case 0: document.write("요늘은 일요일 입니다.");break;
    case 1: document.write("요늘은 월요일 입니다.");break;
    case 2: document.write("요늘은 화요일 입니다.");break;
    case 3: document.write("요늘은 수요일 입니다.");break;
    case 4: document.write("요늘은 목요일 입니다.");break;
    case 5: document.write("요늘은 금요일 입니다.");break;
    case 6: document.write("요늘은 토요일 입니다.");break;
}

for(let i = 0; i <= 100; i++){
    document.write(i + "<br>");
}
let a = 109;
while (a <= 110){
    document.write(a + "\t");
    a++
}