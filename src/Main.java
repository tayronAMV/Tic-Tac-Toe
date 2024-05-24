import java.util.*;
import java.util.stream.Collectors;
import java.awt.*;
import javax.swing.*;

public class Main {
    public static XorOButton[][] Barr = new XorOButton[3][3];
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
            {
                Barr[i][j] = new XorOButton(i,j);
                frame.add(Barr[i][j]);
            }
        }

        frame.setSize(1000, 1000);  // Set desired size for the frame



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}