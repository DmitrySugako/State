package com.tc.state.main;

import com.tc.state.bean.City;
import com.tc.state.bean.District;
import com.tc.state.bean.Region;
import com.tc.state.bean.State;
import com.tc.state.logic.StateLogic;
import com.tc.state.view.StateView;

public class Main {
	public static void main(String[] args) {
		City m1 = new City("Minsk");
		City m2 = new City("Zaslavl");
		City m3 = new City("Machulishchi");
		City m4 = new City("Kolodishchi");
		City m5 = new City("Priluki");
		City m6 = new City("Semkovo");
		City m7 = new City("Gatovo");
		City g1 = new City("Grodno");
		City g2 = new City("Indura");
		City g3 = new City("Koptevka");
		City g4 = new City("Obukhovo");
		City b1 = new City("Borisov");
		City b2 = new City("Berezovka");
		City b3 = new City("Borki");
		City v1 = new City("Volkovysk");
		City v2 = new City("Korelichi");
		City v3 = new City("Zelva");
		City other = new City("Other cities");

		District minskDstr = new District("Minsk districk", 1943);
		minskDstr.add(m1);
		minskDstr.add(m2);
		minskDstr.add(m3);
		minskDstr.add(m4);
		minskDstr.add(m5);
		minskDstr.add(m6);
		minskDstr.add(m7);

		District borisovDstr = new District("Borisov district", 2987);
		borisovDstr.add(b1);
		borisovDstr.add(b2);
		borisovDstr.add(b3);

		District grodnoDstr = new District("Grodno district", 2594);
		grodnoDstr.add(g1);
		grodnoDstr.add(g2);
		grodnoDstr.add(g3);
		grodnoDstr.add(g4);

		District volkovyskDstr = new District("Volkovysk district", 1192);
		volkovyskDstr.add(v1);
		volkovyskDstr.add(v2);
		volkovyskDstr.add(v3);

		District otherDstr = new District("Other distrits", 198884);
		otherDstr.add(other);

		Region minskReg = new Region("Minsk region");
		minskReg.add(minskDstr);
		minskReg.add(borisovDstr);
		minskReg.setRegionalСenter(m1);

		Region grodnoReg = new Region("Grodno region");
		grodnoReg.add(grodnoDstr);
		grodnoReg.add(volkovyskDstr);
		grodnoReg.setRegionalСenter(g1);

		Region otherReg = new Region("Other regions");
		otherReg.add(otherDstr);

		State belarus = new State("Republic of Belarus");
		belarus.add(minskReg);
		belarus.add(grodnoReg);
		belarus.add(otherReg);
		belarus.setCapital(m1);

		StateView view = new StateView();
		view.printState(belarus);
		view.printSqare(belarus);
		view.printNumberOfRegions(belarus);

		StateLogic logic = new StateLogic();
		logic.findRegionalCenters(belarus);
		view.printCapital(logic.findCapital(belarus));
		

	}
}