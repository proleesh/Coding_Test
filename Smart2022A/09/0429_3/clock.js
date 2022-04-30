//지도교수: 이명호  작성자: 이성혁 Author: Sunghyuk Lee


const clockContainer = document.querySelector('.js-clock')
//querySelector(id 또는 class를 넣는다)
//예: id인 경우: querySelector('#id')
//예: class인 경우: querySelector('.class')
//querySelectorAll(id랑 class를 동시에 넣을수 있다)
//예: id랑 class인 경우: querySelectorAll('#id', '.class')
const clockTitle = clockContainer.querySelector('h1')

function getTime(){
    //시간을 초기화하고 가져온다
    const date = new Date() //날짜 초기화
    const hours  = date.getHours() //시간을 가져오다
    const minutes = date.getMinutes() //분을 가져오다
    const seconds = date.getSeconds() //초를 가져오다
    clockTitle.innerText = // < 10 이유는 10이하숫자 앞에 0을 붙이고 싶어서 이렇게 쓴다 그리고 0$() 괄호가 아니다 0${} brace key 다. 물론 틀리게 써도 오류는 안 난다. 근데 $(object)로 표시된다
    `${hours < 10 ? `0${hours}` : hours} : ${minutes < 10 ? `0${minutes}` : minutes} : ${seconds < 10 ? `0${seconds}` : seconds}`
    
}

//template
function init(){
    //
    getTime()
    setInterval(getTime, 1000)//밀리세컨드(1000분의 1초)마다 getTime함수 반복 실행을 시작한다.
    //setInterval()메서드는 정해진 시간마다 특정 함수를 부를 때 사용할 수 있는 것이다.
    //비슷한 메서드는 setTimeout()라는 것이 있고.
    //setInterval()사용법:
    //예: setInterval(function, delay)
    //여기서 delay에 넣을 것은 숫자다. 보통 1000을 넣는다.
    //1000을 넣을 때 밀리세컨드(1000분의 1초)마다 function 함수 반복 실행을 시작한다는 것이다.
    //그래서 결론는 사용자의 제어를 필요로 하지 않는 반복 실행에는 setInterval()함수를 쓰는 것이 맞습니다.
}

init()
