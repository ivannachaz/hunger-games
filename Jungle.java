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
        " The Tributes have been dropped in an uncharted jungle.\n\n" +
        " Alex Russo, Shrek, Mrs.Incredible, Edward Cullen,Penelope Garcia, McLovin', Bill Ray Cyrus anxiously wait as the timer ticks down. \n\n" +
        " The jungle is so quiet. Everyone can hear each others heartbeat. \n\n" +
        "5 \n\n" + "4 \n\n" + "3 \n\n" + "2 \n\n" + "1..." 
        
        );
    }

}