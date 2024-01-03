package com.diningphhilosophers;

import java.util.ArrayList;

public class DiningApp {
	private DiningTable diningTable;
	private ArrayList<Fork> forkList;
	private ArrayList<Philosopher> philosophers;
	
//	public static void main(String[] args) {
//		new DiningApp().start();
//	}
	Thread diner1,diner2,diner3,diner4,diner5,diner6;
	public void start() {
		diningTable = new DiningTable();
		forkList = diningTable.getForks();
		philosophers = diningTable.getDiners();
		addForks();
		System.out.println(forkList);
		addDiners();
		System.out.println(philosophers);
		startDining();
	}
	public void reset(){
//		diningTable = new DiningTable();
//		forkList = diningTable.getForks();
//		philosophers = diningTable.getDiners();
//		addForks();
//		System.out.println(forkList);
//		addDiners();
//		System.out.println(philosophers);
		diner1.interrupt();
		diner2.interrupt();
		diner3.interrupt();
		diner4.interrupt();
		diner5.interrupt();
		diner6.interrupt();
//		diner1 = new Thread(philosophers.get(0));
//		diner2 = new Thread(philosophers.get(1));
//		diner3 = new Thread(philosophers.get(2));
//		diner4 = new Thread(philosophers.get(3));
//		diner5 = new Thread(philosophers.get(4));
//		diner6 = new Thread(philosophers.get(5));
	}

	private void startDining() {

		diner1 = new Thread(philosophers.get(0));
		diner2 = new Thread(philosophers.get(1));
		diner3 = new Thread(philosophers.get(2));
		diner4 = new Thread(philosophers.get(3));
		diner5 = new Thread(philosophers.get(4));
		diner6 = new Thread(philosophers.get(5));
		diner1.start();
		diner2.start();
		diner3.start();
		diner4.start();
		diner5.start();
		diner6.start();
	}

	private void addDiners() {
		int rightFork = 5;
		for(int i = 0; i < 6; ++i){
			if(i == 1){
				rightFork = 0;
			}else if (i == 2) {
				rightFork = 1;
			}else if (i == 3) {
				rightFork = 2;
			}else if (i == 4) {
				rightFork = 3;
			}else if (i == 5) {
				rightFork = 4;
			}
			philosophers.add(new Philosopher(i + 1, forkList.get(i), forkList.get(rightFork)));
		}
	}

	private void addForks() {
		for(int i = 0; i < 6; ++i){
			forkList.add(new Fork(i + 1));
		}
	}

	public ArrayList<Philosopher> getPhilosophers() {
		return philosophers;
	}

	public void setPhilosophers(ArrayList<Philosopher> philosophers) {
		this.philosophers = philosophers;
	}

	public ArrayList<Fork> getForkList() {
		return forkList;
	}

	public void setForkList(ArrayList<Fork> forkList) {
		this.forkList = forkList;
	}
	
	
}
