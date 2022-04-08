# JavaScript노트 정리 
#### Made by 스마트IT학부 이성혁(Sunghyuk Lee)
#### 지도교수: 이명호(세명대학교 IT엔지니어링대학)

* JavaScript의 활용
* jQuery: JavaScript Library
* JSON(JavaScript Object Notation, 자바스크립트 객체 표기법): JavaScript의 객체 표기법, 서로 다른 기종의 데이터 전송용으로서 XML을 대체하여 많이 사용되고 있음.

#### JavaScript의 작성 방법
㉠ Inline JavaScript : tag 내부에 직접 작성
```
<tag event = "JavaScript 코드">
<input type = "button" onclick="alert("OK")">
```
㉡ Internal JavaScript(내부에 자바스크립트)
```
<head> tag 또는 <body> tag 내부에 작성
<script>
  JavaScript 코드 
</script>
```
㉢ External JavaScript(외부에 자바스크립트)
```
<script src="JavaScriptFile.js"></script>
```
#### JavaScript의 대화상자
+ ♣ alert("메시지"); 단순 메시지 박스
+ ♣ const 변수 = prompt("메시지", "기본값"); 입력받은 값을 변수에 지정할 때
+ ♣ confirm("메시지"); 사용자의 확인을 받을 경우
#### HTML 요소에 접근하는 방법
1. id로 접근: document.getElementById("tag의 id")
2. name으로 접근: document.getElementByName("tag의 name")
#### Array(배열)
배열 선언
```
const arrays = ["value", "value", "value"];
const fruits = ["apple", "banana", "peach"];
const fruits = new Array();
fruits[0] = "apple";
fruits[1] = "banana";
fruits[2] = "peach";
```
#### function(함수)
(1) 함수 이름이 있는 경우
```
  function 함수이름(매개변수){
      함수몸체;
  }
```
(2) 함수 이름이 없는 경우(anonymous function)

