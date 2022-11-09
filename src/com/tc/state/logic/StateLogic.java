package com.tc.state.logic;

import com.tc.state.bean.District;
import com.tc.state.bean.Region;
import com.tc.state.bean.State;
import com.tc.state.bean.City;

public class StateLogic {

	public City findCapital(State state) {
		for (Region reg : state.getRegions()) {
			for (District dst : reg.getDistricts()) {
				for (City cit : dst.getCities()) {
					if (cit.equals(state.getCapital())) {
						return cit;
					}
				}
			}
		}
		return null;
	}

	public void findRegionalCenters(State state) { // Тут логика + вывод, пытаюсь их разделить(
		System.out.println("Regional centers of the " + state + "- the cities of:");
		for (Region reg : state.getRegions()) {
			for (District dst : reg.getDistricts()) {
				for (City cit : dst.getCities()) {
					if (cit.equals(reg.getRegionalСenter())) {

						System.out.println(cit);
					}
				}
			}
		}
	}
}
