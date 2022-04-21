//Array 배열


// const arr = new Array("성혁", "하늘", "선호")
// document.querySelector("#demo_1").innerHTML
// = arr //성혁, 하늘, 선호


const arr_1 = ["성혁", "하늘", "선호"]
arr_1[0] = "보라"
document.write(arr_1)//보라, 하늘, 선호
document.write("<br>")
const arr_2 = ["성혁", "하늘", 24]
document.write(arr_2[0])//성혁
document.write("<br>")
document.write(arr_2[2])//24

const arr_3 = {student_1:"Aaliyah", student_2:"Abel", student_3:"Abbey", student_4:"Abram"}
document.getElementById("demo_2").innerHTML
= arr_3.student_1.length //7

const leng_1 = arr_2.length //["성혁", "하늘", 24]
document.getElementById("demo_3").innerHTML
= leng_1 //3

const arr_4 = ["Peach", "Banana", "Orange", "Apple"]
const leng_2 = arr_4[arr_4.length - 1]//마지막 배열 요소 Access
const leng_3 = arr_4.length

document.querySelector("#demo_4").innerHTML
= leng_2 //Apple

let html_text_1 = "<ul>"
for(let a = 0; a < leng_3; a++){
    html_text_1 += "<li>" + arr_4[a] + "</li>"
}
html_text_1 += "</ul>"

document.querySelector("#demo_5").innerHTML
= html_text_1

//이렇게 써도 됨
const arr_5 = ["Baidu", "Naver", "Yahoo", "Google", "Kakao"]
let html_text_2 = "<ul>"
arr_5.forEach(isFunc) //forEach() 메서드 사용
html_text_2 += "</ul>"
document.querySelector("#demo_6").innerHTML
= html_text_2
function isFunc(value){
    html_text_2 += "<li>" + value + "</li>"
}
document.write("<br>")
//요소를 추가 시 push() 메서드 사용
arr_5.push("SoftBank")
document.write(arr_5)//Baidu,Naver,Yahoo,Google,Kakao,SoftBank

document.write("<br>")
//length로 추가하는 법
arr_5[arr_5.length] = "Huawei"
document.write(arr_5)//Baidu,Naver,Yahoo,Google,Kakao,SoftBank,Huawei

document.write("<br>")
//지정한 access에 추가
arr_5[2] = "Apple"
document.write(arr_5)//Baidu,Naver,apple,Google,Kakao,SoftBank,Huawei
//Yahoo를 apple로 바뀐것을 볼수 있다

document.write("<br>")
//toString() 메서드는 배열 값을 문자열로 변환합니다.
const arr_6 = ['hp', 'dell', 'sony', 'samsung', 'panasonic']
document.querySelector("#demo_7").innerHTML
= //arr_6.toString()//hp,dell,sony,samsung,panasonic
//arr_6.join("*")//hp*dell*sony*samsung*panasonic
arr_6.join("&")//hp&dell&sony&samsung&panasonic

//pop()메서드는 마지막 요소를 제거
arr_6.pop()
document.write(arr_6)//hp,dell,sony,samsung
//panasonic가 없어지는 것을 볼수 있다

document.write("<br>")
//push()는 방금 말했듯이 추가 그것도 마지막 칸에 추가

//unshift()는 맨 앞이 즉 처음에 새 요소를 추가 할때 사용
arr_6.unshift("LG")
document.write(arr_6)//LG,hp,dell,sony,samsung

const a = ["홍길동", "세종", "이순신"]
const b = ["광개토", "선덕", "최치원"]
const c = ["이승만", "김대중", "문재인"]
const concat_anb = a.concat(b)
document.querySelector("#demo_8").innerHTML
= concat_anb//홍길동,세종,이순신,광개토,선덕,최치원

const concat_anbnc = a.concat(b, c)
document.querySelector("#demo_9").innerHTML
= concat_anbnc//홍길동,세종,이순신,광개토,선덕,최치원,이승만,김대중,문재인

const concat_anbncnstring = a.concat(b, c, "을지문덕")
document.querySelector("#demo_10").innerHTML
= concat_anbncnstring//홍길동,세종,이순신,광개토,선덕,최치원,이승만,김대중,문재인,을지문덕

document.write("<br>")
const alpha_1 = ["Kim", "Lee", "Choi", "Shin"]
alpha_1.sort();
//sort()메서드는 알파벳 순으로 출력하기위한 기능이다
document.write(alpha_1)//Choi,Kim,Lee,Shin

document.write("<br>")
alpha_1.reverse()
//reverse()메서드는 반전
document.write(alpha_1)//Shin,Lee,Kim,Choi

//숫자 정렬 비교 기능을 쓰면 정상 배열이 가능하다
//오름차순
const num_1 = [9899, 45489, 56542, 54221, 3000, 87777, 1, 50]
num_1.sort(function(a, b){return a - b})
document.getElementById("demo_11").innerHTML
= num_1//1,50,3000,9899,45489,54221,56542,87777
//내림차순
num_1.sort(function(a, b){return b - a})
document.getElementById("demo_12").innerHTML
= num_1//87777,56542,54221,45489,9899,3000,50,1

//비교 기능 쓰는 법
//결과가 음수 a이면 앞에 정렬 b 됩니다.
//function(a,b){return a - b}
//결과가 양수 b이면 앞에 정렬 a 됩니다.
//function(a,b){return b - a}
//결과가 0이면 두 값의 정렬 순서가 변경되지 않습니다.

//예를 들어 50과 100을 비교할 때 sort()메소드는 비교 함수(50, 100)를 호출합니다.
//이 함수는 50 - 100(a - b)을 계산하고 결과가 음수(-50)이므로
// 정렬 함수는 50을 100보다 작은 값으로 정렬합니다.

//피셔 예이츠 법
//데이터 과학의 일부분
for(let b = num_1.length - 1; b > 0; b--){
    let c = Math.floor(Math.random()*b)
    let d = num_1[b]
    num_1[b] = num_1[c]
    num_1[c] = d
}
document.querySelector("#demo_13").innerHTML
= num_1 //랜덤하게 정렬값이 나온다

