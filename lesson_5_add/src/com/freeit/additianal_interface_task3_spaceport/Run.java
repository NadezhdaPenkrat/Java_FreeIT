package com.freeit.additianal_interface_task3_spaceport;

public class Run {
    public static void main(String[] args) {
        SpacePort cosmodrome = new SpacePort();

        IStart shuttlecraft = new InterstellarSpaceshipShuttle();
        IStart challenger = new InterstellarSpaceshipChallenger();
        IStart enterprise = new InterstellarSpaceshipEnterprise();

        System.out.println("Interstellar Spaceship Shuttle launch.");
        cosmodrome.launch(shuttlecraft);
        System.out.println();
        System.out.println("Interstellar Spaceship Challenger launch.");
        cosmodrome.launch(challenger);
        System.out.println();
        System.out.println("Interstellar Spaceship Enterprise launch.");
        cosmodrome.launch(enterprise);
    }
}
