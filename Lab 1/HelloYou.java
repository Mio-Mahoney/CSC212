package greetings;

import javax.swing.*;
import java.util.Arrays;

public class HelloYou {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Who are you?");
        System.out.println("Hello " + name + "!");
    }
}
