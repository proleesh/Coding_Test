
// var junha = {
//     name:"준하",
//     birth:1955,
//     'company': "microsoft",
//     height: 1.88,
//     score: 100,
//     weight: null
// }

// console.log(junha.birth);
// console.log(junha.weight);
// console.log(junha.age) //age라는 객체가 없기때문에 undefined 못찾음
// console.log(junha['company']) //microsoft
// delete junha['company']
// console.log(junha['company'])
// console.log('company' in junha); //false delete했기 때문에
// console.log('height' in junha); //true
// console.log('score' in junha); //true
// console.log('toString' in junha); //true
// //toString은 객체에 정의되어 있고 모든 객체는 결국 프로토타입 체인의 객체를 가리키므로 junha에는 toString 속성도 있다.
// let kata = {
//     name: "kata",
//     sex: "male",
//     score: 99
// }
// var score = 80;
// if(score >= 90){
//     console.log("great")
// }else{
//     console.log("loser")
// }//loser

// if(score >= 99){
//     console.log("great")
// }else if(score == 80){
//     console.log("equals")
// }else{
//     console.log("loser")
// }//equals

// let kafka = 'THANKYOU'
// if(kafka.length){
//     console.log(kafka.length); //8
// }

var height = parseFloat(prompt('신장을 입력하세요(m): '));
var weight = parseFloat(prompt('체중을 입력하세요(kg): '));
//쓸때 주의 m(미터)로 설정했기 때문에 1.xx형식으로 쓴다
//체중은 xx.xx이런 형식으로
var BMI = weight / (height*height);

if(BMI >= 32){
    alert("당신은 고도비만 입니다.")
    alert("살을 빼세요. 아니면 죽습니다. ")
}else if(BMI <= 32 && BMI >= 28){
    alert("당신은 비만 입니다.")
    alert("살을 빼세요. 아니면 병이 걸립니다.")
}else if(BMI <= 28 && BMI >= 25){
    alert("당신은 과체중 입니다.")
    alert("식사량을 좀 줄이세요.")
}else if(BMI <= 25 && BMI >= 18.5){
    alert("당신의 체중은 정상 입니다.")
    alert("몸매를 유지하십시오.")
}else if(BMI <= 18.5){
    alert("당신의 체중이 매우 낮습니다.")
    alert("건강에 문제가 야기 될수있습니다.")
}else{
    alert("잘못입력하거나 오류입니다.")
}
var m = new Map([['Katty', 67], ['Jacy', 88], ['Nancy', 98]]);
alert(m.get('Nancy')); //98
m.set('Adam', 66) //add Adam & score 66
m.set('Sebastian', 100) //add Sebastian & score 100
alert(m.has('Adam')) //view Object True or Flase
m.delete('Nancy')
alert(m.get('Nancy')) //undifended
m.set('Sebastian', 83)
alert(m.get('Sebastian')) //83 (killer history value)

var s = new Set(); //empty Set
var s1 = new Set([1, 2, 3, 2, 4, 3, 3, '3']) //input 1, 2, 3
alert(s1) //object Set
s1.add(4);
alert(s1)
// alert('당신의 브라우저는 Map와 Set를 Support합니다.')

// var a = [1, 2, 3];
// for(var x of a){
// }
// alert('당신의 브라우저는 for ... of를 support합니다. ')
var a = ['A', 'B', 'C'];
var Aset = new Set(['A', 'B', 'C'])
var Amap = new Map([['A', 1], ['B', 2], ['C', 3]])
// for(var x of a){
//     alert(x); // A B C 순서대로 나온다
// }
// for(var x of Aset){
//     alert(x); // A B C 순서대로 나온다
// }
for(var x of Amap){
    alert(x); // A, 1 B, 2 C, 3 순서대로 나온다
    alert(x[0] + '=' + x[1]) // A = 1, B = 2, C = 3
}
//iterable 반복 가능한
//Array Example:
a.forEach(function(element, index, array){
    //element: 현재 element를 지향
    //index: 현재 index를 지향
    //array: 현재 Array 객체 자신을 지향
    alert(element + ', index=' + index) //A, index=0 B, index=1 C, index=2
})
//forEach() method는 ES 5.1버전에서 도입해서 브라우저에서 실행 불가능할 수 있음
//===================================================
//Set Example:
Aset.forEach(function(element, sameElement, set){
    alert(element) //A B C
})
//===================================================
//Map Example:
Amap.forEach(function(value, key, map){
    alert(value) // 1 2 3
})
//간편하게 사용하고 싶으면 그냥 element로 property를 추출하면 된다
a.forEach(function(element){
    alert(element) //A B C
})

var r1 = 12.34
var r2 = 9.08
var r3 = 73.1
var st1 = 3.14 * r1 * r1
var st2 = 3.14 * r2 * r2
var st3 = 3.14 * r3 * r3

function abs(x){
    if(x >= 0){
        return x;
    }else{
        return -x;
    }
}
//function는 이 함수의 definition
//abs는 이 함수의 이름
//x는 이 함수의 attribute value 많은 value는 ,로 분리
//{ ... }사이에 코드는 함수체, 많은 문단을 포함 가능하고 심지어 없어도 됨
var abs_1 = function (x){
    if(x >= 0){
        return x;
    }else{
        return -x;
    }
}
alert(abs_1(10)); //10
alert(abs_1(100));//100
alert(abs_1(-1)); //1
alert(abs()); //NaN

function abs_2(x){
    if(typeof x !== 'number'){
        throw 'Not a number';
    }
    if(x >= 0){
        return x;
    }else{
        return -x;
    }
}
alert(abs_2(1));

//arguments 비슷한 method는 array 근데 array랑 같지는 않습니다.
function foo(x){
    console.log('x = ' + x);
    for(var i=0; i<arguments.length; i++){
        alert('arg ' + i + '=' + arguments[i]);
        //arg0 = 10, arg1 = 20, arg2 = 30
    }
}
alert(foo(10, 20, 30))

function abs_3(){
    if(arguments.length === 0){
        return 0;
    }
    var x = arguments[0];
    return x >= 0 ? x:-x;
}

alert(abs_3())
alert(abs_3(10))