package com.wipro.thread;

class RaceThread extends Thread {

    private boolean isHare;
    private static boolean raceOver = false;

    public RaceThread(String name, boolean isHare) {
        super(name);
        this.isHare = isHare;
    }

    public void run() {

        for (int i = 1; i <= 100 && !raceOver; i++) {

            System.out.println(getName() + " : " + i + " meters");

            try {

                if (isHare) {

                    Thread.sleep(20);

                    if (i == 60) {
                        System.out.println(getName() + " is sleeping...");
                        Thread.sleep(1000);
                    }

                } else {
                    Thread.sleep(40);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (!raceOver) {
            raceOver = true;
            System.out.println("\n" + getName() + " wins the race!");
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare", true);
        RaceThread tortoise = new RaceThread("Tortoise", false);

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}