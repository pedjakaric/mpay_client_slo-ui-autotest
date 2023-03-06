package stepDefinitions.base;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.charset.Charset;
import java.util.Random;

public class Base {

    public static String getRandomCode() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);

        return new String(array, Charset.forName("UTF-8"));
    }


}
