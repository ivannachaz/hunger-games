import javafx.scene.image.Image;

class Page2 extends Page
{
    
    Page2(Story story)
    {
        super(story);
        image = new Image("billyprof.jpg");

    }
    
    void read()
    {

        System.out.println("A horse is found by THE Billy Ray.");
        

        System.out.println("Dang Flabbit !! Why in tarnation am I stuck in the middle of this Jungle? Even the swamps of Kentucky aint as humid as this. (Feels his hair become damp with the moisture of the jungle.) \n\n" + "This darn tootin weather is messing up my mullet. Wheres my horse? \n\n" + "( Billy begins to walk in a cowboyish manner to find his horse)."
         );

    } 
    
}