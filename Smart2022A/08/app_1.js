//Function 方法 메서드 method的 学术用语 名称整理
function fun_showMessage(){
    let message = "Hello World"//local variable(지역 변수， 本地变量)
    console.log(message)//Hello World
}

console.log(fun_showMessage())//undefined
//console.log(message) message는local variable이기 때문에 안된다

const userName = 'Seonghyeok'//Outer variable(외부 변수， 外部变量)
function func_showMessage(){
    const message_1 = 'Hello, ' + userName
    console.log(message_1)
}

console.log(func_showMessage())//Hello, Seonghyeok

//outer variable는 local variable가 없을 때만 사용이 가능한다
//예:
let nickName = 'Coco'
function funct_showMessage(){
    nickName = 'Ninja' //outer variable를 수정함

}
console.log(nickName)//Coco function을 읽기 전
document.write(funct_showMessage())//undefined
console.log(nickName)//Ninja function을 읽은 후

let clientName = 'Joshua'
function showMessage(){
    let clientName = "James" //같은 변수 이름을 가진 local variable를 선언
    
    let isMessage = 'Hello, ' + clientName
    console.log(isMessage)
}

//function는 local variable인 clientName만 사용한다
//즉 outer variable인 Joshua는 적용이 안 된다
console.log(showMessage())//Hello, James

//이런 경우는 outer variable인 clientName에 있는 변수 값 'Joshua'만 출력이 된다(function안에 있는 것을 걷치지 않고)
console.log(clientName)//Joshua


//Global variable (전역 변수, 全局变量)
//function 외부에 선언된 변수는 Globle variable라고 부른다
//global variable는 같은 이름 가진 local variable에 의해 가려지지만 않는다면 모든 function에서 접근이 가능하다
//변수는 연관되는 function 내에 선언하고
//global variable는 될수있으면 사용하지 않는게 좋다
//일반적 비교적으로 근래에 작성된 코드들은 대부분 Global variable를 사용하지 않거나 최소한으로 사용한다.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//Parameter(parameter)
//Parameter(매개변수, 인수)는 argument(인수 引數)라고도 부른다
// parameter과 argument 엄밀히 말하자면 같지는 않다
function functi_showMessage(from, text){ //매개변수 즉 parameter이 from, text가 해당이 된다
    console.log(from + ": " + text)
}
console.log(functi_showMessage("Name", "Sky"))//Name: 하늘   from parameter에 Name을 넣었고, text parameter에 Sky을 넣었다
console.log(functi_showMessage("Sex", "Female"))//Sex: Female from parameter에 Sex를 넣었고, text parameter에 Female를 넣었다

let from = 'Sky'
functi_showMessage(from, "Hello") //Sky, Hello

//parameter에 값을 전달하지 않으면 그 값은 undefined(확실하지 않은)가 된다
//functi_showMessage(from, text) parameter에 하나만 넣어도 출력이 가능
console.log(functi_showMessage("Weight"))//Weight: undefined

//undefined를 출력하고 싶지 않다면
//이렇게하면 된다
function functio_showMessage(from, text='No Value'){ //text parameter에 문구를 하나 적어주면 된다
    console.log(from + ": " + text)
}
console.log(functio_showMessage("Height"))//Height: No Value

//복잡한 표현식도 기본값으로 설정할 수 있다.
/**
 * function parameter(parameter, parameter = anotherFunction()){ 
 * anotherFunction()은 parameter값이 없을 때만 호출됨
 * anoterFunction()의 반환 값이 parameter의 값이 됨
 * }
*/
//JavaScript에서는 fucntion를 호출할 때마다 parameter 기본값을 평가한다
//물론 해당하는 parameter가 없을 때만 기본값을 평가한다

//parameter 기본값을 설정하는 것 대신 fucntion이 실행되는 도중에 기본값을 설정하는 게 논리에 맞는 경우가 생기기도 한다.
function function_showMessage(text){
    if(text === undefined){//비교 연산자를 이용한다
        text = 'Hello World'//local variable
    }
    console.log(text)
}
//parameter를 undefined와 비교하여 function 호출 시 parameter가 생략되었는지를 확인한다.
console.log(function_showMessage()) //Hello World
//그리고 위에 처럼 if를 쓰는 대신 논리 연산자 ||를 써도 된다
function showMessage_1(text){
    text = text || 'Hello World'//즉 paramter가 생략되었거나 빈 문자열("")이 넘어오면 'Hello World'이 할당된다
    console.log(text)
}
console.log(showMessage_1())//Hello World

