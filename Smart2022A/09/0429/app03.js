//작성자: 이성혁 Author: Sunghyuk Lee

const stringFive = '5'
const numberFive = 5

//1) loose equality with type conversion(==)
console.log(stringFive == numberFive) //true

//2) strict(엄격) euqality, not type conversion(===)
//즉 엄격하게 하면 === 이 것을 사용한다
//false의 이유는 문자열과 숫자는 같지 않기 때문이다
//대다수 === 이 것을 많이 사용한다
console.log(stringFive === numberFive) //false

//3) 0, null, '', -> false 로 취급
console.log(0 == false) //ture
//false의 이유는 위랑 똑같이 엄격하게 말하자면 숫자랑 boolean 타입은 같지 않다.
console.log(0 === false) //false
//문자열 공백은 보통은 false로 취급
console.log('' == false) //true
//문자열 공백은 엄격하게 말하면 boolean이랑 다른 것이다
//다시말해 문자열은 boolean이랑 같지않다.
console.log('' === false) //false
//null은 보통은 값이 없을 때 undefined다
console.log(null == undefined) //true
//똑같이 엄격하게하면 같지않다
console.log(null === undefined) //false

//Operator equality
const name = 'SmartIT'

if(name === 'SmartIT'){
    console.log('Welcome to School of SmartIT!!')
}else if(name === 'ict'){
    console.log('Welcome to School of ICT!!')
}else{
    console.log('Unkonwn')
}

//switch statement
const browser = 'Chrome'

switch(browser){
    case 'IE':
        console.log('나빠요!!')
        break
    case 'Chrome':
        console.log('좋아요!!')
        break
    case 'FireFox':
        console.log('조금 좋아요!!')
        break
    default:
        console.log('브라우저 비슷해요!!')
        break
}