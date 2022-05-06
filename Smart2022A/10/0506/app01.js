const firstTitle = document.getElementById("title")
const myList = document.getElementsByClassName("list")
const myTag = document.getElementsByTagName('p')
const mySelector = document.querySelector('.list .blue')
// console.log(firstTitle)
// console.log(myList)
// console.log(myTag)
firstTitle.style.color = 'blue' //표제 색상을 주다
// firstTitle.style.display = 'none' //표제 사라지다
console.log(mySelector)

myList[1].style.color = 'green' //리수트 1번 인덱스에게 색상을 주다
// myList[0].style.display = 'none' //리스트 0번 인덱스들이 사라지다
// myList[1].style.display = 'none' //리스트 1번 인덱스들이 사라지다
for(let i = 0; myTag.length; i++){
    myTag[i].style.color = 'blue'
}//p tag들에게 색상을 주다