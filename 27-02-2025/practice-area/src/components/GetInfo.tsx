import React from "react";

interface User {
  hasAadhaar: boolean;
  hasPAN: boolean;
}

interface GetInfoProps {
  user: User;
}

const GetInfo: React.FC<GetInfoProps> = ({ user }) => {
  if (!user) {
    return <p>No user data available.</p>;
  }

  const { hasAadhaar, hasPAN } = user;

  return (
    <div>
      <h2>User Card Availability</h2>
      {hasAadhaar || hasPAN ? (
        <ul>
          {hasAadhaar && <li>Aadhaar Card Available</li>}
          {hasPAN && <li>PAN Card Available</li>}
        </ul>
      ) : (
        <p>No Aadhaar or PAN Card available.</p>
      )}
    </div>
  );
};

export default GetInfo;
