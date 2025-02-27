
// PascalCasing --> First letter should be Capitalized 
function Message(){
    console.log("Message component is rendering"); // For debugging 

    // This syntax is called JSX - JavaScript XML

    // Can give any expressions like this that can evaluate to a value like this 

    // We can also use if statements too like this 

    const name = "Akshai"

    if (name)
        return <h1> Hello World {name}</h1>;
    else 
        return <h1>Hello World This has no name</h1>
    
}

// To use this component we export it as
export default Message;