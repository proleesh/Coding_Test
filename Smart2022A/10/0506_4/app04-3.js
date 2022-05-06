class Person{
    //constructor 클래스에는 생성자(constructor)가 반드시 있다
    //constructor() 아무것도 없는경우 default constructor라고 한다.
    constructor(name, age){ //보통 이런것을 자동으로 완성할 수 있다
        this.name = name;
        this.age = age;
    }
    //methods (방법 또는 메서드)
    speak(){
        console.log(`${this.name}: Hello!!!`);
    }
}

const smart = new Person('Smart01', 2)
console.log(smart.name) //Smart01
console.log(smart.age) //2
smart.speak() //Smart01: Hello!!!