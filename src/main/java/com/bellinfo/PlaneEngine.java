package com.bellinfo;

public class PlaneEngine {
	
	private String engineType;
	private int cost;
	
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "PlaneEngine [engineType=" + engineType + ", cost=" + cost + "]";
	}
	
	
	

}
