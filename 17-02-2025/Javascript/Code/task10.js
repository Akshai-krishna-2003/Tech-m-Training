// Closure

function counter() {
    // Private variable
        let count = 0; 
      
       return function () {
         // Access and modify the private variable
            count++;
            return count;
        };
    }
    
    const increment = counter(); // The return in function is substituted
    console.log(counter())
    console.log(increment());
    console.log(increment());
    console.log(increment());