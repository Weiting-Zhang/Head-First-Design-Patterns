import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * SwingObserverExample
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        // With lambdas
		button.addActionListener(event -> 
            System.out.println("Don't do it, you might regret it!")
        );
        button.addActionListener(event ->
            System.out.println("Come on, do it!")
        );
        frame.getContentPane().add(BorderLayout.CENTER, button);
        // 从这里设置 frame 属性
    }

    // class AngelListerer implements ActionListener {
    //     public void actionPerformed(ActionListener event) {
    //         System.out.println("Don't do it, you might regret it!");
    //     }
    // }

    // class DevilListener implements ActionListener {
    //     public void actionPerformed(ActionListener event) {
    //         System.out.println("Come on, do it!");
    //     }
    // }
}