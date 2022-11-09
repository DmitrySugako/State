package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {
	private String name;
	private City capital;
	private int square = 0;
	private int numberOfRegions = 0;
	private List<Region> regions = new ArrayList<Region>();

	public State() {
	}

	public State(String name) {
		this.name = name;
	}

	public void add(Region region) {
		regions.add(region);
		square = square + region.getSquare();
		numberOfRegions++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public int getNumberOfRegions() {
		return numberOfRegions;
	}

	public void setNumberOfRegions(int numberOfRegions) {
		this.numberOfRegions = numberOfRegions;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, regions, square);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(name, other.name) && Objects.equals(regions, other.regions) && square == other.square;
	}

	@Override
	public String toString() {
		return  name;
	}
	

}
