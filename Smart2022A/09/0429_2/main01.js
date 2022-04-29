//지도교수: 이명호  작성자: 이성혁 Author: Sunghyuk Lee


const depts = ["SmartIT", "ICT", "SMU", "BigData", "AI", "Deep Learning"]

// 1) for(초기값; 조건절; 증감) {} loop
for(let i = 0; depts.length; i++){
    document.getElementById('for').innerHTML = '<li>' + depts[i] + '</li>'
}

// 2) while
let j = 0
while(j < depts.length){
    document.getElementById('while').innerHTML += '<li>' + depts[j] + '</li>'
    j++
}

// 3) do ~ while
let k = 0
do{
    document.getElementById('while').innerHTML += '<li>' + depts[k] + '</li>'
}while(k < depts.length)

//forEach(), reduce(), map()~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
depts.forEach(function(dept){//괄호안에 option는 단수가 원칙이다.s를 붙이지마라(복수 안 된다)
    document.getElementById('while').innerHTML += '<li>' + dept[k] + '</li>'
}) //<- callback function (많이 쓴다)


//arrow function
depts.forEach((dept) => {
    document.getElementById('while').innerHTML += '<li>' + dept + '</li>'
})


//for ~ of  형식: for(option of object)
let dept
for(dept of depts){
    document.getElementById('forof').innerHTML += '<li>' + dept + '</li>'
}

