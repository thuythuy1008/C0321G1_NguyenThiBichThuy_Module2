package bai17_string_va_regex.bai_tap.bai_tap_Optional_Crawl_Tin_Tuc;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\s+", " ");
            content = content.replaceAll("&quot;", "\"");
            Pattern p = Pattern.compile("news-item__title'>(.*?)title=\"(.*?)\">");
            Matcher m = p.matcher(content);

            Queue<String> newsList = new ArrayDeque<>();
            while (m.find()) {
                if (!newsList.contains(m.group(2))) {
                    newsList.offer(m.group(2));
                }
            }
            System.out.println("CẬP NHẬT TIN TỨC HẰNG NGÀY:");
            int i = 1;
            while (!newsList.isEmpty()) {
                System.out.println(i++ + ". " + newsList.poll());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
