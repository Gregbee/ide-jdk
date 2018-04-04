package fr.wildcodescholl.idetest;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class Start {

    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("http://img.over-blog-kiwi.com/1/47/93/75/20150924/ob_7729eb_guy18.jpg"))));
        jf.pack();
        jf.setVisible(true);
    }
}
