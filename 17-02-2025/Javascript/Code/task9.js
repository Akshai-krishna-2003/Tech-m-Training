const person = {
    firstName: "John",
    lastName: "Doe",
    id: 5566,
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
  };
  

name = person.fullName();
console.log("Full name: "+person.fullName())
console.log("fullName function definition: "+person.fullName);

person.name1 = function () {
    return this.firstName + " " + this.lastName;
  };
  
  person.name2 = function () {
    return (this.firstName + " " + this.lastName).toUpperCase();
  };
  console.log(person.name1())
  console.log(person.name2())
  console.log("name1 function definition: "+person.name1);
  console.log("name2 function definition: "+person.name2);

// document.getElementById("demo").innerHTML = person;

// document.getElementById("demo").innerHTML =
// person.name + "," + person.age + "," + person.city;

delete person.name1;