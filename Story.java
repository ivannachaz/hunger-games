import java.util.ArrayList;

class Story
{
    //Pages
    Jungle jungle; 
    Desert desert;

    int currentPageNumber;

    //Characters
    

    // Containers for pages and characters
    ArrayList<Page> book = new ArrayList<Page>();
    ArrayList<Character> characters = new ArrayList<Character>();

    Story()
    {
        // Set up pages and give each page a reference to this story
        jungle = new Jungle(this);
        desert = new Desert(this);

        book.add(jungle);
        book.add(desert);

        // Set up characters and give each character a reference to this story
        

        currentPageNumber = 0;
    }

    Page getCurrentPage()
    {
        if (currentPageNumber >= 0 && currentPageNumber < book.size())
        {
            return book.get(currentPageNumber);
        }
        else
        {
            return null;
        }
    }

    void readCurrentPage()
    {
        Page p = getCurrentPage();
        if (p != null)
        {
            p.read();
        }
    }

    void turnPage()
    {
        // Change the page number. Prevent turning past the end of the book!
    }

    void turnBackPage()
    {
        // Change the page number. Prevent turning past the beginning of the book!
    }
}