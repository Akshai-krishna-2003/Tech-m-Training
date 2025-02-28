import DivBy16 from "./components/DivBy16";
import GetInfo from "./components/GetInfo";
import StudList from "./components/StudList";
import ChildComponent4 from "./components/ChildComponent4";
import ChildComponent5 from "./components/ChildComponent5";

function App() {
  const user = {
    hasAadhaar: true,
    hasPAN: true,
  };
  return (
    <>
      <h1> Task 1 </h1>
      <DivBy16></DivBy16>
      <br />
      <br />
      <h1> Task 2 </h1>
      <GetInfo user={user} />
      <br />
      <br />
      <h1> Task 3 </h1>
      <StudList />

      <br />
      <br />
      <h1>New task A</h1>

      <ChildComponent4 />

      <ChildComponent5 />
    </>
  );
}

export default App;
