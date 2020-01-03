import java.util.Scanner;

class Room {
	int roomNumber;
	String roomName;
	String description;
	int numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class TextAdventure {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		// initialize rooms from file
		Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");
		
		showAllRooms(rooms); //for debugging
		
		// play game
		int currentRoom = 0;
		String ans;
		while (currentRoom >= 0){
			Room cur = rooms[currentRoom];
			System.out.print(cur.description);
			System.out.print("> ");
			ans = keyboard.nextLine();
			
			// check typed for exit names
			boolean found = false;
			for (int i=0; i<cur.numExits; i++){
				if (cur.exits[i].equals(ans)){
					// change room
					currentRoom = cur.destinations[i];
					found = true;
				}
			}
			if (! found)
				System.out.println("Sorry, I don't understand.");
		}
	}
	
	public static Room[] loadRoomsFromFile(String filename){
		Scanner file = null;
		try{
			file = new Scanner(new java.io.File(filename));
		}
		catch (java.io.IOException e){
			System.err.println("Can't open '"+filename+"' for reading.");
			System.exit(1);
		}
		
		int numRooms = file.nextInt();
		Room[] rooms = new Room[numRooms];
		
		// initialize rooms from file
		int roomNum = 0;
		while (file.hasNext()){
			Room r = getRoom(file);
			if (r.roomNumber != roomNum){
				System.err.print("Just read room "+r.roomNumber);
				System.err.println(", but "+roomNum+" was expected.");
				System.exit(2);
			}
			rooms[roomNum] = r;
			roomNum++;
		}
		file.close();
		
		return rooms;
	}
	
	public static void showAllRooms(Room[] rooms){
		for (Room r : rooms){
			String exitString = "";
			for (int i=0; i<r.numExits; i++)
				exitString += "\t"+r.exits[i]+" ("+r.destinations[i]+")";
			System.out.println(r.roomNumber+") "+r.roomName);
			System.out.println(exitString);
		}
	}
		
	public static Room getRoom(Scanner f){
		// any rooms left
		if (! f.hasNextInt())
			return null;
		
		Room r = new Room();
		String line;
		
		//read the room #
		r.roomNumber = f.nextInt();
		f.nextLine(); //skip
		
		r.roomName = f.nextLine();
		
		//read description
		r.description = "";
		while(true){
			line = f.nextLine();
			if (line.equals("%%"))
				break;
			r.description += line + "\n";
		}
		
		// read exits
		int i = 0;
		while(true){
			line = f.nextLine();
			if (line.equals("%%"))
				break;
			String[] parts = line.split(":");
			r.exits[i] = parts[0];
			r.destinations[i] = Integer.parseInt(parts[1]);
		}
		r.numExits = i;
		
		// return
		return r;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		