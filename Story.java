import java.util.ArrayList;

class Story
{
    //Pages
    Jungle jungle; 
    Page1 page1;
    Page2 page2;

    int currentPageNumber;

    //Characters

    // Containers for pages and characters
    ArrayList<Page> book = new ArrayList<Page>();
    ArrayList<Character> characters = new ArrayList<Character>();

    Story()
    {
        // Set up pages and give each page a reference to this story
        jungle = new Jungle(this);
        page1= new Page1(this);
        page2 = new Page2(this);

        book.add(jungle);
        book.add(page1);
        book.add(page2);
        

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
        if (currentPageNumber < book.size())

        {
            currentPageNumber++;
        }
    }

    void turnBackPage()
    {
        // Change the page number. Prevent turning past the beginning of the book!
        if (currentPageNumber > 0)

        {
            currentPageNumber--;
        }
    }
}