abstract class Character
{
    String name;
    boolean isAlive;
    Story story;
    
    Character(Story story)
    {
        this.name = "";
        this.isAlive = true;
        this.story = story;
    }
}