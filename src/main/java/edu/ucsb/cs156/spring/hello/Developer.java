package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // TODO: Change this to your name
        // You may use just the name that is used on <https://bit.ly/cs156-f25-teams>
        // i.e. your first name, or your first and initial of last name

        return "Brian S.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "bsen1";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-05");
        team.addMember("JASMINE");
        team.addMember("KENNEDY");
        team.addMember("BRIAN PATRICK");
        team.addMember("MELVIN ANTHONY");
        team.addMember("HECHENJIN");
        team.addMember("MON RAPHAEL");
        return team;
    }
}
