// (2)
function sayHello(){
    alert("안녕하세요!")
}

// (3)
const element = document.getElementById("btn")
element.onclick = sayHello;
// 다음 처럼 쓰면 '안녕!' 이 자신한테 출력이 된다.
// element.onclick = function(){
//     alert("안녕!")
// }
// btn.onclick = function(){
//     alert("안녕!")
// }

// (4)
const element2 = document.getElementById('btn2');
element2.addEventListener("click", sayHello); //여기에서 함수는 아니다 틀린 입력법: sayHello()


// (5) arrow function (요즘에 주로 쓴다)
const element3 = document.getElementById('btn3')
element3.addEventListener('click', () => {
    alert('이 과정은 코딩실습 입니다.')
})

