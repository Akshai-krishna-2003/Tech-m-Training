// Without passing parameters, display the multiplication table with two variables , one variable for the number and the other for the limit.

function mul(){
    var v1 = 2
    var v2 = 10

    for (let i = 1; i <= v2; i++){
        console.log(v1+" x "+i+" = "+(i*v1))
    }
}

mul()