import javafx.scene.image.Image;

class Page2 extends Page
{
    
    Page2(Story story)
    {
        super(story);
        image = new Image("billys hrse.jpg");

    }
    
    void read()
    {
        System.out.println("A horse is found by THE Billy Ray.");
    } 
    
}