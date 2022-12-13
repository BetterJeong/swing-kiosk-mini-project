package frame;

import menu.CafeMenu;

import javax.swing.*;
import java.awt.*;

public class CafeFrame extends JFrame {

    CafeMenu cafeMenu;

    public CafeFrame() throws HeadlessException {

        this.setBounds(300, 100, 800, 600);
        this.setTitle("난정 카페 키오스크");

        init();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void init() {
        // 메뉴
        cafeMenu = new CafeMenu();
        this.setJMenuBar(cafeMenu);
    }


}
