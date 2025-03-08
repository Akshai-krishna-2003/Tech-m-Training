function show(a,b,c){
    console.log(a+" "+b+" "+c);
 }
  
 show(12)                   // 12 undefined undefined
 show("Arun","Kumar")      // Arun Kumar undefined
 show(12,4,53)             // 12 4 53
 show("Jay","John",78)     // Jay John 78
 show(1,2,3,4)             // 1,2,3
 
//  Js is not a strictly tyed language 
//  It is a very flexible language 
 
 a=[34,35,35,6,34,5433,534,34,53]
  
 console.log(a[3])  // 6
 console.log(a[99])  // undefined
 a[99]=90  
 console.log(a[99])  // 99
 
 person = {sno: 1, name: "Ganesh"}
 
 person.skills = ["Java", "Javascript"] // Accepted 
 
 console.log(person.skills) 