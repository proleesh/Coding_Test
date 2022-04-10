const sunghyuk = {
    name: '성혁',
    birth: 1999,
    age: function(){
        const year = new Date().getFullYear();
        return year - this.birth;
        //this는 무엇일까?
        //this는 특수변수이고. 그는 항상 현재 객체를 지향하고, 여기서는 sunghyuk이라는 객체의 변수를 지향합니다.
        //this.birth를 하면 우리는 객체sunghyuk의 birth라는 property를 가져올수 있다.
    }
}
console.log(sunghyuk.age());//23 출력

//그리고 이렇게도 쓸수 있다.

function getAge(){
    const year_1 = new Date().getFullYear();
    return year_1 - this.birth_1;
}

const hanule = {
    name_1: '하늘',
    birth_1: '1993',
    age_1: getAge
}

console.log(hanule.age_1());//29 출력
//그런데 getAge를 하면
console.log(getAge.apply(hanule, [])) //29 출력 this 지향 hanule
console.log(Math.min.apply(null, [3, 5, 4])) //apply 최소값 3 출력
console.log(Math.max.apply(null, [3, 5, 4])) //apply 최대값 5 출력
console.log(Math.max.call(null, 3, 5, 4)) //call 최대값 5 출력
console.log(Math.min.call(null, 3, 5, 4)) //call 최대값 3 출력


console.log(getAge()) //NaN 출력
//왜 이럴까?
//JavaScript에서 우리는 this라는 특수변수를 사용했다. 그런데 this는 도데체 누굴 지향하는걸까?
//답은 상황마다 다른데! 여기서 hanule.age_1로 말하자면, 이 함수의 this는 호출된 객체를 지향하고 있고, 즉 hanule를 지향하고있고.
//만약에 단독적으로 함수를 호출한다면. getAge()로 예를들어, 이함수의 this는 전역객체를 지향하고있다, 즉 window라는 것이죠.
//그래서 이런경우를 피하려면 우리는 엄격한 모드를 써야합니다. 즉 'use strict'
'use strict'

const kakao = {
    name_2: '카카오',
    birth_2: '1995',
    age_2: function(){
        // const that = this;
        // function getAgeFromBirth(){
        const year_2 = new Date().getFullYear();
        return year_2 - this.birth_2;
        // }
        // return getAgeFromBirth();
    }
}
// const fn = kakao.age;
// console.log(fn()); //main_7.js:46 Uncaught TypeError: fn is not a function 이렇게 알려준다.
//오류를 즉시 발견할 수 있는데, this의 지향문제를 해결하지는 못했다.
// console.log(kakao.age_2()) //NaN라고 나온다.
console.log(kakao.age_2()) //27 출력

const count = 0; //초기화
const oldParseInt = parseInt; //원래 함수 저장

// window.parseInt = function(){
//     count += 1;
//     return oldParseInt.apply(null, arguments);
// } ES2015이후 표준는 지원하지 않음 ㅠㅠㅠ
