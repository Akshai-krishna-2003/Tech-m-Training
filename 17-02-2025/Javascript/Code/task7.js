// const person = {
//     firstName: "John",
//     lastName: "Doe",
//     age: 50,
//     eyeColor: "blue"
//   };
//   console.log(person)
  // Create an Object
  const person = {};
  
  // Add Properties
  person.firstName = "John";
  person.lastName = "Doe";
  person.age = 50;
  person.eyeColor = "blue";
  
  console.log(person)

  let age = person.age;
console.log(person.firstName + " is " + person.age + " years //old.");


// let age = person["age"];
// console.log(person["firstName"] + " is " + person["age"] + " years old.");


let x = "firstName";
let y = "age";
console.log(person[x] + " is " + person[y] + " years old.");

person.nationality = "English";
console.log(person);

delete person.age;
console.log(person);