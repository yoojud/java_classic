package exam;

import javax.swing.JFrame;
import javax.swing.JButton;

public class FrameSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        JButton button = new JButton("Click");
        button.setSize(150, 100);
        button.setLocation(150, 50);

        // 익명 클래스
        // ActionListener listener = new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // System.out.println("Button Clicked");
        // }
        // };
        // button.addActionListener(listener);

        // Lambda 사용
        button.addActionListener(s -> System.out.println(s + "Button Clicked"));

        // 버튼 클래스
        // button.addActionListener(new ButtonActionListener());
        frame.add(button);

        frame.setVisible(true);
    }

}

// 버튼 클래스
// class ButtonActionListener implements ActionListener {
// public void actionPerformed(ActionEvent e) {
// System.out.println("Button Clicked");
// }
// }