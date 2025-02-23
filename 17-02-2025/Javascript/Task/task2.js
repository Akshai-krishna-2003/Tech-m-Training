// Pass a parameter, and display the factors of that parameter in the function

function f1(x){
    var y = 1
    console.log("Factors of "+x+" is: ")
    for (let i = 1; i <= x; i++){
        if (x % i === 0){
            console.log(i)
        }
    }

}

f1(15)