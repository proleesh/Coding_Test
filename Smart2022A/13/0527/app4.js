const box = document.getElementById('box');
const list = document.getElementById('list');
const color = document.getElementById('color');

document.body.addEventListener("click", ()=>{
    console.log("1, body")
})//body tag를 addEventListener로 출력했을 때 반드시 document.body로 알려줘야 한다. 컴퓨터는 모르니까!
//예시: document.body.addEventListener()
box.addEventListener("click",()=>{
    console.log("2, div")
})
list.addEventListener("click", ()=>{
    console.log("3, ul")
})
color.addEventListener("click", ()=>{
    console.log("4, li")
})