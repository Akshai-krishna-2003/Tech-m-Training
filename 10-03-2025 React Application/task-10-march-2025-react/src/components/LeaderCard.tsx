import React, { useRef } from "react";
import { Leader } from "./types";

const LeaderCard: React.FC<{ leader: Leader }> = ({ leader }) => {
  const role = leader.status === "Alive" ? "Peace Destroyer" : "Rest in Peace";

  // Different songs for alive & deceased
  const aliveSong = "/alive.mp3";
  const deceasedSong = "/deceased.mp3";

  const audioRef = useRef<HTMLAudioElement | null>(null);

  const handleCardClick = () => {
    // Stop previous audio if playing
    if (audioRef.current) {
      audioRef.current.pause();
      audioRef.current.currentTime = 0;
    }

    // Play new audio
    audioRef.current = new Audio(
      leader.status === "Alive" ? aliveSong : deceasedSong
    );
    audioRef.current.play();
  };

  return (
    <div
      className="leader-card"
      style={{
        position: "relative",
        width: "600px",
        height: "400px",
        background: `linear-gradient(180deg, #8B0000, #000)`,
        color: "white",
        textAlign: "left",
        overflow: "hidden",
        borderRadius: "10px",
        boxShadow: "0px 10px 25px rgba(0, 0, 0, 0.8)",
        border: "3px solid #ffcc00",
        padding: "20px",
        display: "flex",
        alignItems: "center",
        cursor: "pointer",
      }}
      onClick={handleCardClick} // Play different song based on status
    >
      <div
        style={{
          position: "absolute",
          top: "5%",
          left: "5%",
          fontSize: "80px",
          fontWeight: "bold",
          textTransform: "uppercase",
          color: "#ffcc00",
          opacity: "0.1",
          zIndex: 1,
          lineHeight: "80px",
          fontFamily: "'Bebas Neue', Impact, sans-serif",
        }}
      >
        Agent {leader.name}
      </div>

      {/* Leader Image */}
      <div
        style={{
          width: "50%",
          height: "90%",
          display: "flex",
          alignItems: "center",
          justifyContent: "center",
          overflow: "hidden",
          borderRadius: "10px",
        }}
      >
        <img
          src={leader.image}
          alt={leader.name}
          style={{
            width: "100%",
            height: "100%",
            objectFit: "contain",
            borderRadius: "10px",
            filter: "contrast(1.2) brightness(1.1)",
            boxShadow: "0px 5px 15px rgba(255, 165, 0, 0.5)",
            zIndex: 2,
          }}
        />
      </div>

      {/* Details Section */}
      <div
        style={{
          flex: 1,
          marginLeft: "20px",
          zIndex: 3,
          display: "flex",
          flexDirection: "column",
          justifyContent: "center",
        }}
      >
        <h3
          style={{
            fontSize: "26px",
            fontWeight: "bold",
            textTransform: "uppercase",
            fontFamily: "'Bebas Neue', Impact, sans-serif",
            color: "#ffcc00",
            marginBottom: "5px",
          }}
        >
          Agent {leader.name}
        </h3>
        <p style={{ fontSize: "14px", color: "#ffcc00" }}>
          <strong>Role:</strong> {role}
        </p>
        <p style={{ fontSize: "14px", fontWeight: "bold" }}>
          <strong>Country:</strong> {leader.country}
        </p>
        <p>
          <strong>Status:</strong> {leader.status}
        </p>
        <p>
          <strong>Years in Power:</strong> {leader.yearsInPower}
        </p>
      </div>

      {/* Achievements */}
      <div
        style={{
          position: "absolute",
          bottom: "10px",
          left: "10px",
          right: "10px",
          backgroundColor: "rgba(255, 255, 255, 0.2)",
          padding: "15px",
          borderRadius: "8px",
          textAlign: "center",
          zIndex: 4,
        }}
      >
        <p
          style={{
            fontSize: "16px",
            color: "#ffffff",
            fontWeight: "bold",
            textShadow: "2px 2px 5px rgba(0, 0, 0, 0.8)",
          }}
        >
          <strong>Achievements:</strong> {leader.notableAchievements}
        </p>
      </div>
    </div>
  );
};

export default LeaderCard;
