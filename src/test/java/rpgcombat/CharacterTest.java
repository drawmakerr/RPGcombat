package rpgcombat;


import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    int health = 1000;
    int level = 1;

    boolean alive = true;
    int damage = 200;
Character character = new Character(health, level, alive, damage);

    @Test
    public void health_should_start_with_1000() {

        assertTrue(character.health >= 1000);
    }

    @Test
    public void level_should_start_at_1() {
        assertTrue(character.level == 1);
    }

    @Test
    public void Character_should_be_alive() {
        assertTrue(character.alive);
    }

    @Test
    public void character_should_have_damage() {
        assertNotNull(character.damage);
    }

    @Test
    public void damage_should_substract_from_health() {
        assertTrue(character.attack() == 200);
    }

    @Test
    public void substract_damage_from_health() {
        assertEquals(800, character.receiveDamage(200));
    }
}