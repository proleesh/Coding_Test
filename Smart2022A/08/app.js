//0은 falsy(거짓) 1은 truthy(참)
// const question = prompt("ECMA Script 2015는 몇년도에 나왔습니까???")
// if(question == 2015){
//     alert("You're great")
// }else{
//     alert("That's wrong")
// }

// let accessAllowed
// const age_question = prompt("나이가 몇 살 이십니까??")

// if(age_question<=18){
//     accessAllowed = false
// }else{
//     accessAllowed = true
// }
// alert(accessAllowed)

// const age = prompt("청불영화 관람가능 나이 엽력 (true가능/false불가능)")
//우선순위는 (age>18)를 먼저 계산 후 뒤에 계산 즉 비교연산을 먼저한다
// const accessAllowed = (age>18) ? true : false
// alert(accessAllowed)

// const age = prompt("나이를 입력하세요", "예: 18")
// const message = 
// (age < 3) ? "안녕 아기야^^":
// (age <= 19)?"술 금지" :
// (age<30) ? "나이 쳐 먹었네":
// (age<100)?"어른신이군요":"만수무강하세요"
// alert(message)
// : 콜론는 이어지는 조건문을 검사한다
// ? 물음표는 될수있으면 쓰지 않은게 좋다 이유는 가독성이 떨어진다
// 될수 있으면 if~else~를 쓰자

// const num = prompt("숫자를 입력하세요.")

// if(num > 0){
//     alert(1)
// }else if(num < 0){
//     alert(-1)
// }else if(num == 0){
//     alert(0)
// }else{
//     alert("잘 못입력하시거나")
//     alert("오류입니다.")
// }

// const login = prompt('직위를 입력하세요','예: CEO')
// let message = (login == '직원')?'안녕하세요.':(login == '임원')?'환영합니다.':(login == '')?'로그인이 필요합니다.':''
// alert(message)

// const firstName = null
// const lastName = null
// const nickName = "Pokemon"
// alert(firstName ?? lastName ?? nickName ?? "Pokemon")//Pokemon 绕过所有null
//||와 ??의 차이
//||는 첫 번째 truthy 값을 반환한다.
//??는 첫 번째 정의된(defined) 값을 반환한다.

//null과 undefined, 숫자 0을 구분지어 다뤄야 할 때 이 차이점은 매우 중요한 역할을 한다.

// let height = height ?? 100
// console.log(height)//이런경우에 height에 아무 값을 정의하지 않은경우 height에 100이 할당한다.

// const height_2 = 0
// console.log(height_2 || 100)//100
// console.log(height_2 ?? 100)//0

// const length = null
// const width = null

// const area = (length ?? 8989898) * (width ?? 1545)
// //여기서는 먼저 * 이 실행이 된다 다음에 null를 건너뛰고 숫자를 계산한다
// alert(area)//13889392410

// //??는 ||랑 같이 쓸수없다 JavaScript 안정성 관련 이슈 때문에 사용하지 못한다
// // const  error = 1 && 2 ?? 4
// //이렇게 쓰면 된다
// const error = (10 && 20) ?? 30
// alert(error)//20

//?? > ? and =
//괄호 없이 ??를 ||나 &&와 함께 사용하는 것은 금지되어있다

//속하지 않는지를 확인하는 if문
// const age = prompt("나이를 입력(19 ~ 65)")
// if(!(age >= 19 && age <= 65)){
//     alert("아이 이네요")
// }
// if(age < 19 || age > 65){
//     alert("범위 초과")
// }

// -1 || 0 은 -1 이므로 truthy이다
// if(-1 || 0) alert('first')
// -1 && 00은 0이므로 falsy이다
// if(-1 && 00) alert('second')

//간단한 로그인 구현하기
// const id = prompt("아이디")
// if(id == "Admin"){
//     const passwd = prompt("비밀번호")
//     if(passwd == "" || passwd == null){
//         alert("취소되었습니다.")
//     }
//     //else if(passwd != 'TheMaster'){
//         //alert("인증에 실패하였습니다.")
//     //}
//     else if(passwd == 'TheMaster'){
//         alert("환영합니다.")
//     }else{
//         alert("인증에 실패하였습니다.")//else if를 써도 되고 이렇게 해도 된다 결과는 똑같다
//     }
// }else if(id == "" || id == null){//null일때 즉 esc 누르면 취소
//     alert("취소되었습니다.")
// }else{
//     alert("사용자가 존재하지 않습니다.")
//     alert("다시 확인 하십시오.")
// }

// let num_1 = 0;
// while(num_1 < 3){
//     alert(num_1)//0 1 2
//     num_1++
// }

// let num_2 = 3
// while(num_2){
//     alert(num_2) //3 2 1
//     num_2 --
// }
//이렇게 써도 된다
// let num_3 = 3; while(num_3)alert(num_3--)

// let num_4 = 0

// do{
//     alert(num_4) // <-- 반복문 본문
//     num_4
// }while(num_4 < 3)

//begin생략
// let num_5 = 0
// for(;num_5 < 3; num_5++){
//     alert(num_5) //0 1 2
// }

//step생략
// let num_6 = 0
// for(;num_6 < 3;){
//     alert(num_6) //0무한 루프
// }

// let num_7 = 0;
// while(true){
//     let value = +prompt("숫자를 입력하세요.", '')

//     if(!value)break
//     num_7 += value
    
// }
// alert('합계: ' + num_7)

let i = 0
while(++i < 5)alert(i)
//미리 더하기 때문에 1 2 3 4

let b = 0
while(b++ < 5)alert(b)
//b는 이미 증가한 이후이기 때문에 1 2 3 4 5

