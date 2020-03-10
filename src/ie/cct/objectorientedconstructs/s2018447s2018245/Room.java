package ie.cct.objectorientedconstructs.s2018447s2018245;

import java.util.HashMap;
import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {
	
	private String type;
	private double rate;
	private Map<String, boolean[]>availability;
	private int id;
	
	public Room(String type, double rate, int id) {
		this.type = type;
		this.rate = rate;
		this.id = id;
		this.availability = new HashMap<String, boolean[]>();
		createAvailability();
	}
	
	private void createAvailability() {
		
		availability.put("January", new boolean[31]);
		availability.put("February", new boolean[28]);
		availability.put("March", new boolean[31]);
		availability.put("April", new boolean[30]);
		availability.put("May", new boolean[31]);
		availability.put("June", new boolean[30]);
		availability.put("July", new boolean[31]);
		availability.put("August", new boolean[31]);
		availability.put("September", new boolean[30]);
		availability.put("October", new boolean[31]);
		availability.put("November", new boolean[30]);
		availability.put("December", new boolean[31]);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, boolean[]> getAvailability() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAvailable(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

}
