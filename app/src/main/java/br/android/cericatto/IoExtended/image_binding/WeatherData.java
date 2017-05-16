package br.android.cericatto.IoExtended.image_binding;

import android.support.v7.app.AppCompatActivity;

/**
 * WeatherData.java.
 *
 * @author Rodrigo Cericatto
 * @since May 14, 2016
 */
public class WeatherData extends AppCompatActivity {

    public static final String[] CITY_NAME = new String[] {
        "New York", "Amsterdam", "Barcelona", "Berlin",
        "Tokyo", "Rio de Janeiro", "London", "Paris",
        "Vienna", "Rome", "Auckland", "Sydney"
    };

    public static final String[] URL = new String[] {
        "http://www.nationalgeographic.com/new-york-city-skyline-tallest-midtown-manhattan/assets/img/articleImg/10nyskyline1536.jpg",
        "http://www.telegraph.co.uk/content/dam/Travel/Destinations/Europe/Netherlands/Amsterdam/Amsterdam-overview-canalnighttime-xlarge.jpg",
        "http://barcelona-home.com/events-and-guide/wp-content/uploads/2016/03/walks-barcelona-1.jpg",
        "http://static1.squarespace.com/static/558c4ea0e4b04cda07204377/t/55a96f01e4b0a996cf2e1e1b/1437167395979/Berlin2.jpg?format=1500w",

        "http://geography.name/wp-content/uploads/2016/02/tokyo.jpg",
        "http://www.riofan.com.br/wp-content/uploads/2015/11/Fotos-do-Rio-de-Janeiro.jpg",
        "https://media.timeout.com/images/100644443/image.jpg",
        "http://images.huffingtonpost.com/2015-11-19-1447968585-1661590-6672156239_89c77d53d8_o.jpg",

        "http://www.lastminute.com/c/content/dam/site_gb/images/1155x510-vienna.jpg",
        "http://static1.squarespace.com/static/52da9677e4b03d314575985a/t/557c3f6fe4b0db2f0d0a5de2/1434206066905/Hotels+with+a+View+in+Rome.jpg?format=1500w",
        "http://www.ironman.com/~/media/fc1eebf8fc5a4c0d9f5abefb139f3e54/im70%203%20auckland%20viaduct.jpg?w=1600&h=980&c=1",
        "https://lonelyplanetimages.imgix.net/mastheads/65830387.jpg?sharp=10&vib=20&w=1200"
    };

    public static final Integer[] TEMPERATURE = new Integer[] {
        -10, 18, 22, 8,
        2, 28, 12, 21,
        12, 14, 10, 32
    };

    public static String capitalize(String text) {
        if (isEmpty(text)) return "";
        return text.toUpperCase();
    }

    private static Boolean isEmpty(String text) {
        Boolean result = true;
        Boolean isNull = (text == null);
        if (!isNull) {
            Boolean isZeroLength = (text.length() <= 0);
            Boolean isEmpty = (text.equals(""));
            result = isNull || isZeroLength || isEmpty;
        }
        return result;
    }
}