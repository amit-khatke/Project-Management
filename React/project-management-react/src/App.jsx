import { Route, Routes } from "react-router-dom";
import "./App.css";
import Home from "./pages/Home/Home.jsx";
import Navbar from "./pages/Navbar/Navbar";
import ProjectDetails from "./pages/ProjectDetails/ProjectDetails";
import IssueDetails from "./pages/IssueDetails/IssueDetails";
import Subscription from "./pages/Subcription/Subscription";
import Auth from "./pages/Auth/Auth";

function App() {
  return (
    <>
    {
      true?<div>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/project/:id" element={<ProjectDetails />} />
        <Route path="/project/:projectId/issue/:issueId" element={<IssueDetails />} />
        <Route path="/upgrade_plan" element={<Subscription />} />
      </Routes>

    </div>:<Auth/>
    }
      
    </>
  );
}

export default App;
