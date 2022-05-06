import javafx.scene.image.Image;

class Desert extends Page
{
    Desert(Story story)
    {
        super(story);
        image = new Image("Shrek Profile.jpg");

    }

    void read()
    {
        System.out.println(
        "The Desert\n\n" +
        "Our first tribute  walks to the desert. The midday sun makes the sand glare with blinding light.\n\n" +
        "\"Coming here was a bad idea. I miss me swamp. Rawrrrr. READ IN SCOTTISH ACCENT\""
        );
        
        
    }

}
