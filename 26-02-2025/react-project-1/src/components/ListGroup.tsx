import { Fragment } from "react";

function ListGroup() {
  const items = ["Ford", "BMW", "Audi", "Mercedes", "Toyota"];

  // To render the above list we cannot use for loop as jsx doesnt have it so we have another alternativve for this named 'map'
  items.map((item) => <li>{item}</li>);
  let i = 1;

  return (
    // <h1>List group </h1> // gives us error coz return can only return a single component at a time  // React.createElement('h1')

    // Using fragment will not create a new DOM like thing but yea this is useful fr
    <Fragment>
      <h1>List Group</h1>
      <ul className="list-group">
        {/* <li className="list-group-item">An item</li>
        <li className="list-group-item">A second item</li>
        <li className="list-group-item">A third item</li>
        <li className="list-group-item">A fourth item</li>
        <li className="list-group-item">And a fifth one</li> */}

        {/*
        This map functionn with arrow function wrapped in curly bracces {expression}
        */}
        {items.map((item) => (
          <li key={item}>{item} is a car</li> // So that react knows which element has which key example key = new york for li new york etc key willact as ID
        ))}
      </ul>
    </Fragment>
  );
}

export default ListGroup;

/*
One way is to use <div> tag 

Like:
<div> 
  <ul className="list-group">
      <li className="list-group-item">An item</li>
      <li className="list-group-item">A second item</li>
      <li className="list-group-item">A third item</li>
      <li className="list-group-item">A fourth item</li>
      <li className="list-group-item">And a fifth one</li>
    </ul>
</div>
*/

/*
One more way to use fragment is dont import fragment 
And do like this 
<>
      <h1>List Group</h1>
      <ul className="list-group">
        <li className="list-group-item">An item</li>
        <li className="list-group-item">A second item</li>
        <li className="list-group-item">A third item</li>
        <li className="list-group-item">A fourth item</li>
        <li className="list-group-item">And a fifth one</li>
      </ul>
</>
*/
