package com.tc.state.view;

import com.tc.state.bean.State;
import com.tc.state.bean.District;
import com.tc.state.bean.Region;
import com.tc.state.bean.City;

public class StateView {

	public StateView() {
	}

	public void printState(State state) {
		System.out.println(state.getName());
		System.out.println("-------------------");
		for (Region reg : state.getRegions()) {
			System.out.println(reg);
			System.out.println(" includes districts:");
			System.out.println("");
			for (District dst : reg.getDistricts()) {
				System.out.println("-------------------");
				System.out.println(dst);
				System.out.println(" includes cities:");
				System.out.println("-------------------");
				for (City cit : dst.getCities()) {
					System.out.println(cit);
				}
			}
		}
	}

	public void printSqare(State state) {
		System.out.println();
		System.out.println(state.getName() + " square= " + state.getSquare() + " km2");
	}

	public void printNumberOfRegions(State state) {
		System.out.println();
		System.out.println("There are " + state.getNumberOfRegions() + " regions in the " + state.getName());

	}

	public void printRegionCenters(State state) {
		System.out.println("Regional centers of the:");

	}

	public void printCapital(City cit) {
		System.out.println();
		System.out.println("the capital is the city of " + cit);
	}

}