```
  function(매개변수){
      함수몸체;
  }
```
#### HTML 문서에 출력
```
document.write("문장");
```
#### 실습 예제
(1) js.html (기본 실습)
```
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <!-- JavaScript 코드 영역 -->
    <script>
      //JavaScript 영역
      //JavaScript는 자료형이 없음(가변자료형)
      //const 변수명;
      
      //JavaScript 내장 객체 생성
      const now = new Data; // 날짜 객체
      
      //document: Web Page의 최상위 객체, Web Browser에 출력
      document.write(now);
      
      //개발자도구(F12)의 Console 창에 출력
      console.log("날짜:" + now);
    </script>
  </head>
  <body></body>
</html>
```
(2) js_1.html (내부/인라인 스크립트 실습 예제)
```
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <!-- JavaScript 코드 영역 -->
    <script>
      //JavaScript 함수, 리턴타입이 없음
      function test(){
        alert("hello");
      }
    </script>
  </head>
  <body>
    <p>인라인 JavaScript</p>
    <!-- onevent="JavaScript 코드" event가 발생하면 지정된 JavaScript를 실행함 -->
    <!-- <button>버튼을 누르세요.</button> or <input type="submit" value="버튼을 누르세요."> -->
    
    <button value="button" onclick="alert('hello')">버튼을 누르세요. </button>
    <button type="button" onclick="test()">버튼을 누르세요.</button>
  </body>
</html>
```
(3) 외부 JavaScript 실습 예제
+ include/myscript.js
```
function test(){
 alert("hello");
}
```
+ ext.html
```
  <html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <!-- 외부 JavaScript 파일을 include(포함) 시킴 -->
    <script src="../include/myscript.js"></script>
  </head>
  <body>
    <button type="button" onclick="test()">클릭하세요..</button>
  </body>
</html>
```
(4) const_type.html (데이터형 실습)
```
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <script>
      const s;                           //변수 선언(자료형이 없음)
      s = 100;                           //가변자료형(우변의 데이터형에 따라 결정)
      document.write(s + "<br>");        //웹브라우저에 출력
      document.write(typeof(s) + "<br>); //typeof(변수): 변수의 자료형
      s = "세명대학교";
      document.write(s + "<br>");
      document.write(typeof(s) + "<br>");
    </script>
  </head>
  <body></body>
</html>
```
(5) const_str.html (문자열 실습)
```
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <script>
     const s = "Hello World";
     const t = "Semyung University" + "SmartIT";
     document.write(s + "<br>");
     document.write(t + "<br>");
     
     //대문자로 변환
     document.write(s.toUpperCase() + "<br>");
     
     //소문자로 변환
     document.write(s.toLowerCase() + "<br>");
     
    </script>
  </head>
  <body></body>
</html>
```
(6) op-arith.html (연산자 실습)
```
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <script>
      function test(x, y){ //test() 함수의 매개변수 x, y에 값이 전달됨
      // parseInt(문자열): 문자열에서 숫자를 뽑아냄
      //document.write(typeof(x) + "," + typeof(y) + "<br>");
       x = parseInt(x);
       y = parseInt(y);
      //document.write(typeof(x) + "," + typeof(y) + "<br>");
        document.write(x + y + "<br>");
        document.write(x - y + "<br>");
        document.write(x * y + "<br>");
        document.write(x / y + "<br>");
        document.write(x % y + "<br>"); //%는 나머지 구하기
      }
    </script>
  </head>
  <body>
    <form name="form1">
      a <input type="text" name="a" size="10">
      b <input type="text" name="b" size="10">
      <br>
      <input type="button" value="확인" onclick="test(document.form1.a.value, document.form1.b.value)">
    </form>
  </body>
</html>
```
(7) sum.html (id를 활용한 향상된 웹폼 실습)
```
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <script>
    //document.getElementById("tag의 id")
    //tag.value => tag에 입력된 값
    function calc(){
      const x = document.getElementById("x").value;
      const y = document.getElementById("y").value;
      const sum = x + y;
     //웹폼에 입력한 데이터는 스트링으로 처리됨
      sum = parseInt(x) + parseInt(y);
      document.getElementById("sum").value=sum;
    }
    </script>
  </head>
  <body>
    <!--
    id: 중복 불가능, document.getElementById("tag의 id")
    name: 중복 가능, document.getElementByName("tag의 name")
      document.폼name.tagname
      document.myform.x
    -->
    <form name="myform" action="" method="post">
    첫번째 정수: <input id="x" name="x"><br>
    두번째 정수: <input id="y"><br>
    합계: <input id="sum"><br>
    <!-- 버튼을 클릭하면 JavaScript calc() 함수를 호출 -->
    <input type="button" value="계산" onclick="calc()">
    </form>
  </body>
</html>
```
(8) nested_loop.html (구구단 웹폼 출력 실습)
```
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <script>
      document.write("<h1>구구단 표</h1>");
      //따옴표 안에 따옴표 : \" 또는 '
      document.write("<table border='1' width='60%'>");
      for(const i=1; i<=9; i++){
        document.write("<tr>");
        document.write("<td>" + i + "단</td>");
        for(const j = 1; j <= 9; j++){
          document.write("<td>" + i + "x" + j + "=" + i*j + "</td>");
        }
        document.write("</tr>");
      }
      document.write("</table>");
    </script>
  </head>
  <body></body>
</html>
```
(9) array.html(array 웹폼 실습)
```
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>document</title>
    <!-- JavaScript 코드 영역 -->
    <script>
      const fruits = new Array();   //배열 선언
      //document.write(typeof(fruits) + "<br>");
      fruits["a"] = "사과";         //배열 참조변수[인덱스]
      fruits["b"] = "바나나";
      fruits["c"] = "오렌지";
      //const fruits = ["사과", "바나나", "오렌지"];
      //숫자 인덱스일 경우
      for(i = 0; i < fruits.length; i++){
        document.write(fruits[i] + "<br>");
      }
      
      //숫자 인덱스가 아닐 경우
      for(const f in fruits){
        document.write(fruits[f] + "<br>");
      }
      
      //숫자 인덱스 외에 문자열 인덱스도 사용 가능
      document.write(fruits["a"] + "<br>");
      document.write(fruits["b"] + "<br>");
      document.write(fruits["c"] + "<br>");
    </script>
  </head>
  <body></body>
</html>
```
