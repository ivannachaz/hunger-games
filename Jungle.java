import javafx.scene.image.Image;

class Jungle extends Page
{
    boolean hasSpoon;
    boolean hasRevealedDesert;

    Jungle(Story story)
    {
        super(story);
        image = new Image("jungle.jpg");

    }

    void read()
    {
        System.out.println(
        "The Jungle\n\n" +
        " The Tributes have been dropped in an uncharted jungle./n" +
        " Alex Russo, Shrek, Mrs.Incredible, Edward Cullen,Penelope Garcia, McLovin', Bill Ray Cyrus anxiously wait as the timer ticks down" 
        
        );
    }

}