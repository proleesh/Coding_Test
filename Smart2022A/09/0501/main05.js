// 작성자: 이성혁 Author: Sunghyuk Lee

// Class Object-Oriented Language 類객체지향 언어 對象面向編程
// 1. class 類
/**
 * template 模板
 * declare once 宣言一次
 * no data in 無數據
 */
// 2. object 對象
/**
 * instance of a class 一個類的列子
 * created many times 生成很多時間
 * data in 輸入數據
 */
'use strict' //엄격모드 사용
/**
 * Object-Oriented Programming
 * class: template
 * object: instance of a class
 * JavaScript Classes
 * - introduced in  ES6
 * - syntactical sugar over prototype-based inheritance
 */
// (1) Class declarations 클래스 선언
class Person{
    //constructor 생성자
    constructor(name, age){
        //fields 田
        this.name = name
        this.age = age
    }

    // methods
    speak(){
        console.log(`${this.name}, hello! I'm ${this.age}years old.`)
    }
}
// const person01 = new Person(prompt("What's your name?"), prompt("How old are you?"))
// person01.speak() //콘솔: Sunghyuk, Hello! I'm 24 years old.
const person02 = new Person('Sunghyuk', 24)
console.log(person02.name) // Sunghyuk
console.log(person02.age)  // 24
person02.speak() // Sunghyuk! Hello! I'm 24 years old

//Getter & Setter
class user{
    constructor(firstName, lastName, age){
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    get age(){
        return this._age
    }
    set age(value){
        this._age = value < 0 ? 'age can not be negative!!!' : `Age: ${value}`
        //이렇게 쓸수도 있다. if문 형식:
        /**if(value < 0){
         *  throw Error('age can not be negative!!!')
         * }
         * this._age = value
         * 둘이는 똑 같다
        */
    }
}
const user1 = new user('Sunghyuk', 'Lee', 24)
console.log(user1.age)//Age: 24

// Fields (public, private)
class Experiment{
    publicField = 2
    #privateField = 0
}
const experiment = new Experiment()
console.log(experiment.publicField)//2
console.log(experiment.privateField)//undefined

//Static properties and methods
/**
 * class 안에 있는 fields와 methods들은 새로운 object를 만들 때마다
 * 그대로 복제되어서 값만 지정되어 만들어 진다.
 * 그러나 object에 상관없이 class가 가지고 있는 고유한 값과 이러한 데이터와 상관없이
 * 동일하게 반복적으로 사용되어지는 method가 있을 경우 static이라는 키워드를 붙이면 object와
 * 상관없이 class 자체에 연결되어 있다.
 */
class Article {
    static publisher = 'Hello world'
    constructor(articleNumber){
        this.articleNumber = articleNumber
    }
    static printPublisher(){
        console.log(Article.publisher)
    }
}
const article1 = new Article(1)
const article2 = new Article(2)
/**
 * 만약 static을 사용하지 않았다면 아래 코드는 실행되었을 것이다.
 * 그러나 실행하면 undefined가 나온다.
 * static은 object 마다 할당되어 지는 것이 아니라
 * class Article에 붙어있기 때문이다.
 * console.log(Article.publisher)
 */
/**
 * 따라서 static 함수를 호출할 때에도 class이름을 이용하여 호출하면 된다.
 * static은 object에 들어오는 데이터에 상관없이 공통적으로 class에서
 * 쓸수 있는 것이라면 static과 static method를 이용하여 작성하는 것이
 * 메모리의 상용을 조금 더 줄여줄 수 있다.
 */
Article.printPublisher() //Hello world
// Inheritance & Polymorphism 상속성 & 다향성
// a way for one class to extend another class.
// 한 클래스가 다른 클래스를 확장하는 방법
class Shape{//부모 클래스
    constructor(width, height, color){
        this.width = width
        this.height = height
        this.color = color
    }
    draw(){
        console.log(`drawing ${this.color} color of`)
    }
    getArea(){
        return this.width * this.height
    }

}
// Inheritance 像Java Language 用extends來繼承
class Rectangle extends Shape{}//자식 클래스 직사각형이 형태에서 상속받다
class Triangle extends Shape{//자식 클래스 삼각형이 형태에서 상속받다
    // Polymorphism
    draw(){
        super.draw()//super를 이용하면 부모클래스에서 슈퍼권한으로 상속받는다 즉 부모꺼를 모두 쓸수 있다.
        console.log('□')
    }
    getArea(){
        return (this.width * this.height)
    }
    toString(){
        return `Triangle: color: ${this.color}`
    }
} 
const rectangle = new Rectangle(20, 20, 'blue')
rectangle.draw()//blue
console.log(rectangle.getArea())//500

const triangle = new Triangle(20, 20, 'yellow')
triangle.draw()//□
console.log(triangle.getArea())//400

// Class checking: instanceof (實例, 예)
console.log(rectangle instanceof Rectangle) //true
console.log(triangle instanceof Rectangle) //false
console.log(triangle instanceof Triangle) //true
console.log(rectangle instanceof Triangle) //false
console.log(rectangle instanceof Shape) //true
console.log(triangle instanceof Shape) //true
console.log(triangle instanceof Object) //true
console.log(triangle.toString()) //Triangle: color: yellow