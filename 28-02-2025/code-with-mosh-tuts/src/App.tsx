import GetList from "./components/GetListPropsFns";

export default function App() {
  let items = ["New York", "Chennai", "Mumbai", "Delhi"];
  let heading = "Cities";

  const handleSelectItem = (item: string) => {
    console.log(item);
  };

  return (
    <>
      <GetList
        items={items}
        heading={heading}
        onSelectedItem={handleSelectItem} // Here make the function work
      />
    </>
  );
}
