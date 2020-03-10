package ie.cct.objectorientedconstructs.s2018447s2018245;

import java.util.Arrays;
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
		Arrays.fill(availability.get("January"), true);
		
		availability.put("February", new boolean[28]);
		Arrays.fill(availability.get("February"), true);
		
		availability.put("March", new boolean[31]);
		Arrays.fill(availability.get("March"), true);
		
		availability.put("April", new boolean[30]);
		Arrays.fill(availability.get("April"), true);
		
		availability.put("May", new boolean[31]);
		Arrays.fill(availability.get("May"), true);
		
		availability.put("June", new boolean[30]);
		Arrays.fill(availability.get("June"), true);
		
		availability.put("July", new boolean[31]);
		Arrays.fill(availability.get("July"), true);
		
		availability.put("August", new boolean[31]);
		Arrays.fill(availability.get("August"), true);
		
		availability.put("September", new boolean[30]);
		Arrays.fill(availability.get("September"), true);
		
		availability.put("October", new boolean[31]);
		Arrays.fill(availability.get("October"), true);
		
		availability.put("November", new boolean[30]);
		Arrays.fill(availability.get("November"), true);
		
		availability.put("December", new boolean[31]);
		Arrays.fill(availability.get("December"), true);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;
		
	}

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return this.rate;
	}

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub
		this.rate = rate;
	}

	@Override
	public Map<String, boolean[]> getAvailability() {
		// TODO Auto-generated method stub
		return this.availability;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub
		this.availability = availability;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean isAvailable(String month, int day) {
		// TODO Auto-generated method stub
		
		
		return availability.get(month)[day-1];
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		
		if(isAvailable(month,day)) {
			this.availability.get(month)[day-1] = false;
			return true;
		}
		return false;
	}

}
