const header = 'JavaScript에서 HTML 쓰는 법';
const tags = ['이성혁', '김수로', '홍길동']
//우리가 만든 변수header랑 tags는 const 사용이 가능 이유는 다른 변수이기 때문에
let html_1 = `<h1>${header}</h1><ul>`
//const를 쓰면 오류가 난다. 주의!!!
//이유는 const는 중복해서 사용이 불가능하기 때문에
//이때 우리는 let을 쓰면 된다
for (const x of tags){
    html_1 += `<li>${x}</li>`
}
html_1 += `</ul>`
document.getElementById("demo_1").innerHTML = html_1

const num_1 = 8492e5//849200000
const num_2 = 39489e-5//0.39489
//e + number 즉 숫자 뒤에 0을 몇개 추가
//e - number 즉 숫자 앞에 자리를 세서 소수점 추가
console.log(num_1)
console.log(num_2)

//JavaScript숫자는 항상 64비트 부동 소수점입니다. 즉2^64
//다른 많은 프로그래밍 언어와 달리 JavaScript는 정수, short, long 부동 소수점과 같은 다양한 유형의 숫자를 정의하지 않습니다.
//숫자(분수)는 52비트 0 - 51
//지수는 11비트 52 - 62
//부호는 1비트 63

const num_3 = 999999999999999
//const num_4 = 9999999999999999
console.log(num_3)
//console.log(num_4)//10000000000000000
//999999999999999를 초과하면 빨간중 그리고 한자리 더하다

const num_4 = 0.8 + 0.9
console.log(num_4)//1.7000000000000002
//이렇게 해결하면 된다
const num_5 = (0.8*10 + 0.9*10) / 10
//즉 소수를 없애기 위해 모두 정수로 바꾸고 계산하는 방법
console.log(num_5)//1.7

const result_1 = '윗 예제의 답은: ' + num_5

console.log(result_1) // 윗 예제의 답은: 1.7

const String_num_1 = "20"
const String_num_2 = "22"
const num_6 = 420
const String_result_1 = String_num_1 + String_num_2
console.log(String_result_1+"년")//2022년
//즉 두개의 String은 연결이 된다 계산이 안된다.
const String_result_2 = String_num_1 + String_num_2 + num_6
console.log(String_result_2)//2022420
//즉 String + num = String 연결이 된다

const num_7 = 123;
document.getElementById("demo_2").innerHTML
= num_7.toString() + "<br>" + 
(123).toString() + "<br>" + 
(100 + 23).toString();
//toString은 숫자를 문자열로 변환

//toExponential() 메서드 지수메서드
//()안에 숫자를 지정해준다 이 숫자는 소수점 뒤 몇 자리 까지 반올림을 하는가를 기능
//()안에 숫자가 없으면 반올림을 하지 않는다
//반올림 하면 --> e+1; 반올림 하지 않으면 --> e+0
const num_8 = 9.999
document.querySelector('#demo_3').innerHTML
= num_8.toExponential() + "<br>" + //9.999e+0
num_8.toExponential(2) + "<br>" + //1.00e+1
num_8.toExponential(1) + "<br>" + //1.0e+1
num_8.toExponential(6) //9.999000e+0

//toFixed() 메서드
//사사오입 四舍五入
const num_9 = 7.856
document.getElementById('demo_4').innerHTML
= num_9.toFixed(0) + "<br>" + //8
num_9.toFixed(2) + "<br>" + //소수점 2자리 까지 7.86
num_9.toFixed(4) + "<br>" + //소수점 4자리 까지 7.8560
num_9.toFixed(6) //소수점 6자리 까지 7.856000

//toPrecision() 메서드 정밀하게 출력을 위한 메서드
//소수점 앞 + 뒤 모두 포함 자릿수
//자릿수 조건에 사사오입 적용이 가능할때 사사오입적용하고 출력
const num_10 = 89.56 //<-- 모두 포함 4자리
document.querySelector('#demo_5').innerHTML
= num_10.toPrecision() + "<br>" + //89.56
num_10.toPrecision(4) + "<br>" + //89.56
num_10.toPrecision(6) + "<br>" + //89.5600
num_10.toPrecision(3) //89.6

//valueOf() 메서드
const num_11 = 5647
console.log(num_11.valueOf())//5647
console.log((5600+47).valueOf())//5647
console.log((5647).valueOf())//5647

//number()메서드는 1970.1.1 이후의 밀리초 수를 반환
const time_1 = new Date("1970-01-03") //1970.1.1부터 1970.1.3까지 밀리초
document.getElementById("demo_6").innerHTML
= Number(time_1) //172800000

const time_2 = new Date()
document.getElementById("demo_7").innerHTML
= Number(time_2)//시간이 흐르면서 밀리초 숫자도 동적으로 커진다
//2022년 4월 20일 오후 4:02분 기준 1650438163344

console.log(new Date())//현재시간
//Wed Apr 20 2022 16:03:14 GMT+0900 (한국 표준시)

//parseInt() 메서드는 문자열을 구문 분석하고 정수를 반환합니다.
//그리고 parseInt() 메서드는 공맥을 허용합니다.
//그리고 첫 번째 숫자만 반환합니다.
console.log(parseInt("156652"))//156652
console.log(parseInt("15.6652"))//15
console.log(parseInt("15 6652"))//15
console.log(parseInt("156 652"))//156
console.log(parseInt("-156 652"))//-156
console.log(parseInt("-15665 2"))//-15665
console.log(parseInt("-15665 입니다"))//-15665
console.log(parseInt("값은 15665"))//NaN
//숫자가 아닌 문자가 먼저 오면 Not a Number이 출력한다. 즉 알수없는 내용



//parseFloat() 메서드 parseInt랑 비슷하게 공백을 허용
//그리고 숫자가 아닌 문자가 먼저 오면 Not a Nubmer이 출력
console.log(parseFloat("185935"))//185935
console.log(parseFloat("185.935"))//185.935
console.log(parseFloat("185 935"))//185
console.log(parseFloat("안녕 185935"))//NaN

const isMaxValue = Number.MAX_VALUE
console.log(isMaxValue)//JavaScript에서 가장 큰 숫자를 출력
//1.7976931348623157e+308
const isMinValue = Number.MIN_VALUE
console.log(isMinValue)//JavaScript에서 가장 작은 숫자를 출력
//5e-324

//POSITIVE_INFINITY 오버플로 시 반환됩니다.
const num_12 = Number.POSITIVE_INFINITY
console.log(num_12)//Infinity
document.querySelector('#demo_8').innerHTML
= num_12 //Infinity


