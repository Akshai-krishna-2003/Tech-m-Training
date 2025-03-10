import React, { useState } from "react";
import { Leader } from "./types";

interface AddLeaderFormProps {
  onAddLeader: (leader: Leader) => void;
}

const AddLeaderForm: React.FC<AddLeaderFormProps> = ({ onAddLeader }) => {
  const [name, setName] = useState("");
  const [country, setCountry] = useState("");
  const [flag, setFlag] = useState("");
  const [image, setImage] = useState("");
  const [status, setStatus] = useState<"Alive" | "Deceased">("Alive");
  const [yearsInPower, setYearsInPower] = useState("");
  const [notableAchievements, setNotableAchievements] = useState("");

  const handleSubmit = (event: React.FormEvent) => {
    event.preventDefault();
    
    if (!name || !country || !yearsInPower || !notableAchievements) {
      alert("Please fill in all required fields!");
      return;
    }

    const newLeader: Leader = {
      id: Date.now(), // A good idea to generate an unique id from my side
      name,
      country,
      flag: flag , 
      image: image , 
      status,
      yearsInPower,
      notableAchievements,
    };

    console.log("Adding Leader:", newLeader);

    onAddLeader(newLeader); 

    
    setName("");
    setCountry("");
    setFlag("");
    setImage("");
    setStatus("Alive");
    setYearsInPower("");
    setNotableAchievements("");
  };

  return (
    <div className="card p-3 mt-4">
      <h3>Add a New Leader</h3>
      <form onSubmit={handleSubmit}>
        <input className="form-control mb-2" placeholder="Name" value={name} onChange={(e) => setName(e.target.value)} />
        <input className="form-control mb-2" placeholder="Country" value={country} onChange={(e) => setCountry(e.target.value)} />
        <input className="form-control mb-2" placeholder="Flag URL" value={flag} onChange={(e) => setFlag(e.target.value)} />
        <input className="form-control mb-2" placeholder="Image URL" value={image} onChange={(e) => setImage(e.target.value)} />
        <select className="form-control mb-2" value={status} onChange={(e) => setStatus(e.target.value as "Alive" | "Deceased")}>
          <option value="Alive">Alive</option>
          <option value="Deceased">Deceased</option>
        </select>
        <input className="form-control mb-2" placeholder="Years in Power" value={yearsInPower} onChange={(e) => setYearsInPower(e.target.value)} />
        <textarea className="form-control mb-2" placeholder="Notable Achievements" value={notableAchievements} onChange={(e) => setNotableAchievements(e.target.value)} />
        
        <button className="btn btn-primary" type="submit">Add Leader</button>
      </form>
    </div>
  );
};

export default AddLeaderForm;
