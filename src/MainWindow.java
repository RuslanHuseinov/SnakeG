import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Zmeyka");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(400,400);
        setVisible(true);
        add(new GameField());
        this.setVisible(true);
//        this.setFocusableWindowState(true);
        this.setFocusable(true);
//        this.requestFocusInWindow();
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
