'use strict';
 alert("Hello world")//Hello world
/*alert("주석 area")*/
 alert(1+2);//3
 alert((1+2)*5);//15
 alert(123456);//정수
 alert(2/0); //Infinity 무한대 
 alert(10 % 3); //1 나머지 값을 구한것 Java랑 똑 같음
 alert(true);
 alert(false);
 alert(2<1); //false 거짓임을 나타남.
 alert(true && true); //true
 alert(false && true); //false
 alert(true && false); //false
 alert(false && false); //false
 alert(false && true && true); //false
 alert(true && true && true); //true
/**즉 false가 있으면 무조건 false, 모두 true일때 true */
 alert(false || false); //false
 alert(true || false); //true
 alert(false || true || false); //true
 /**즉 true가 있으면 무조건 true, 모두 false일때 false */
 alert(! true); //반대로 false
 alert(! false); //반대로 true
 alert(! (2>5)); //반대로 true
 /**즉 !를 추가해주면 반대로 값을 출력한다 */
 var age = 10;
 if(age >= 18){
     alert("adult")
 }else{
     alert("teen")
 }//teen이 출력 된다, 18세보다 작기 때문에
 alert(false==0); //true
 /** == 이것은 데이터 타입을 자동 전환해서 비교 */
 alert(false===0); //false
/** === 이것은 데이터 타입을 비자동 전환해서 비교 */
/** 보통 === 이런걸 많이 씀, 이것은 JavaScript 설계의 단점 */
 alert(NaN === NaN);//false
 alert(isNaN(NaN));//isNaN는 NaN를 판단하는데 사용함수 출력 값은: true
 alert(1/3 === (1-2/3)); //false
 alert(Math.abs(1/3 - (1-2/3)) < 0.0000001); //true 컴퓨터에게 정확도를 지정해줬을때 Math.abs함수 씀
 var arr = [1, 2, 3.14, 'Hello', null, true];
 alert(arr[0])//1
 alert(arr[1])//2
 alert(arr[2])//3.14
 alert(arr[5])//true
 var person={
     name: 'James',
     age: 20,
     tags: ['js', 'web', 'laptop'],
     city: 'seoul',
     hasCar: true,
    zipcode: null
 };
 alert(person.name) //James
 alert(person.city) //seoul
 alert(person.age) //20
 alert(person.zipcode) //null

 var a;
 alert(a); //undefined 뜻은 불확실한 이유는 할당값을 안 줬기 때문에
 a = 100;
 alert(a); //100으로 정상적으로 나옴. 이유는 할당값을 넣어 줬기 때문에
var names  = 'sunghyuk';
 alert(names); //sunghyuk
console.log(names); //run code하면 콘솔창에서 출력된다.
/**String names = 'sunghyuk'보통 Java에서 변수를 지정했을때 쓰는 방법이고
 * 그리고 Java는 Static즉 정적 언어이기 때문에 타입형을 쓰면 그 타입형을 
 * 따라줘야 값이 출려되기 때문에 JavaScript에서는 동적언어 이기때문에 따로
 * 지정할 필요없이 자동적으로 타입형이 변환된다
 */
 console.log랑 alert의 큰 차이는 없지만, alert가 브라우저에서 자꾸 튀어나온다는 복잡함을 줄어들기 위해서 console.log를 쓴다. 편하게 coding하고 테스트 가능하다
 i = 'good job'; //var를 쓰지않고 정의는 가능하지만 이렇게하면 전역 변수가 된다.
 /** 이것은 JavaScript의 설계한 단점이라고 할 수 있고 ECMA에서 strict모델을 출시해서 단점을 보완할 수 있게된다. */
 /** 우리는 'use strict'; 를 미리 선언하면 된다 */
 console.log(i);
 alert(i); 새로운 VSCode버전에서 이것을 보완한거 같아서 더는 안쓴다.
 alert(`이렇게도 사용가능 함
//     안녕
// `) //``이것을 쓰면 다행으로 출력가능함
var age = 24;
var message = '안녕, ' + names + ', 나 올해 '+ age + '세 입니다. ';
 alert(message);
/** 물론 +로 연결되지만 ${name} 이런 식으로 써놓아도 가능함 */
 var message1 = '안녕, ${names}, 나 올해 ${age}세 입니다. '  //브라우저에서 지원하지 않아서 포기
 alert(message1);
console.log(names.length); //콘솔창에서 8개로 나옴
 alert(names.length); //8 s u n g h y u k
console.log(names[0]);//s
console.log(names[1]);//u
console.log(names[2]);//n
console.log(names[7]);//k
console.log(names.toUpperCase()); //모두 대문자로 출력 SUNGHYUK
console.log(names.toLowerCase()); //모두 소문자로 출력 sunghyuk
console.log(names.indexOf('hyuk')); // s - 0, u -1, n - 2, g - 3, h - 4
/**indexOf()는 지정된 문자열의 발생한 위치를 찾는 것임 */
console.log(names.indexOf("Hyuk")); //대문자H를 못찾아서 -1로 출력됨
console.log(names.substring(0, 8)); //sunghyuk출력 인덱스 0 ~ 8까지 8은 포함하지않다.인덱스 8앞에것을 출력
console.log(names.substring(7)); //k출력 7번제 인덱스를 가져오고 싶으니까. 





