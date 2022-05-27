const box = document.getElementById('box');
const list = document.getElementById('list');
const color = document.getElementById('color');

document.body.addEventListener("click", ()=>{
    console.log("1, body")
})
box.addEventListener("click",()=>{
    console.log("2, div")
})
list.addEventListener("click", ()=>{
    console.log("3, ul")
})
color.addEventListener("click", ()=>{
    console.log("4, li")
})