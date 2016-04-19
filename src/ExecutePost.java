import java.io.*;
import java.net.URL;
import java.net.*;

/**
 * Created by wang on 19/04/16.
 */
public class ExecutePost {


    public static String excutePost(String targetURL, String urlParameters)
    {
        URL url;
        HttpURLConnection connection = null;
        try {
            //Create connection
            System.out.println("try");
            url = new URL(targetURL);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");

            connection.setRequestProperty("Content-Length", "" +
                    Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream (
                    connection.getOutputStream ());
            wr.writeBytes (urlParameters);
            wr.flush ();
            wr.close ();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();

            return response.toString();

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("catch");
            return null;

        } finally {
            System.out.println("finally");
            if(connection != null) {
                connection.disconnect();
            }
        }
    }

    public static void main(String args[]) throws UnsupportedEncodingException {

        //Url parameters
        String urlParameters = "action=" + URLEncoder.encode("get_campaign_status", "UTF-8");
        String url = "https://api.helldiversgame.com/0.3/";
        System.setProperty("javax.net.ssl.trustStore", "/Users/wang/Desktop/arrowheadkeystore");
        System.out.println(excutePost(url, urlParameters));

    }


}
