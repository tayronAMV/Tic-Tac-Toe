import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class XorOButton extends JButton {

    private ImageIcon xIcon;
    private ImageIcon oIcon;
    private boolean Check = false ;
    public static boolean  [][] arrX = new boolean [3][3];
    public static boolean  [][] arrO =new boolean[3][3];

    public static int flag = 1 ;// Flag to indicate X or O

    public XorOButton(int i,int j) {
        super(""); // Empty text
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Remove default border
        setContentAreaFilled(true); // Make button transparent
        setBackground(Color.white);


        // Load icons (replace with your image paths)
        xIcon = new ImageIcon("C:/Users/amita/Pictures/X.png");
        oIcon = new ImageIcon("C:/Users/amita/Pictures/O.png");
        ActionListener listener = new ActionListener() {
            Boolean tmp ;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Check && !func())
                {
                    Check = true ;
                    if(flag == 1)
                    {
                        setIcon(xIcon);
                        arrX[i][j] = true ;
                        flag = 0;
                        tmp = func() ;
                    }
                    else
                    {
                        setIcon(oIcon);
                        arrO[i][j] = true ;
                        flag = 1;
                        tmp = func() ;
                    }
                }
            }};
        this.addActionListener(listener);

        // Set initial state (can be changed later)
    }
    public boolean func()
    {
        for(int i = 0 ;i<3 ;i++)
        {
            if((arrX[i][0]&&arrX[i][1] &&arrX[i][2] )||(arrO[i][0]&&arrO[i][1] &&arrO[i][2]))
            {
                Main.Barr[i][0].setBackground(Color.BLACK);
                Main.Barr[i][1].setBackground(Color.BLACK);
                Main.Barr[i][2].setBackground(Color.BLACK);
                return true;
            }
        }
        for(int i = 0 ;i<3 ;i++)
        {
            if((arrX[0][i]&&arrX[1][i]&&arrX[2][i])||(arrO[0][i]&&arrO[1][i]&&arrO[2][i])){
                Main.Barr[0][i].setBackground(Color.BLACK);
                Main.Barr[1][i].setBackground(Color.BLACK);
                Main.Barr[2][i].setBackground(Color.BLACK);
                return true;
            }
        }
        if((arrX[0][0]&&arrX[1][1]&&arrX[2][2]) || (arrO[0][0]&&arrO[1][1]&&arrO[2][2])){
            Main.Barr[0][0].setBackground(Color.BLACK);
            Main.Barr[1][1].setBackground(Color.BLACK);
            Main.Barr[2][2].setBackground(Color.BLACK);
            return true;
        }
        if((arrX[0][2]&&arrX[1][1]&&arrX[2][0]) || (arrO[0][2]&&arrO[1][1]&&arrO[2][0])){
            Main.Barr[0][2].setBackground(Color.BLACK);
            Main.Barr[1][1].setBackground(Color.BLACK);
            Main.Barr[2][0].setBackground(Color.BLACK);
            return true;
        }
        return false ;

    }


    }



