package frame;

import menu.CafeMenu;

import javax.swing.*;
import java.awt.*;

public class CafeFrame extends JFrame {

    CafeMenu cafeMenu;

    // 커피 체크박스
    private JCheckBox espresso;
    private JCheckBox americano;
    private JCheckBox latte;
    private JCheckBox vanillaLatte;
    private JCheckBox mochaLatte;

    // 에이드 체크박스
    private JCheckBox cherry;
    private JCheckBox lemon;
    private JCheckBox greenGrape;
    private JCheckBox grapefruit;

    // 티 체크박스
    private JCheckBox peach;
    private JCheckBox chamomile;
    private JCheckBox redBush;
    private JCheckBox englishBreakfast;
    private JCheckBox earlGray;


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

        // 체크박스
        espresso = new JCheckBox("에스프레소");
        americano = new JCheckBox("아메리카노");
        latte = new JCheckBox("라떼");
        vanillaLatte = new JCheckBox("바닐라 라떼");
        mochaLatte = new JCheckBox("모카 라떼");

        cherry = new JCheckBox("체리에이드");
        lemon = new JCheckBox("레몬에이드");
        greenGrape = new JCheckBox("청포도에이드");
        grapefruit = new JCheckBox("자몽에이드");

        peach = new JCheckBox("복숭아 아이스티");
        chamomile = new JCheckBox("캐모마일");
        redBush = new JCheckBox("루이보스");
        englishBreakfast = new JCheckBox("잉글리쉬 브렉퍼스트");
        earlGray = new JCheckBox("얼그레이");

        display();
    }

    private void display() {
        JPanel orderPanel = new JPanel(new GridLayout(3, 1));

        JPanel coffeePanel = getCoffeePanel();
        JPanel adePanel = getAdePanel();
        JPanel teaPanel = getTeaPanel();

        orderPanel.add(coffeePanel);
        orderPanel.add(adePanel);
        orderPanel.add(teaPanel);

        this.add(orderPanel);
    }

    private JPanel getCoffeePanel() {
        JPanel coffeePanel = new JPanel();
        JLabel coffeeLabel = new JLabel("커피");
        coffeePanel.add(coffeeLabel, BorderLayout.NORTH);

        JPanel coffeeCheckBoxPanel = new JPanel(new FlowLayout());
        coffeeCheckBoxPanel.add(espresso);
        coffeeCheckBoxPanel.add(americano);
        coffeeCheckBoxPanel.add(latte);
        coffeeCheckBoxPanel.add(vanillaLatte);
        coffeeCheckBoxPanel.add(mochaLatte);
        coffeePanel.add(coffeeCheckBoxPanel, BorderLayout.SOUTH);

        return coffeePanel;
    }

    private JPanel getAdePanel() {
        JPanel adePanel = new JPanel();
        JLabel adeLabel = new JLabel("에이드");
        adePanel.add(adeLabel, BorderLayout.NORTH);

        JPanel adeCheckBoxPanel = new JPanel(new FlowLayout());
        adeCheckBoxPanel.add(cherry);
        adeCheckBoxPanel.add(lemon);
        adeCheckBoxPanel.add(greenGrape);
        adeCheckBoxPanel.add(grapefruit);
        adePanel.add(adeCheckBoxPanel, BorderLayout.SOUTH);

        return adePanel;
    }

    private JPanel getTeaPanel() {
        JPanel teaPanel = new JPanel();
        JLabel teaLabel = new JLabel("티");
        teaPanel.add(teaLabel, BorderLayout.NORTH);

        JPanel teaCheckBoxPanel = new JPanel(new FlowLayout());
        teaCheckBoxPanel.add(peach);
        teaCheckBoxPanel.add(chamomile);
        teaCheckBoxPanel.add(redBush);
        teaCheckBoxPanel.add(englishBreakfast);
        teaCheckBoxPanel.add(earlGray);
        teaPanel.add(teaCheckBoxPanel, BorderLayout.SOUTH);

        return teaPanel;
    }
}
