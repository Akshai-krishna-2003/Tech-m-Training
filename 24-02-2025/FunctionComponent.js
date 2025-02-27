import React from "react";
import ReactDOM from "react-dom/client";

function Mobile() {
  return <h2>Mobile Component!</h2>;
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Mobile />);
