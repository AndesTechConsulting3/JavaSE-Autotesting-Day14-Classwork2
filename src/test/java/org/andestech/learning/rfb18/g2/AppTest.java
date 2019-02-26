package org.andestech.learning.rfb18.g2;


import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.testng.Assert.assertTrue;


public class AppTest {


    @Test(parameters = "url")
    public void isSiteAliveTest(String url) {
        System.out.println("url: " + url);
        assertTrue(true);
    }

    @Test(dataProvider = "getURLs", dependsOnMethods = "isSiteAliveTest")
    public void isElementPresentTest(String id) {

        System.out.println("id: " + id);

    }

    @Test(dataProvider = "getURLs2", dependsOnMethods = "isSiteAliveTest")
    public void isElementPresentTest2(String id) {

        System.out.println("id: " + id);

    }

    @DataProvider
    public static Object[][] getURLs(ITestContext ctx) {

        String filename = ctx.getCurrentXmlTest().getParameter("fname");
        System.out.println("fname: " + filename);

        Object[][] datas = null;
        List list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filename)) {

            Scanner scanner = new Scanner(fis);
            scanner.useDelimiter("\r\n");
            while (scanner.hasNext()) {
                String dataString = scanner.next();
                if (dataString.startsWith("#") || dataString.isEmpty()) continue;
                list.add(dataString.trim());
            }

            int N = list.size();
            datas = new Object[N][1];
            for (int i = 0; i < N; i++) datas[i] = new Object[]{list.get(i)};

        } catch (IOException ex) {ex.printStackTrace(); }
        return datas;
    }


    @DataProvider
    public static Object[] getURLs2(ITestContext ctx) {

        String filename = ctx.getCurrentXmlTest().getParameter("fname");
        System.out.println("fname: " + filename);
        List list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filename)) {

            Scanner scanner = new Scanner(fis);
            scanner.useDelimiter("\r\n");
            while (scanner.hasNext()) {
                String dataString = scanner.next();
                if (dataString.startsWith("#") || dataString.isEmpty()) continue;
                list.add(dataString.trim());
            }
        } catch (IOException ex) {ex.printStackTrace(); }
        return list.toArray();
    }

}