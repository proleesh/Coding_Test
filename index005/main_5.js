
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
