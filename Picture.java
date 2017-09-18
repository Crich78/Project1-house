/**
 * Connor Richardson
 * Lab 1 - Pictures at an Exhibition
 * Due Date 9/18/2017
 * This class represents a picture made using the draw method and objects.
 * It can also change to black and white then back to color!
 * I drew a picture of a house with a nice sky in the background and a green solid ground. There is also a man at the house.
 */
public class Picture
{
    private Square sky;
    private Square window;
    private Square wall;
    private Triangle roof;
    private Circle sun;
    private Circle ground;
    private Person man;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(-350);
        sky.moveVertical(-150);
        sky.changeSize(700);
        sky.makeVisible();
        
        ground = new Circle();
        ground.changeColor("green");
        ground.moveHorizontal(-1000);
        ground.moveVertical(150);
        ground.changeSize(2000);
        ground.makeVisible();
       
        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal (-165);
        wall.moveVertical(20);
        wall.changeSize (175);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-115);
        window.moveVertical(45);
        window.changeSize(60);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-50);
        sun.changeSize(80);
        sun.makeVisible();
        
        man = new Person();
        man.changeColor("black");
        man.moveHorizontal(100);
        man.moveVertical (50);
        
        man.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("white");
            ground.changeColor ("black");
            wall.changeColor ("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            man.changeColor("white");
            
            
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("blue");
            ground.changeColor("green");
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            man.changeColor("black");
            
           
        }
    }
}
