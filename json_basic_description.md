# JavaScript Object Notation(JSON) Description
### Author: 이성혁(Sunghyuk Lee, 李晟赫) / Reference: w3schools / JSON에 관한 참고문서: https://www.json.org/json-en.html<br>
>1. JSON은 뭐하는 것이지?<br>
>(1) JSON는 JavaScript Object Notation 즉 JavaScript 객체 표기법을 나타 냅니다.<br>
>(2) JSON는 경량 데이터 교환 형식입니다.<br>
>(3) JSON는 JavaScript Object Notation으로 작성된 일반 text입니다.<br>
>(4) JSON는 언어랑 상관이 없습니다. 즉 언어 독립적이다.<br>
>(5) JSON는 컴퓨터 간에 데이터를 전송하는 데 사용됩니다.<br>
>※ JSON 구문은 JavaScript 객체 표기법에서 파생되지만 JSON 형식은 텍스트 전용입니다.<br>
>※ JSON을 읽고 생성하기 위한 코드는 많은 프로그래밍 언어에 존재합니다.<br>
>★ 그리고 JSON형식은 원래 https://www.crockford.com/putin.html 에 의해 지정되었습니다.<br>
>2. JSON을 왜 쓰지?<br>
>(1) JSON 형식은 구문적으로 JavaScript 객체를 생성하기 위한 코드와 유사합니다. 이 때문에 JavaScript 프로그램은 JSON데이터를 JavaScript객체를 쉽게 변환할 수 있습니다.<br>
>(2) 형식이 텍스트 전용이므로 JSON 데이터를 컴퓨터 간에 쉡게 전송할 수 있으며 모든 프로그래밍 언어에서 사용하 수 있습니다.<br>
>(3) JavaScript에는 JSON 문자열을 JavaScript 객체로 변환하는 내장 함수가 있습니다.<br>
>```JSON.parse()```<br>
>(4) JavaScript에는 객체를 JSON 문자열로 변환하는 내장 함수도 있습니다.<br>
>```JSON.stringify()```<br>
>3. JSON의 좋은 특성:<br>
>(1) 서버에서 순수 텍스트를 받아 JavaScript 객체로 사용할 수 있습니다.<br>
>(2) JavaScript 객체를 순수한 텍스트 형식으로 서버에 보낼 수 있습니다.<br>
>(3) 복잡한 구문 분석 및 번역 없이 데이터를 JavaScript 객체로 사용할 수 있습니다.<br>
### JSON구문
JSON구문은 JavaScript 구문의 하위 집합입니다.<br>
### JSON구문 규칙
JSON 구문은 JavaScript 객체 표기법 구문에서 파생됩니다.<br>
* 데이터는 이름/값 쌍에 있습니다.
* 데이터는 쉼표로 구분됩니다.
* 중괄호는 객체를 보유합니다.
* 대괄호는 배열을 포함합니다.
### JSON 데이터 - 이름과 값
JSON 데이터는 이름/값 쌍(일명 키/값 쌍)으로 작성됩니다.<br>
이름/값 쌍은 필드 이름(큰따옴표), 콜론, 값으로 구성됩니다.<br>
```
"name":"John"
```
※주의: JSON 이름에는 큰따옴표(" ")가 필요합니다.<br>
### JSON - JavaScript 객체로 평가
JSON 형식은 JavaScript 객체와 거의 동일합니다.<br>
JSON 에서 Key는 큰따옴표로 작성된 문자열이어야 합니다.<br>
* JSON
```
{"name":"John"}
```
JavaScript 에서 Key는 문자열, 숫자 또는 식별자 이름일 수 있습니다.<br>
* JavaScript
```
{name:"John"}
```
### JSON 값
JSON 에서 값 은 다음 데이터 유형 중 하나여야 합니다.<br>
* 문자열
* 숫자
* 객체
* 배열
* 참이나 거짓
* 없는

JavaScript 에서 값은 위의 모든 값과 다음을 포함한 기타 유효한 JavaScript 표현식일 수 있습니다.<br>
* 기능
* 날짜
* 찾으시는 주소가 없습니다.

JSON 에서 문자열 값 은 큰따옴표로 작성해야 합니다.<br>
* JSON
```
{"name":"John"}
```
JavaScript 에서는 큰 따옴표 나 작은따옴표 로 문자열 값을 작성할 수 있습니다.<br>
* JavaScript
```
{name:'John'}
```
### JavaScript Object(객체)
JSON 구문은 JavaScript 객체 표기법에서 파생되기 때문에 JavaScript 내에서 JSON을 사용하는 데 필요한 추가 소프트웨어는 거의 없습니다.<br>
JavaScript를 사용하면 다음과 같이 객체를 만들고 데이터를 할당할 수 있습니다.<br>
```
person = {name:"John", age:31, city:"New York"};
```
다음과 같이 JavaScript 객체에 액세스할 수 있습니다.<br>
* 예시:
```
//returns John
person.name;
```
```
<!DOCTYPE html>
<html>
<body>

<h2>Access a JavaScript object</h2>
<p id="demo"></p>

<script>
const myObj = {name:"John", age:30, city:"New York"};
document.getElementById("demo").innerHTML = myObj.name;
</script>

</body>
</html>
```
다음과 같이 액세스할 수도 있습니다.
```
//returns John
person["name"];
```
```
<!DOCTYPE html>
<html>
<body>

<h2>Access a JavaScript object</h2>
<p id="demo"></p>

<script>
const myObj = {name:"John", age:30, city:"New York"};
document.getElementById("demo").innerHTML = myObj["name"];
</script>

</body>
</html>
```
데이터는 다음과 같이 수정할 수 있습니다.
```
person.name = "Gilbert";
```
```
<!DOCTYPE html>
<html>
<body>

<h2>Modify a JavaScript Object</h2>
<p id="demo"></p>

<script>
const myObj = {name:"John", age:30, city:"New York" };
myObj.name = "Gilbert";
document.getElementById("demo").innerHTML = myObj.name;
</script>

</body>
</html>
```
다음과 같이 수정할 수도 있습니다.
```
person["name"] = "Gilbert";
```
```
<!DOCTYPE html>
<html>
<body>

<h2>Modify a JavaScript Object</h2>
<p id="demo"></p>

<script>
const myObj = {name:"John", age:30, city:"New York"};
myObj["name"] = "Gilbert";
document.getElementById("demo").innerHTML = myObj.name;
</script>

</body>
</html>
```
### JavaScript 배열을 JSON으로
JavaScript 객체를 JSON으로 작성할 수 있는 것과 같은 방식으로 JavaScript 배열도 JSON으로 작성할 수 있습니다.<br>
### JSON 파일
* JSON 파일의 파일 형식은 .json 입니다.
* JSON 텍스트의 MIME 유형은 "application/json" 입니다.
