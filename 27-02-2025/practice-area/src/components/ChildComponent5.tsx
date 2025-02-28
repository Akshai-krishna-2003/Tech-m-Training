const ChildComponent5 = () => {
  return (
    <div
      className="p-4 bg-red shadow-md rounded-md"
      onClick={() => {
        console.log("Last component may be who knows");
      }}
    >
      Child Component 5
    </div>
  );
};

export default ChildComponent5;
