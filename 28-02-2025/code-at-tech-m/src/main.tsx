import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import "bootstrap/dist/css/bootstrap.css";
import ErrorBoundary from "./components/ErrorBoundary";
import ABComponentForError from "./components/ABComponentForError";

ReactDOM.createRoot(document.getElementById("root") as HTMLElement).render(
  <React.StrictMode>
    <h2>Hi!!!</h2>
    <ErrorBoundary>
      <ABComponentForError />
    </ErrorBoundary>
  </React.StrictMode>
);
