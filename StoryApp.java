import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.PrintStream;
import java.io.IOException;
import java.io.OutputStream;
import javafx.scene.layout.HBox;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.control.SplitPane;

public class StoryApp extends Application
{
    ImageView view;
    TextArea text;

    Story story;

    public void start(Stage stage)
    {
        //Set up the game data
        story = new Story();

        //Set up an image container
        view = new ImageView();
        view.setFitHeight(300);
        view.setPreserveRatio(true);

        refreshImage();
        
        //Set up a text display window
        text = new TextArea();
        text.setWrapText(true);
        text.setEditable(false);

        //Redirect "System.out.println()" to print to the text display window
        Console console = new Console(text);
        PrintStream ps = new PrintStream(console, true);
        System.setOut(ps);
        System.setErr(ps);
        System.out.println("Press SPACE to turn the page. Press B to go back.\n");

        // Create a new window manager and put all components inside
        SplitPane storySpread = new SplitPane(view, text);

        Scene scene = new Scene(storySpread, 900,400);
        stage.setTitle("Story Time");
        stage.setScene(scene);

        // Tell the app to listen for keypresses
        text.setOnKeyPressed(this::handleKey);
        
        // Show the Stage (window)
        stage.show();
        
        story.readCurrentPage();
    }

    void refreshImage()
    {
        view.setImage(story.getCurrentPage().image);
    }
    
    void handleKey(KeyEvent k)
    {
        KeyCode key = k.getCode();
        
        if (key == KeyCode.SPACE)
        {
            text.clear();
            story.turnPage();
            refreshImage();
            story.readCurrentPage();
        }
        else if (key == KeyCode.B)
        {
            text.clear();
            story.turnBackPage();
            refreshImage();
            story.readCurrentPage();
        }
    }
}

class Console extends OutputStream
{
    TextArea output;

    public Console(TextArea ta)
    {
        this.output = ta;
    }

    @Override
    public void write(int i) throws IOException
    {
        output.appendText(String.valueOf((char) i));
    }

}
