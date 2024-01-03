package com.diningphhilosophers;

public class ThreadDining implements Runnable{
    Thread t;

    ThreadDining(Philosopher philosopher)
    {
        t = new Thread(philosopher);
        t.start(); // Starting the thread
    }
    ThreadDining(){

    }

    // execution of thread starts from run() method
    public void run()
    {
        while (!Thread.interrupted()) {
            System.out.println("Thread is running");
        }
        System.out.println("Thread has stopped.");
    }
}
