package ie.cct.objectorientedconstructs.s2018447s2018245;

import java.util.List;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Hotel implements HotelInterface {

	@Override
	public List<RoomInterface> getRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRooms(List<RoomInterface> rooms) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkAvailability(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRoomAvailable(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfRooms() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean bookRoom(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		return false;
	}

}
