package com.diningphhilosophers;

import com.diningphhilosophers.Deadlock.PhilosopherDeadlock;

import java.util.ArrayList;

public class DiningTable {
	private ArrayList<Philosopher> diners = new ArrayList<>();
	private ArrayList<PhilosopherDeadlock> dinersDeadlock = new ArrayList<>();
	private ArrayList<Fork> forks = new ArrayList<>();
	
	public ArrayList<Philosopher> getDiners() {
		return diners;
	}
	public ArrayList<PhilosopherDeadlock> getDinersDeadlock() {
		return dinersDeadlock;
	}
	public void setDiners(ArrayList<Philosopher> diners) {
		this.diners = diners;
	}
	public ArrayList<Fork> getForks() {
		return forks;
	}
	public void setForks(ArrayList<Fork> forks) {
		this.forks = forks;
	}
	
	
}
