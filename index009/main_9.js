//slice() substring() substr() practice


//slice()문자열의 일부를 추출하고 추출된 부분을 새 문자열로 반환합니다.
//slice(start시작자리, end끝자리) 끝자리 미포함 즉 앞에 있는거
//여기서 부호랑(,./;') 스페이스 바( ) 포함
//즉 A(0) p(1) p(2) l(3) e(4) ,(5)  (6) B(7) a(8) n(9) a(10) n(11) a(12) ,(13) 
const str_fruit = "Apple, Banana, Kiwi";
const part_1 = str_fruit.slice(7, 13)
document.querySelector('#slice_1').innerHTML 
= part_1 //Banana

//slice(start시작자리) 시작자리 뒤에 있는 것을 따라 출력
const part_2 = str_fruit.slice(7)
document.querySelector('#slice_2').innerHTML
= part_2 //Banana, Kiwi

//- 는 꺼꾸로 출력
//즉 i(-1) w(-2) i(-3) K(-4)  (-5) ,(-6) a(-7) n(-8) a(-9) n(-10) a(-11) B(-12)
//그리고 시작포함 뒤에 있는 것을 따라 출력
const part_3 = str_fruit.slice(-12)
document.querySelector('#slice_3').innerHTML
= part_3 //Banana, Kiwi


//=================================================

//substring()
//여기서는 음수 인덱스를 허용되지 않은다.
const str_car = "BMW, Benz, Ford, TOYOTA, KIA"
const part_4 = str_car.substring(5, 16)
document.getElementById('substring').innerHTML
= part_4 //Benz, Ford
//시작을 포함하지 않고 끝은 포함이 된다.

//=================================================

//substr(start, length)
const str_lang = "C, Java, Python, C++, Kotlin, Go"
const part_5 = str_lang.substr(3, 4)
document.querySelector('#substr_1').innerHTML
= part_5 //Java

const part_6 = str_lang.substr(3)
document.querySelector('#substr_2').innerHTML
= part_6 //Java, Python, C++, Kotlin, Go

const part_7 = str_lang.substr(-10)
document.querySelector('#substr_3').innerHTML
= part_7 //Kotlin, Go

//==================================================
//replace("old", "new")
//글 변환
function click_Me(){
    const change_text
    = document.querySelector('#changeText').innerHTML
    document.querySelector('#changeText').innerHTML
    = change_text.replace("Hello World", "Good Luck").toUpperCase()//GOOD LUCK
}
//만약에 문서중에 중복한 단어가 생기면 default 첫 번째 만 바뀐다
//대소문자를 구분해서 쓴다
//정규식을 쓰면은 대소문자는 구분이 없다 쓰는법 => /word/i

//==================================================

//toUpperCase()
//대문자 전환
function upperCaseClick(){
    const conversion_word_1
    = document.querySelector('#conversion_1').innerHTML
    document.querySelector("#conversion_1").innerHTML
    = conversion_word_1.toUpperCase();//LEE SUNG-HYUK
}
//toLowerCase()
//소문자 전환
function lowerCaseClick(){
    const conversion_word_2
    = document.querySelector("#conversion_2").innerHTML
    document.querySelector("#conversion_2").innerHTML
    = conversion_word_2.toLowerCase();//abcdefghijklmnopqrstuvwxyz
}

//=================================================
//concat() 문자를 연결해서 쓰는 method
const text_1 = "Good", text_2 = "Job"
const text_all = text_1.concat(" ", text_2)
document.getElementById("concatText").innerHTML
= text_all//Good Job

//=================================================
//String문자열 정리
//"        안녕        " 정리후 => "안녕"
//trim()를 쓴다
const string_1 = "             이성혁    ,안녕!"
const string_trim = string_1.trim();
document.querySelector("#trimString").innerHTML
= string_trim//이성혁,안녕!

//=================================================
//padStart(갯수, "String")
const text_3 = "5"
const pad_Start_1 = text_3.padStart(3,"0")
document.querySelector("#padStart_1").innerHTML
= pad_Start_1 //005

//이렇게 써도 된다 object.toString()
const num_1 = 5
const text_4 = num_1.toString()
const pad_Start_2 = text_4.padStart(3, 0)
document.querySelector("#padStart_2").innerHTML
= pad_Start_2 //005

//padStart는 ECMAScript 2017의 표준이다

//padEnd(갯수, "String")
const text_5 = "5"
const pad_End = text_5.padEnd(3, "0")
document.querySelector("#padEnd").innerHTML
= pad_End //500

//결론 
//padStart는 지정한 숫자 앞에서 문자출력
//padEnd는 지정한 숫자 뒤에서 문자출력

//===============================================
//charAt()
const text_6 = "안녕하세요"
const char_At = text_6.charAt(4)
document.querySelector('#charAt').innerHTML
= char_At //요

//charCodeAt() 리턴 UTF-8 코드
const char_Code_At = text_6.charCodeAt(0)
document.querySelector('#charCodeAt').innerHTML
= char_Code_At //안 => ASCII value 50504 UTF-8 코드

//ECMAScript 5 (2009) [] String properties 방문
const text_7 = "Hello"
const char_visit = text_7[0]
document.querySelector('#charVisit').innerHTML
= char_visit //H
console.log(text_7[0] = "G")//error도 없고 아무작용이 없다

//==================================================