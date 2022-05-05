import javafx.scene.image.Image;

class Desert extends Page
{
    Desert(Story story)
    {
        super(story);
        image = new Image("desert.jpg");

    }

    void read()
    {
        System.out.println(
        "The Desert\n\n" +
        "Our hero walks to the desert. The midday sun makes the sand glare with blinding light.\n\n" +
        "\"Coming here was a bad idea. I'm so thirsty.\""
        );
        
        
    }

}
