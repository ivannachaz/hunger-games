import javafx.scene.image.Image;

class Page1 extends Page
{
    Page1(Story story)
    {
        super(story);
        image = new Image("shrekprof.jpg");

    }

    void read()
    {
        System.out.println(
        
        "Everyone skatters into different directions.\n\n" +
        "Shrek, from District DreamWorks, runs as fast as his legs could take him. He only thinks of his family. The midday sun makes the sand glare with blinding light.\n\n" +
        "Coming here was a bad idea. I miss me swamp. Rawrrrr. (READ IN SCOTTISH ACCENT) \n\n" + "Shrek, feeling hungry for some yummy waffles, made by his best friend Donkey, is already tired of being in the humid jungle. Running and killing are not his favorite, especially since it is so much work, for a poor green ogre like himself."
         
        
        );
         
        
        
    }

}