//JavaScript Engine이 지원하는 nullish 병합 연산자(nullish coalescing operator)??를 사용하면 
//0처럼 falsy로 평가되는 값들을 일반 값처럼 처리할 수 있어서 좋다

//parameter 'count'가 넘어오지 않으면 'unknow'을 출력해주는 function
function showCount(count){
    console.log(count ?? "unknown")
}
console.log(showCount(0))//0
console.log(showCount(null))//unknown
console.log(showCount())//unknown

//Return value(반환 값)
//function를 호출했을 때 function를 호출한 그 곳에 특정 값을 반환하게 할 수 있다. 이때 이 특정 값을 Return value이라고 부른다.
//인수로 받은 두 값을 더해주고 반환해보자
function argumentEx(a, b){
    return a + b
}
const result = argumentEx(99, 1)
console.log(result)//100

//이렇게 만들수 있다
function yourAge(age){
    if (age >= 19){
        return true
    }else{
        return confirm("보호자의 동의를 받으셨나요?")//나이가 19세 미만일때 물어본다 확인/취소
    }
}
const age = prompt("나이를 입력하세요")

if(yourAge(age)){
    console.log("Agree your connect")//확인혹은 19세 이상이면 console에 출력한다
}else{
    console.log("Disagree your connect")//취소를 누르면 console에 출력한다
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//이런 경우 function이 즉시 종료가 된다
// function showMovie(age){
//     if(!yourAge(age)){
//         return
//     }
//     console.log("영화 상영")
// }

//return 문이 없거나 return 지시자만 있는 function는 undefined를 반환한다
//return 문이 없는 function도 무언가를 반환한다
function doNothing(){
    // 
}
console.log(doNothing() === undefined) //true

//return과 value(값) 사이에 절대 newline(줄)을 삽입하지 않는다
//return; 이렇게 쓰면 오류다
//이유는 JavaScript에서 return뒤에 ;이 자동으로 붙여있기 때문에 또 붙이면 오류로 인식한다
//물론 우리는 자동으로 붙인 ;을 눈으로 볼수 없지만
//return에 여러개를 쓸때 ()를 쓴다 예: return (what + what + what + f(a) + f(b))이렇게 쓴다

//function의 naming rule 이름을 규칙때로 쓰면 어떻게 쓸까요
//접두사
//get... 값을 반환함
//calc... 무언가를 계산함 calculate의 약자
//create... 무언가를 생성함
//check... 무언가를 확인하고 불린값을 반환함
//show... 무언가를 보여주고 싶을 때
//적용하면
//getAge(..) 나이를 가져온다
//calcSum(..) 합계
//createForm(..) form을 생성하고 만들어진 from을 반환함
//checkPremission(..) 승인 여부 확인
//showMessage(..) 메시지를 보여줌

//function는 동작 하난만 담당해야 한다
/**
 * function는 function 이름에 언급되어있는 동작을 정확히 수행해야 한다. 그 이외의 동작은 수행해선 안된다.
 * 독립적인 두 개의 동작은 독립된 function 두 개에서 나눠서 수행할 수 있게 해야 한다. 한 장소에서 두 동작을
 * 동시에 필요로 하는 경우라도 나누어야 한다. 이런 경우에는 제3의 function를 만들어 그곳에서 두 function를
 * 호출한다.
 * 초보 개발자들이 실수 한 것들:
 * getAge function는 나이를 얻어오는 동작만 수행해야 한다. console.log 창에 나이를 출력해주는 동작은 이 function에 들어가지 않는 것이 좋다.
 * createForm function는 form을 만들고 이를 반환하는 동작만 해야 한다. form을 문서에 추가하는 동작이 해당 function에 들어가 있으면 좋지 않다.
 * checkPremission function는 승인 여부를 확인하고 그 결과를 반환하는 동작만 해야 한다. 승인 여부를 보여주는 메시지를 띄우는 동작이 들어가 있으면 좋지 않다.
 * 
 * function이름을 지을때 반드시 어떤 의미인지 알고 있어야 한다.
 * 팀에서 만든 규칙을 반드시 따라야 한다.
 * 팀원들은 이 규칙을 충분히 이햐하고 있어야 하며, 팀원들 사이에 이 규칙이 잘 공유되어야 한다.
 */
//아주 짧은 이름의 경우
/**
 * function 중에 이름이 아주 짧은 function들이 있다
 * jQuery Framework에서 쓰이는 function $와 Lodash 라이브러리의 핵심 function_ 같은 것이다.
 * 
 * 이 function들은 지금까지 소개한 function 이름짓기에 관련된 규칙을 지키지 않고 있다.예외에 속한다.
 * function 이름은 간결하고 function가 어떤 일을 하는지 설명할 수 있게 지어야 한다.
 */
//function == Comment(주석)
//function을 될수 있도록 분리하게 쓰는 것이 원칙이다.
//function을 간결하게 만들면 테스트와 디버깅이 쉬워진다. 그리고 function 그 자체로 주석의 역할까지 한다.

// function showPrimes(n){
//     nextPrime: for(let i=2; i<n; i++){
//         for(let j=2; j<i; j++){
//             if(i%j === 0);//continue nextPrime
//         }
//         console.log(i)//prime(소수)
//     }
// }
// console.log(showPrimes())
//showPrime(n)는 소수인지 아닌지 여부를 검증하는 코드를 따로 분리해 isPrime(n)이라는 function에 넣어서 작성했다
// function showPrime(n){
//     for(let i = 2; i < n; i++){
//         if(!isPrime(i)) continue;

//         console.log(i)//a prime
//     }
// }
// function isPrime(n){
//     for(let i = 2; i < n; i++){
//         if(n % i === 0) return false;
//     }
//     return true
// }
//두 번째 쓰는 것이 명확하고 이해하기 쉽다
//isPrime function 이름을 보고 해당 function가 소수 여부를 검증하는 동작을 한다는 걸 쉽게 알 수 있다.
//이렇게 이름만 보고도 어떤 동작을 하는지 알 수 있는 코드를 지가 설명적(self-describing) 코드라고 부른다
function name(parameter, delimied, by, comma){
    /** */
}
/**
 * function에 전달된 parameter는 복사된 후 function의 local variable가 된다
 * function는 외부 변수에 접근할 수 있다. 그러나 function 바깥에서 function 내부의 local variable에 접근하는 건 불가능하다.
 * function는 값을 반환할 수 있다. 값을 반환하지 않는 경우는 반환 값이 undefined가 된다.
 */
/**그래서 깔끔하고 이해하기 쉬운 코드를 작성하려면 function 내부에서 외부 변수를 사용하는 방법 대신 
 * local variable와 parameter를 활용하는 게 좋다 개발자는 parameter를 받아서 그 변수를 가지고 
 * 반환 값을 만들어 내는 function를 더 쉽게 이해할 수 있다. parameter 없이 function 내부에서
 *  외부 변수를 수정해 반환 값을 만들어 내는 function는 쉽게 이해하기 힘들다.
*/
/**
 * function이름 규칙
 * 1. function 이름은 function가 어떤 동작을 하는지 설명할 수 있어야 한다. 이렇게 이름을 지으면 function 호출 코드만
 * 보아도 해당 function가 무엇을 하고 어떤 값을 반환할지 바로 알 수 있다.
 * 2. function는 동작을 수행하기 때문에 이름이 주로 동사이다.
 * 3. create..., show..., get..., check... 등의 잘 알려진 접두어를 사용해 이름을 지을 수 있다. 접두어를 사용하면 function
 * 이름만 보고도 해당 function가 어떤 동작을 하는지 파악할 수 있다.
 */

//과제 풀이
function checkAge(isAge){
    if(isAge > 18){
        return true
    }
//     else{
//         return confirm('보호자의 동의를 받으셨나요?')
//     }
}
//답: else를 삭제해도 기존 코드와 동일하게 작동이 된다.

//?
function checkAge_2(age){
    return (age > 18) ? true : confirm('보호자의 동의를 받으셨나요?')
}
//or ||
function checkAge_3(age){
    return (age > 18) || confirm('보호자의 동의를 받으셨나요?')
}

let a = 2
let b = 5
function min_1(a, b){
    if(a < b){
        return a
    }else{
        return b
    }
}
console.log(min_1(a, b)) //2

let c = 3
let d = -1
function min_2(c, d){
    return (c > d)? d : c
}
console.log(min_2(c,d))//-1

let e = 1
let f = 1
function min_3(e, f){
    return e * f
}
console.log(min_3(e, f))//1
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
const x = prompt("x의 값을 입력")
const n = prompt("n의 값을 입력")
function pow(x, n){
    let answer = x //answer에 x값을 할당해 준다
    for(let i = 1; i < n; i++){//i가 1부터 n까지 for문을 돌린다
        answer *= x //answer * x
    }
    return answer//answer값을 return해준다
}
if(n < 1){
    alert(`${n}은(는) 양의 정수가 아니다.`) //n < 1만족하면
}else{
    alert(pow(x, n) + `,  <${n}은(는) 자연수 입니다.>`) //n < 1만족하지 않으면
}
