package frame;

import drink.Coffee;

import javax.swing.*;
import java.util.ArrayList;

public class CafeMenu extends JMenuBar {

    int MAX = 4;
    ArrayList<JMenu> menuArrayList;
    String[] menuTextArray = {"커피", "에이드", "티", "디저트"};
    String[] coffeeTextArray = {"에스프레소", "아메리카노", "라떼", "바닐라라떼", "모카라떼"};
    String[] adeTextArray = {"체리에이드", "레몬에이드", "청포도에이드", "자몽에이드"};

    public CafeMenu() {

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
        for (int i = 0; i < menuArrayList.size(); i++) {
            for (int j = 0; j < coffeeTextArray.length; j++) {
                menuArrayList.get(i).add(new JMenuItem(coffeeTextArray[i]));
            }
        }
    }

    private void initAde() {
        for (int i = 0; i < menuArrayList.size(); i++) {
            for (int j = 0; j < adeTextArray.length; j++) {
                menuArrayList.get(i).add(new JMenuItem(adeTextArray[i]));
            }
        }
    }

    private void initTea() {
        teaMenu.add(new JMenuItem("복숭아 아이스티"));
        teaMenu.add(new JMenuItem("캐모마일"));
        teaMenu.add(new JMenuItem("루이보스"));
        teaMenu.add(new JMenuItem("잉글리쉬 브렉퍼스트"));
        teaMenu.add(new JMenuItem("얼그레이"));
    }

    private void initDessert() {
        dessertMenu.add(new JMenuItem("스트로베리 초콜릿 생크림 케이크"));
        dessertMenu.add(new JMenuItem("당근 케이크"));
        dessertMenu.add(new JMenuItem("고구마 밀크 생크림 케이크"));
        dessertMenu.add(new JMenuItem("마스카포네 티라미수 케이크"));
        dessertMenu.add(new JMenuItem("레드 벨벳 케이크"));
    }
}
