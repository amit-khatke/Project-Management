import { Button } from "@/components/ui/button";
import {
  Dialog,
  DialogContent,
  DialogHeader,
  DialogTrigger,
} from "@/components/ui/dialog";
import CreateProjectForm from "../Project/CreateProjectForm";
import React from "react";
import {
  DropdownMenu,
  DropdownMenuContent,
  DropdownMenuItem,
  DropdownMenuTrigger,
} from "@/components/ui/dropdown-menu";
import { PersonIcon } from "@radix-ui/react-icons";
import { useNavigate } from "react-router-dom";

const Navbar = () => {
  const navigate = useNavigate();
  return (
    <div className="border-b py-4 px-5 flex items-center justify-between">
      <div className="flex items-center gap-3">
        <p onClick={() => navigate("/")} className="cursor-pointer">
          Project Management
        </p>
        <Dialog>
          <DialogTrigger>
            <Button varient="ghost">New Project</Button>
          </DialogTrigger>

          <DialogContent>
            <DialogHeader>Create New Project</DialogHeader>
            <CreateProjectForm />
          </DialogContent>
        </Dialog>
        <Button onClick={()=>navigate("/upgrade_plan")} varient="ghost">Upgrade</Button>
      </div>
      <div className="flex gap-3 items-center ">
        <DropdownMenu>
          <DropdownMenuTrigger>
            <Button
              varient="outline"
              size="icon"
              className="rounded-full border-2 border-gray-500"
            >
              <PersonIcon />
            </Button>
          </DropdownMenuTrigger>
          <DropdownMenuContent>
            <DropdownMenuItem>Logout</DropdownMenuItem>
          </DropdownMenuContent>
        </DropdownMenu>
        <p>Code with Amit</p>
      </div>
    </div>
  );
};

export default Navbar;
