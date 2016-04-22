

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by wang on 22/04/16.
 */

public class Main {

    public static void main(String args[]) throws UnsupportedEncodingException {

        String url = "https://api.helldiversgame.com/0.3/";
        //Url parameters
        String urlParameters = "action=" + URLEncoder.encode("get_campaign_status", "UTF-8");

        System.setProperty("javax.net.ssl.trustStore", "/Users/wang/Desktop/arrowheadkeystore");

        ExecutePost executePost = new ExecutePost(url, urlParameters);

        System.out.println(executePost.fetchData());

    }


}
