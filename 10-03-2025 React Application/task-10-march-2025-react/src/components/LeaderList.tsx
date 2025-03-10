import React, { useEffect, useState } from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
import LeaderCard from "./LeaderCard";
import AddLeaderForm from "./AddLeaderForm";
import { Leader } from "./types";

const API_URL = "http://localhost:5000/leaders";

const LeaderList: React.FC = () => {
  const [leaders, setLeaders] = useState<Leader[]>([]);

  
  useEffect(() => {
    axios
      .get(API_URL)
      .then((response) => {
        console.log("Fetched Leaders:", response.data);
        setLeaders(response.data);
      })
      .catch((error) => console.error("Error fetching leaders:", error));
  }, []);

 
  const handleAddLeader = (newLeader: Leader) => {
    axios
      .post(API_URL, newLeader)
      .then((response) => {
        console.log("Added Leader:", response.data);
        setLeaders((prevLeaders) => [...prevLeaders, response.data]); 
      })
      .catch((error) => console.error("Error adding leader:", error));
  };

  return (
    <div className="container mt-5">
      <h1 className="text-center mb-4">🌍 World Leaders</h1>

      <div className="row g-4">
        {leaders.map((leader) => (
          <div
            key={leader.id}
            className="col-lg-4 col-md-6 col-sm-12 d-flex justify-content-center"
          >
            <LeaderCard leader={leader} />
          </div>
        ))}
      </div>

      <div className="mt-5">
        <AddLeaderForm onAddLeader={handleAddLeader} />
      </div>
    </div>
  );
};

export default LeaderList;
