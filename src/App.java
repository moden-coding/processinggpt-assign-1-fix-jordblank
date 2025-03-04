import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings(){
        size(400, 400);
        }
    
    public void setup(){
        background (145, 143, 255);
    }
    public void draw (){
        stroke (13, 11, 125);
        strokeWeight(5);
        rect(50,50,200,150);
        fill(116, 114, 196);
        stroke (42, 31, 100);
        strokeWeight(3);
        ellipse(300, 300, 100, 100);
        fill(93, 91, 186);
        line(250, 200, 250, 290);
    }

}
