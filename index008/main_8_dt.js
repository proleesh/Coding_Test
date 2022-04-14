//JavaScript has 8 basics data type

//Number type
const number = 123;
console.log(number / 0)//Infinity 무한
//또는
console.log(Infinity)//Infinity
//만약에 계산 중에 error가나면 NaN이 표시된다.
//이런경우
console.log("안녕" / 1)//NaN이 표시된다
//이유는 String이 Number랑 같이 사용했기때문에 성립되지않다

//JavaScript에 BigInt라는 특히한 자료형이 있다
//이것은 (253-1)보다 큰 값을 구하기위하여 쓰는것이다
//보통은 그냥Number로 쓰는데 아주 큰 값을 저장하기위하여 BigInt를 쓴다
//그리고 BigInt라는 자료형은 표준으로 채택된 지 얼마 안된 데이터타입이다.
const bigInt = 989546264946226n//숫자뒤에 n을 붙이면 BigInt의 자료형이다.
console.log(typeof(bigInt))//bigint
console.log(bigInt)//989546264946226n
//워낙 새로운것이다 보니 BigInt는 현재는 자주쓰지는 않는다
//그리고 BigInt를 지원하는 Browser는 Chrome(Google), Edge, Safari(Apple), Firefox등만 지원한다

//String
const str_1 = "Good"
const str_2 = "Morning"
const phrase = `Lee, ${str_1} ${str_2} !!`
alert(phrase)//Lee, Good Morning !!
//Double quote(쌍따옴표): " "
//Single quote(단따옴표): ' '
//Backtick(反引号): ` `
alert(`나의 값은 ${1 + 99}`)//나의 값은 100
//그리고 (" `${value}`") 이렇게 쓸수 없다
//표준에서는 쌍/단따옴표를 사용하면 중간에 표현식을 넣을 수 없습니다.
//즉 우리는 표현식을 쓸때 Backtick만 사용이 가능하다 명심하자

//JavaScript에서는 따로 Character type은 없다 즉 지원하지 않다
//따라서 JavaScript에서는 String type만 있다. 여기에 글자하나 혹은 여러 개 들어갈 수 있다.

//Boolean
const one_checked_boolean = true
const two_checked_boolean = false
alert(one_checked_boolean)//true
alert(two_checked_boolean)//false

const isCompareValue = 561626848 > 41564897
alert(isCompareValue)//true 즉 561626848은 41564897보다 크다

//JavaScript에서 null의 존재는 타 언어랑 좀 다르다
//JavaScript에서의 null를 쓸때 null이 존재한다. 즉 null정상 출력
//타 언어에서는 null를 쓸때 보통 '존재하지 않는 object에 대한 'reference(참조)'나 'null pointer'를 나타낼 때 사용한다.
const age = null
alert(age)//null
//그리고 JavaScript에서는 null을 '존재하지 않는(Nothing)값', '비어있는(empty)값', '알 수 없는(unknown)값'을 나타내는 데 사용한다.
//즉 우리가 age에 null값을 줄때 이 의미는 그 값이 비어있음을 뜻한다.

//undefined value(할당되지 않은 상태)
let isValue//const를 사용하지 않은 이유는 const는 무조건 초기화(할당)해줘야 오류가 안남 아니면 빨간줄이 생김
alert(isValue)//undefined
isValue = 123//값을 초기화(할당)해준다
alert(isValue)//123 정상출력
//여기서 또 다시 할당
isValue = undefined
alert(isValue)//undefined
//보통 undefined를 직접할당해준것은 바람직하지 않다 권하지도 않는다.
//변수가 비어있거나 알 수 없는 상태라는 설 나타내려면 null을 사용한다.
//즉 undefined는 초기화하지않은 변수의 예약어(보인지 않은)로 쓰인다

//object(객체)와 symbol(상징)
//object type은 primitive data type(원시데이터타입)이라 부른다
//object는 data collection이나 complex entity(복잡한 실체)를 표현할 수 있다.
//JavaScript에서는 object를 좀 더 특별한 취급을 받는다.
//symbol type(상징타입)은 object의 고유한 식별자(unique identifier)를 만들 때 사용한다.

//typeof operator(타입유형 연산자)
//이것은 변수의 data type을 빠르게 알아내고자 할 때 사용합니다.
//2가지 문법이 있는데
//연산자(operator): typeof x
//함수(function): typeof(x)
typeof undefined //undefined
typeof 0 //number
typeof 1n //bigint
typeof 'hello world' //string
typeof true //boolean
typeof Symbol('id') //symbol
typeof Math //object
//Math는 수학 연산을 제공하는 built-in object이므로 object로 출력된다.
typeof null //object
//null은 사실 object는 아닌데 이것은 하위 호환성을 유지하기 위해 이런 오류를 수정하지 않고 남겨둔 상황이다.
//즉 JavaScript의 자체 문제다. 크게 상관없다.
typeof alert //function
typeof console.log //function
alert(typeof console.log)

//typeof(x) syntax(문법)
//typeof(value)를 쓰든 typeof value를 쓰든 상관이 없다

//과제 문제 풀이

let name = "Semyung";

console.log(`hello ${1}`)//hello 1
console.log(`hello ${"name"}`)//hello name
console.log(`hello ${name}`)//hello Semyung

