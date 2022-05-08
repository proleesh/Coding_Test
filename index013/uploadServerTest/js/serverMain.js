// const myObj = {
//     name: "Sunghyuk",
//     age: 24,
//     city: "Seongnam"
// }
// //JSON으로 변환
// const myJSON = JSON.stringify(myObj)

// //JSON을 내보내기
// window.location = "demo_json.html?a=" + myJSON

const xmlhttp = new XMLHttpRequest()
xmlhttp.onload = function(){
    const myObj = JSON.parse(this.responseText)
    document.querySelector('#demo1').innerHTML
    = myObj.name + " " + myObj.age + " 길이는 " + myObj.cars.length + "입니다."
}
xmlhttp.open('GET', "json_demo.txt")
xmlhttp.send()

