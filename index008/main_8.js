//type conversion practice 类型转换练习
const str = "안녕"
alert(typeof str)//String

const str_num = "123456"
alert(typeof str_num)//String
const number = Number(str_num)
alert(typeof number)//number

const numberString = Number("난20살")
alert(numberString)//NaN

alert(Number(true))//1
alert(Number(false))//0
alert(Number("123"))//123
alert(Number("1a2b3c"))//NaN
//数字和字符混合时出现NaN
//Null是0, undefined是NaN

//boolean conversion practice 布尔值转换练习
//像是0, empty, String, null, undefined, NaN直观上感觉是没有值的这些会返回false
//以上出外的都是true
alert(Boolean(1))//true
alert(Boolean(0))//false
alert(Boolean("123"))//true
alert(Boolean("hello world"))//true
alert(Boolean())//因为是空的(empty), 所以是false
//但是像是这种情况
alert(Boolean(" "))//true
//这种情况是因为我们给了String的双引号，双引号里面有空格计算机误认为是String也会输出true
//综上所述 String, number, boolean等都是type conversion（类型转换）常发生的类型转换

