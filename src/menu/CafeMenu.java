package menu;

import javax.swing.*;
import java.util.ArrayList;

public class CafeMenu extends JMenuBar {

    int MAX = 4;
    ArrayList<JMenu> menuArrayList;
    String[] menuTextArray = {"커피", "에이드", "티", "디저트"};
    String[] coffeeTextArray = {"에스프레소", "아메리카노", "라떼", "바닐라라떼", "모카라떼"};
    String[] adeTextArray = {"체리에이드", "레몬에이드", "청포도에이드", "자몽에이드"};
    String[] teaTextArray = {"복숭아 아이스티", "캐모마일", "루이보스", "잉글리쉬 브렉퍼스트", "얼그레이"};
    String[] dessertTextArray = {"초코 케이크", "딸기 케이크", "생크림 케이크"};

    public CafeMenu() {

        menuArrayList = new ArrayList<>();

        for (int i = 0; i < MAX; i++) {
            menuArrayList.add(new JMenu(menuTextArray[i]));
            this.add(menuArrayList.get(i));
        }

        init();

    }

    private void init() {
        initCoffee();
        initAde();
        initTea();
        initDessert();
    }

    private void initCoffee() {
        for (int i = 0; i < coffeeTextArray.length; i++) {
            menuArrayList.get(0).add(new JMenuItem(coffeeTextArray[i]));
        }
    }

    private void initAde() {
        for (int i = 0; i < adeTextArray.length; i++) {
            menuArrayList.get(1).add(new JMenuItem(adeTextArray[i]));
        }
    }

    private void initTea() {
        for (int i = 0; i < teaTextArray.length; i++) {
            menuArrayList.get(2).add(new JMenuItem(teaTextArray[i]));
        }
    }

    private void initDessert() {
        for (int i = 0; i < dessertTextArray.length; i++) {
            menuArrayList.get(3).add(new JMenuItem(dessertTextArray[i]));
        }
    }
}
