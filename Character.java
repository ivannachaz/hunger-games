abstract class Character
{
    String name;
    boolean isAlive;
    boolean hasOnion;
    Story story;
    
    Character(Story story)
    {
        this.name = "";
        this.isAlive = true;
        this.story = story;
    }
}