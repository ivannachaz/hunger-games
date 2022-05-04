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
        " The Tributes have been dropped in an uncharted jungle." +
        "The Alex Russo, Shrek, Mrs.Incredible, Edward Cullen,Penelope Garcia, McLovin', Bill Ray Cyrus.Anxiously wait as the timer ticks down\n\n" +
        "\"Under the circumstances, not too bad of a landing...\", she thinks as she limps to her feet.\n\n" +
        "The humid air and the smoke from the wreckage make it hard to breathe. She feels the jungle watching her " +
        "as she looks around the dense foliage. \"Yup, time for a change of scenery,\" she says to herself."
        );
    }

}