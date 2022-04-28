'use strict'

function myFunction(){
    //id를 통해 입력값을 가져오기
    let inputNum = document.querySelector("#num").value
    //만약에 입력한 값이 숫자가 아니면 혹은 1 ~ 10 범위에 없으면
    let displayOne
    //isNaN() 함수는 어떤 값이 Not a number인지 판별합니다.
    //예를 들어 숫자가 아닌 문자를 입력했다면 이때 작동합니다.
    if(inputNum < 1 || inputNum > 10){
        displayOne = "Sorry! not valid value."
        + "<br> Please check again!" 
    }else if(isNaN(inputNum)){
        displayOne = "Sorry! Not a Number"
    }else{
        displayOne = "Currect! Input is Number"
    }
    document.querySelector("#demo01").innerHTML
    = displayOne
}
//현재 시간을 알려준다
function myCurrentTime(){
    document.querySelector(".disTime").innerHTML
    = Date()
}
//대문자로 변환
function changeYourName1(){
    const inputWordUpper = document.querySelector("#cgName1")
    inputWordUpper.value = inputWordUpper.value.toUpperCase()
}
//소문자로 변환
function changeYourName2(){
    const inputWordLower = document.querySelector("#cgName2")
    inputWordLower.value = inputWordLower.value.toLowerCase()
}
//마우스 매직 변환
function omOver(om){
    om.innerHTML = "안녕"
}
function omOut(om){
    om.innerHTML = "하하하하하"
}
function omUp(om){
    om.style.background = "#84451b"
    om.style.fontsize = "20px"
    om.innerHTML = "안녕"
}
function omDown(om){
    om.style.background = "#48f774"
    om.style.fontsize = "25px"
    om.innerHTML = "你好"
}