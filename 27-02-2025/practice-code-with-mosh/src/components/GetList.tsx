import { Fragment } from "react/jsx-runtime";
import { MouseEvent } from "react";

function GetList() {
  let items = ["New York", "Chennai", "Mumbai", "Delhi"];
  //   items = [];

  // Using <h1> list doesnt look good always so what we will do is that we do it in following way

  //   if (items.length === 0)
  //     return (
  //       <Fragment>
  //         <h1>List</h1> <p>No items found</p>
  //       </Fragment>
  //     );

  //   return (
  //     <>
  //       <h1>List</h1>
  //       <ul className="list-group">
  //         {items.map((item) => (
  //           <li key={item}>The city is {item}</li>
  //         ))}
  //       </ul>
  //     </>
  //   );

  // If logic gets more big and complex then putting it as => function in jsx mark up
  // Instead we can move that logic outside

  /*
  We did not add those events  in the parameters
  (event) => {
                console.log(event); // SyntheticBaseEvent {_reactName: 'onClick', _targetInst: null, type: 'click', nativeEvent: PointerEvent, target: li.list-group-item, …}

                alert("clicked " + item + " index = " + index);
}*/

  const handleClick = (event: MouseEvent) => {
    console.log(event); // SyntheticBaseEvent {_reactName: 'onClick', _targetInst: null, type: 'click', nativeEvent: PointerEvent, target: li.list-group-item, …}
  };

  return (
    <>
      <h1>List</h1>
      {items.length === 0 ? (
        <p>No elements found</p>
      ) : (
        <ul className="list-group">
          {/*Index of the item can be used using index */}
          {items.map((item, index) => (
            <li className="list-group-item" key={item} onClick={handleClick}>
              {" "}
              {/* class name added to make each item clickable*/}
              The city is {item}
            </li>
          ))}
        </ul>
      )}
    </>
  );
}

export default GetList;
