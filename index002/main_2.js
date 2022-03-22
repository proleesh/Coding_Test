function ask(question, yes, no){
    if(confirm(question)){
        yes();
    }else{
        no();
    }
}
// function chooseYes(){
//     alert("You are bad!")
// }

// function chooseNo(){
//     alert("You are great!")
// }

// ask("Are you smoking?", chooseYes, chooseNo)
ask(                            //이렇게 써도 됨 간화방법
    "Are you smoking?",
    function chooseYes(){
        alert("You are bad!")
    },
    function chooseNo(){
        alert("You are great!")
    }
)