import { Fragment } from "react";

function StudList() {
  const students = [
    { name: "Akshai", department: "CSE" },
    { name: "Madhan", department: "IT" },
    { name: "Jashwanth", department: "ECE" },
    { name: "Naveen", department: "EEE" },
    { name: "Karthick", department: "MECH" },
  ];

  return (
    <Fragment>
      <h2>Student List</h2>
      <ol>
        {students.map((student) => (
          <li key={student.name}>
            {student.name} belongs to {student.department} department.
          </li>
        ))}
      </ol>
    </Fragment>
  );
}

export default StudList;
