package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
	private String name;
	private City regionalСenter;
	private List<District> districts = new ArrayList<District>();
	private int square = 0;

	public Region() {
	}

	public Region(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void add(District district) {
		districts.add(district);
		square = square + district.getSquare();

	}

	public void setName(String name) {
		this.name = name;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public City getRegionalСenter() {
		return regionalСenter;
	}

	public void setRegionalСenter(City regionalСenter) {
		this.regionalСenter = regionalСenter;

	}

	@Override
	public int hashCode() {
		return Objects.hash(districts, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(districts, other.districts) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "\n" + name;
	}

}