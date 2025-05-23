import { useState } from "react";

// First lets decide the shape of this property
// {items: [], heading: String}
// Do do this we are going to use a typescript ptoperty called interface
// Using interface we can deccide the shape or interface of the object

interface Props {
  items: string[];
  heading: string;
}

// We can do props: Props too but better to use {destructure}: Props
function GetList({ items, heading }: Props) {
  const [selectedIndex, setSelectedIndex] = useState(-1);

  return (
    <>
      <h1>{heading}</h1>

      <ul className="list-group">
        {/*Index of the item can be used using index */}
        {items.map((item, index) => (
          <li
            className={
              selectedIndex === index
                ? "list-group-item active"
                : "list-group-item"
            }
            key={item}
            onClick={() => {
              setSelectedIndex(index);
              // alert(item + " is selected");
            }}
          >
            {" "}
            {/* class name added to make each item clickable*/}
            The city is {item}
          </li>
        ))}
      </ul>
    </>
  );
}

export default GetList;
