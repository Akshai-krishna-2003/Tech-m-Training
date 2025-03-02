export default function ABComponentForError() {
    try {
        const undefinedVariable = undefined;
        console.log(undefinedVariable.abc()); // This will throw an error
    } catch (error) {
        console.error("Caught error in ABComponentForError:", error);
    }
  
    return (
      <h3>ABComponentForError</h3>
    );
}
