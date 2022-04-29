//지도교수: 이명호  작성자: 이성혁 Author: Sunghyuk Lee


const clockContainer = document.querySelector('.js-clock')
const clockTitle = clockContainer.querySelector('h1')

function getTime(){
    //시간을 초기화하고 가져온다
    const date = new Date() //날짜 초기화
    const hours  = date.getHours() //시간을 가져오다
    const minutes = date.getMinutes() //분을 가져오다
    const seconds = date.getSeconds() //초를 가져오다
    clockTitle.innerText = // < 10 이유는 19이하숫자 앞에 0을 붙이고 싶어서 이렇게 쓴다 그리고 0$() 괄호가 아니다 0${} brace key 다. 물론 틀리게 써도 오류는 안 난다. 근데 $(object)로 표시된다
    `${hours < 10 ? `0${hours}` : hours} : ${minutes < 10 ? `0${minutes}` : minutes} : ${seconds < 10 ? `0${seconds}` : seconds}`
    
}

//template
function init(){
    //
    getTime()
    setInterval(getTime, 1000)
}

init()