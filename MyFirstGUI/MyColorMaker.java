package MyFirstGUI;

import java.awt.*;

/**
 * Created by Mårten on 2015-11-10.
 */
public abstract class MyColorMaker {
    public static Color randomColor(){
        return new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
    }
}
