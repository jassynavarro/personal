
public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        //Item class
        Item axe = new Item();

        axe.price = 15;
        axe.weight = 3.0f;
        axe.quantity = 1;
        axe.description = "deals a damage of 10 hp";
        axe.canbetraded = true;
    

        Item immortality = new Item();

        immortality.price = 50;
        immortality.weight = 4.0f;
        immortality.quantity = 1;
        immortality.description = "immune to damage for a span of 10 seconds";
        immortality.canbetraded = false;
    

        Item boots = new Item();

        boots.price = 75;
        boots.weight = 10.0f;
        boots.quantity = 2;
        boots.description = "speeds up movement speed";
        boots.canbetraded = true;
       

        // Pet class
        Pet dog = new Pet();

        dog.name = "mochi";
        dog.trustlevel = 9;
        dog.petlevel = 10;
        dog.ishappy = true;
       
    }
}
