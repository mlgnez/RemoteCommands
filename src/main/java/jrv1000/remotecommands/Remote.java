package jrv1000.remotecommands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Remote {

    public static URL fileLink;

    static {
        try {
            fileLink = new URL("https://raw.githubusercontent.com/mlgnez/RemoteCommands/main/commands.txt");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static String[] getTextFromGithub() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(fileLink.openStream()));

        StringBuffer sb = new StringBuffer();

        String line;
        while ((line = in.readLine()) != null) {
            sb.append(line + "\n");
        }

        String[] commands = sb.toString().split("\n");

        in.close();

        return commands;

    }

}
