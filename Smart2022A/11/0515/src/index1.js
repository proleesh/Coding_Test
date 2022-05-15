class Unit{
    constructor(name, sex, age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    yourName(){
        console.log(`My name is ${this.name}.`)
    }
    yourSex(){
        console.log(`I'm ${this.sex}.`)
    }
    yourAge(){
        console.log(`I'm ${this.age} years old.`)
    }
}
const unit_a = new Unit("Sunghyuk", "male", 24)//My name is Sunghyuk. I'm male. I'm 24 years old.
unit_a.yourName() +  unit_a.yourSex() + unit_a.yourAge()
const unit_b = new Unit("Sunho", "female", 25)//My name is Sunho. I'm female. I'm 25 years old.
unit_b.yourName() +  unit_b.yourSex() + unit_b.yourAge()

// 또는 아래방법으로 가능하다.

class People{
    constructor(){
        this.name = "Sunghyuk"
        this.sex = "male"
        this.age = 24
    }
}

const people = new People();

console.log(`${people.name} ${people.sex} ${people.age}`) //sunghyuk male 24


//다음은 유효성 검사 오류를 점검하는 코드입니다. 상속을 씁니다.
class ValidationError extends Error{
    printCustomerMessage(){
        return `Validation failed :-( (details: ${this.message})`
    }
}
try{
    //예외 발생할 가능성이 있는 문장
    throw new ValidationError("유효한 전화번호가 아닙니다.")
}catch(error){
    //error가 발생할 경우
    //이를 처리하기 위한 문장
    if(error instanceof ValidationError){
        console.log(error.name) //ValidationError가 아니라  Error!
        console.log(error.printCustomerMessage())
    }else{
        console.log('Unknown error', error)
        throw error
    }
}finally{
    //예외발생여부와 관계없이 상황을 수행되어야 하는 문장
}