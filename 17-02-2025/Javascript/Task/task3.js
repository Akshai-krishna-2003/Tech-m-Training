// Pass a number and find if the sum of their digits is an even or odd number

function f1(x){
    var tmp = x
    var s = 0

    while (tmp > 0){

        let x = tmp % 10
        s += x
        tmp = Math.floor(tmp / 10)
    }  
    return s 
}

console.log("Sum of numbers of "+20701+" is "+f1(20701))
