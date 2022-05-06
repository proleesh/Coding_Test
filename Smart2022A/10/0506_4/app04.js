// 1) 함수를  argument를 전달
function doSomething(add){
    const result = add(2, 3)
    console.log(result)
}
// 2) value를 return하는 함수
function add(a, b){
    const sum  = a + b
    return sum
}

// 3) function call
doSomething(add)

console.log(add(2, 3))

// 4) function declaration (함수 선언식)
function doSomething_String(){
    console.log("안녕하세요")
}
doSomething_String()//안녕하세요