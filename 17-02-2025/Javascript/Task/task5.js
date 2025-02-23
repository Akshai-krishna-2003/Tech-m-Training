// Create a object called student with properties id, name, department, college and email. Write a function to access the properties and display them. Invoke the function to display the details
// Write another function to access the properties id, name and email and display them. Invoke the function to display the details
// Add a property called address, as another object, with properties as doorNo, street, area and pincode
// Add a function to display the details of the student with address.
// Delete the property email and the function created to display id, name and email.

var student =  {
    id: 1,
    name: "Akshai Krishna A",
    dept: "CSE",
    clg: "PIT",
    email: "akshaykrishna1983@gmail.com",

    display: function(){
        console.log(student.id+" "+student.name+" "+student.dept+" "+student.clg+" "+student.email)
    }
}

student.display();

function ddp(){
    console.log(student.id+" "+student.name+student.email)
}

ddp()

student.address = {
    doorNo: "3/11",
    street: "Barathidasan street",
    area: "Arakkonam",
    pincode: 631003
}

console.log(student.address)

function dp1(){
    console.log(student.name)
    console.log(student.address.doorNo)
}

dp1()