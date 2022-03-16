var arr = [1, 2, 3];
arr[4] = 5;
console.log(arr);//그럼 콘솔에서 하나 빠진것을 <1 empty item>으로 표시 된다. 우리는 index 4에 값을 5로 넣어서
//[1, 2, 3, <1 empty item>, '5']이렇게 출력이 된다.
console.log(arr.indexOf(1)); //즉 index 0을 표시한다.
console.log(arr.indexOf(3)); //즉 index 2를 표시한다.
console.log(arr.indexOf(5)); //즉 방금 추가한 index 4를 표시한다.
console.log(arr.slice(0,3)); //index 0 ~ 3까지의 index를 출력한다. 3번째 index는 포함되지는 않는다 slice는 일부분을 나타내는 함수다.
console.log(arr.slice(2)); //index 2번부터 끝까지 출력한다. [3, <1 empty item>, 5]같이 출력이 된다.
var aCopy = arr.slice(); //arr를 시작부터 끝까지를 복사한다.
console.log(aCopy);
console.log(arr === aCopy);//false 복사한것은 원본과 똑같이는 않다
arr.push('k', 'a', 'b') //마지막에 element추가
console.log(arr) //방금 push한 값을 배열뒤에 출력 된다
//[1, 2, 3, <1 empty item>, 5, 'k', 'a', 'b']
//pop() method는 끝에서 리턴해주는 함수
console.log(arr.pop());//b
console.log(arr.pop());//a
console.log(arr.pop());//k
console.log(arr.pop());//5
/**unshift() method는 arr의 시작부분에서 element를 추가한다. 
 * shift() method는 arr의 첫 번째 element를 삭제한다.
*/
arr.unshift('Hello')
arr.unshift('Good')
console.log(arr); // ['Good', 'Hello', 1, 2, 3, <1 empty item>]
arr.shift()
console.log(arr)//Good를 삭제하는것을 보일 수 있다.
arr.shift()
console.log(arr)//Hello를 삭제하는것을 보일 수 있다.
arr.shift();
console.log(arr)//1를 삭제하는것을 보일 수 있다.
/**만약에 shift() method로 모든 배열 값을 삭제할 경우 error표시는 안해도 undefined를 return해준다. */
var arr_1 = ['B', 'C', 'A', 'Z', 'G', 1, 4, 3, 5, 8, 7]
arr_1.sort();//단어순으로 배열 혹은 숫자순으로 배열 자동배열
console.log(arr_1) // [1, 3, 4, 5, 7, 8, 'A', 'B', 'C', 'G', 'Z'],
arr_1.reverse()//값을 반전시킨다
console.log(arr_1) // ['Z', 'G', 'C', 'B', 'A', '8', '7', '5', '4', '3', '1']
var arr_2 = ['Yahoo', 'Baidu', 'Naver', 'Google', 'Oracle', 'Tencent', 'Microsoft']
//index 1로 시작해서 4개element를 삭제하고, 3개 추가 즉 edit할때 사용하면 된다. 방법은 만능이다.
arr_2.splice(1, 4, 'Facebook', 'SKHynix', 'Apple') //'Baidu', 'Naver', 'Google', 'Oracle' 이 element들을 삭제
console.log(arr_2)//출력 [ 'Yahoo', 'Facebook', 'SKHynix', 'Apple', 'Tencent', 'Microsoft' ]
//concat() method는 합칠때 쓰는 method다 즉 연결
// var added = arr_2.concat([1, 2, 3])
//console.log(added)
/**
[
  'Yahoo',   'Facebook',
  'SKHynix', 'Apple',
  'Tencent', 'Microsoft',
  1,         2,
  3
] 추가 된것을 볼 수 있다.
 */
//이렇게 쓸수 도 있음
var added = arr_2.concat(5, 6, [7, 8])
console.log(added)
/**
 * [
  'Yahoo',   'Facebook',
  'SKHynix', 'Apple',
  'Tencent', 'Microsoft',
  5,         6,
  7,         8
] 정상적으로 []를 분해해서 출력된다.
 */
//join() method는 실용적인 method다, String을 지정해주면 자동 연결해서 return해준다.
console.log(arr_2.join("-"))
/** Yahoo-Facebook-SKHynix-Apple-Tencent-Microsoft */
/** 다차원 배열 300을 출력하고 싶다*/
var arr_3 = [[1,2,3], [100, 200, 300], '-']
var answer = arr_3 [1][2] //index 1에서 index 2를 추출
console.log(answer)//300
/**안녕! Jemes, Ken, Kent, Nancy와 BOb 님을 출력*/
var names = ['James', 'Ken', 'Kent', 'Nancy', 'Bob']
console.log("안녕! " + names.join(",") + "님")
console.log("안녕! " + names.slice(0, -1) + '와 ' + names.slice(-1) + " 님") //index 0 ~ -1까지 index -1은 Bob이기때문에, -1 제외하고 앞에있는것을 출력
// index -1은 Bob 이기 때문에 slice(-1)하면 바로 출력이 가능하다.
