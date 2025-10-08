package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }


    @Test
    public void team_equals_checks() {
        assertTrue(team.equals(team));
        assertFalse(team.equals("Hello"));
        Team team2 = new Team("test-team");
        Team team3 = new Team("test-team");
        team3.addMember("Joe");
        Team team4 = new Team("team4");
        Team team5 = new Team("team5");
        team5.addMember("Bob");
        assertTrue(team.equals(team2));
        assertFalse(team.equals(team3));
        assertFalse(team.equals(team4));
        assertFalse(team.equals(team5));

    }

    @Test
    public void hashCode_checks() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());

        // instantiate t as a Team object
        Team t = new Team("hashCode Mutation Checker");
        int result = t.hashCode();
        int expectedResult = 1020497571;
        assertEquals(expectedResult, result);
    }

}
