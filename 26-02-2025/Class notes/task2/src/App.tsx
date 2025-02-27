import React from "react";
import GetInfo from "./components/GetInfo";

function App() {
  const user = {
    hasAadhaar: true,
    hasPAN: true,
  };

  return (
    <>
      <GetInfo user={user} />
    </>
  );
}

export default App;
