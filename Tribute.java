class Tribute extends Character
{
    boolean hasCompass;
    boolean isThirsty;
    boolean isStarving;
    
    Tribute(Story story)
    {
        super(story);
        hasCompass = false;
        isStarving = false;
        isThirsty = false;
    }
}