import javafx.scene.image.Image;

class Page1 extends Page
{
    Page1(Story story)
    {
        super(story);
        image = new Image("Shrek Profile.jpg");

    }

    void read()
    {
        System.out.println(
        
        "Everyone skatters into different directions. No one even dares to touch the supplies in the middle.\n\n" +
        "Shrek, from District DreamWorks, runs as fast as his legs could take him. He only thinks of his family. The midday sun makes the sand glare with blinding light.\n\n" +
        "\"Coming here was a bad idea. I miss me swamp. Rawrrrr. READ IN SCOTTISH ACCENT\""
        );
        
        
    }

}