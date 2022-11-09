package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
	private String name;
	private int square;
	private List<City> cities = new ArrayList<City>();

	public District(String name, int square) {
		this.name = name;
		this.square = square;

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

	public District() {
	}

	public void add(City city) {
		cities.add(city);
	}

	public List<City> getCities() {
		return cities;
	}

	public void setDistrict(List<City> district) {
		this.cities = district;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cities);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(cities, other.cities);
	}

	@Override
	public String toString() {
		return  name ;
	}

}