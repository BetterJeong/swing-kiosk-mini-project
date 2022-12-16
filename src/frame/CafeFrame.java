package frame;

import menu.CafeMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class CafeFrame extends JFrame implements ActionListener {

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

    // 케이크 체크박스
    private JCheckBox strawberryCake;
    private JCheckBox chocoCake;
    private JCheckBox creamCake;

    // 주문 버튼
    private JButton orderButton;

    public CafeFrame() throws HeadlessException {

        this.setBounds(300, 100, 400, 600);
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
        espresso = new JCheckBox("에스프레소 2500원");
        americano = new JCheckBox("아메리카노 3000원");
        latte = new JCheckBox("라떼 3500원");
        vanillaLatte = new JCheckBox("바닐라 라떼 4000원");
        mochaLatte = new JCheckBox("모카 라떼 4000원");

        cherry = new JCheckBox("체리에이드 3500원");
        lemon = new JCheckBox("레몬에이드 3500원");
        greenGrape = new JCheckBox("청포도에이드 3500원");
        grapefruit = new JCheckBox("자몽에이드 3500원");

        peach = new JCheckBox("복숭아 아이스티 3000원");
        chamomile = new JCheckBox("캐모마일 3000원");
        redBush = new JCheckBox("루이보스 3000원");
        englishBreakfast = new JCheckBox("잉글리쉬 브렉퍼스트 3000원");
        earlGray = new JCheckBox("얼그레이 3000원");

        strawberryCake = new JCheckBox("딸기 케이크 4000원");
        chocoCake = new JCheckBox("초코 케이크 4000원");
        creamCake = new JCheckBox("생크림 케이크 4000원");

        // 주문 버튼
        orderButton = new JButton("주문하기");
        orderButton.addActionListener(this);

        display();
    }

    private void display() {
        JPanel orderPanel = new JPanel(new GridLayout(5, 1));

        JPanel coffeePanel = getCoffeePanel();
        JPanel adePanel = getAdePanel();
        JPanel teaPanel = getTeaPanel();
        JPanel cakePanel = getCakePanel();

        orderPanel.add(coffeePanel);
        orderPanel.add(adePanel);
        orderPanel.add(teaPanel);
        orderPanel.add(cakePanel);

        orderPanel.add(orderButton);

        this.add(orderPanel);
    }

    private JPanel getCoffeePanel() {
        JPanel coffeePanel = new JPanel(new BorderLayout());
        JLabel coffeeLabel = new JLabel("커피");
        coffeeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        coffeeLabel.setHorizontalAlignment(JLabel.CENTER);
        coffeePanel.add(coffeeLabel, BorderLayout.NORTH);

        JPanel coffeeCheckBoxPanel = new JPanel(new FlowLayout());
        coffeeCheckBoxPanel.add(espresso);
        coffeeCheckBoxPanel.add(americano);
        coffeeCheckBoxPanel.add(latte);
        coffeeCheckBoxPanel.add(vanillaLatte);
        coffeeCheckBoxPanel.add(mochaLatte);
        coffeePanel.add(coffeeCheckBoxPanel, BorderLayout.CENTER);

        return coffeePanel;
    }

    private JPanel getAdePanel() {
        JPanel adePanel = new JPanel(new BorderLayout());
        JLabel adeLabel = new JLabel("에이드");
        adeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        adeLabel.setHorizontalAlignment(JLabel.CENTER);
        adePanel.add(adeLabel, BorderLayout.NORTH);

        JPanel adeCheckBoxPanel = new JPanel(new FlowLayout());
        adeCheckBoxPanel.add(cherry);
        adeCheckBoxPanel.add(lemon);
        adeCheckBoxPanel.add(greenGrape);
        adeCheckBoxPanel.add(grapefruit);
        adePanel.add(adeCheckBoxPanel, BorderLayout.CENTER);

        return adePanel;
    }

    private JPanel getTeaPanel() {
        JPanel teaPanel = new JPanel(new BorderLayout());
        JLabel teaLabel = new JLabel("티");
        teaLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        teaLabel.setHorizontalAlignment(JLabel.CENTER);
        teaPanel.add(teaLabel, BorderLayout.NORTH);

        JPanel teaCheckBoxPanel = new JPanel(new FlowLayout());
        teaCheckBoxPanel.add(peach);
        teaCheckBoxPanel.add(chamomile);
        teaCheckBoxPanel.add(redBush);
        teaCheckBoxPanel.add(englishBreakfast);
        teaCheckBoxPanel.add(earlGray);
        teaPanel.add(teaCheckBoxPanel, BorderLayout.CENTER);

        return teaPanel;
    }

    private JPanel getCakePanel() {
        JPanel cakePanel = new JPanel(new BorderLayout());
        JLabel cakeLabel = new JLabel("케이크");
        cakeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        cakeLabel.setHorizontalAlignment(JLabel.CENTER);
        cakePanel.add(cakeLabel, BorderLayout.NORTH);

        JPanel cakeCheckBoxPanel = new JPanel(new FlowLayout());
        cakeCheckBoxPanel.add(strawberryCake);
        cakeCheckBoxPanel.add(chocoCake);
        cakeCheckBoxPanel.add(creamCake);

        cakePanel.add(cakeCheckBoxPanel, BorderLayout.CENTER);

        return cakePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int money = 0;
        String msg = "주문서\n";
        if (espresso.isSelected()) {
            money += 2500;
            String text = "에스프레소 2500원\n";
            msg += text;
        }
        if (americano.isSelected()) {
            money += 3000;
            String text = "아메리카노 3000원\n";
            msg += text;
        }
        if (latte.isSelected()) {
            money += 3500;
            String text = "라떼 3500원\n";
            msg += text;
        }
        if (vanillaLatte.isSelected()) {
            money += 4000;
            String text = "바닐라 라떼 4000원\n";
            msg += text;
        }
        if (mochaLatte.isSelected()) {
            money += 4000;
            String text = "모카 라떼 4000원\n";
            msg += text;
        }

        if (cherry.isSelected()) {
            money += 3500;
            String text = "체리에이드 3500원\n";
            msg += text;
        }
        if (lemon.isSelected()) {
            money += 3500;
            String text = "레몬에이드 3500원\n";
            msg += text;
        }
        if (greenGrape.isSelected()) {
            money += 3500;
            String text = "청포도에이드 3500원\n";
            msg += text;
        }
        if (grapefruit.isSelected()) {
            money += 3500;
            String text = "자몽에이드 3500원\n";
            msg += text;
        }

        if (peach.isSelected()) {
            money += 3000;
            String text = "복숭아 아이스티 3000원\n";
            msg += text;
        }
        if (chamomile.isSelected()) {
            money += 3000;
            String text = "캐모마일 3000원\n";
            msg += text;
        }
        if (redBush.isSelected()) {
            money += 3000;
            String text = "루이보스 3000원\n";
            msg += text;
        }
        if (englishBreakfast.isSelected()) {
            money += 3000;
            String text = "잉글리시 브렉퍼스트 3000원\n";
            msg += text;
        }
        if (earlGray.isSelected()) {
            money += 3000;
            String text = "얼그레이 3000원\n";
            msg += text;
        }

        if (strawberryCake.isSelected()) {
            money += 4000;
            String text = "딸기 케이크 4000원\n";
            msg += text;
        }
        if (chocoCake.isSelected()) {
            money += 4000;
            String text = "초코 케이크 4000원\n";
            msg += text;
        }
        if (creamCake.isSelected()) {
            money += 4000;
            String text = "생크림 케이크 4000원\n";
            msg += text;
        }

        msg += "\n\n합계: " + money+"원";

        int r = JOptionPane.showConfirmDialog(this, msg + "주문하시겠습니까?", "주문하기", JOptionPane.YES_NO_OPTION);

        if (r == JOptionPane.YES_OPTION) {
            try {
                FileOutputStream order = new FileOutputStream("c:/swing-kiosk/order.txt");
                byte[] b = msg.getBytes();
                order.write(b);
                JOptionPane.showMessageDialog(this, "주문 전달 완료!");
            } catch (FileNotFoundException ex) {
                System.err.print("에러");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "메뉴를 다시 선택해주세요.");
        }
    }
}
