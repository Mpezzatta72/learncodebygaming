import javax.swing.*;

class app{

    private static void initWindow(){

        JFrame window = new JFrame("Can't stop, won't stop, GameStop");

        Window.setDefaultCloseOperation(JFame.EXIT_ON_CLOSE);

        Board board = new Board();

        window.add(board);
        window.addKeyListener(board);

        window.setResizable(false);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
}
public static void main (String[] args) {

    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            initWindow();
        }
        });
    }
}
    
