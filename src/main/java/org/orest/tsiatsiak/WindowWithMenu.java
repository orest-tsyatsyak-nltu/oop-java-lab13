package org.orest.tsiatsiak;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;

public class WindowWithMenu extends JFrame {

    public WindowWithMenu() {
        setUpWindow();
        setUpMenuBar();
        revalidate();
    }

    private void setUpWindow() {
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Window with menu");
    }

    private void setUpMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        setUpViewMenuItem(menuBar);

        setUpServiceMenuItem(menuBar);

        setJMenuBar(menuBar);
    }

    private void setUpViewMenuItem(JMenuBar menuBar) {
        JMenu viewMenu = new JMenu("Вигляд");
        JMenu panelOfInstruments = new JMenu("Панель інструментів");
        JCheckBoxMenuItem commonButtons = new JCheckBoxMenuItem("Звичайні кнопки");
        JCheckBoxMenuItem addressBar = new JCheckBoxMenuItem("Адресний рядок");
        panelOfInstruments.add(commonButtons);
        panelOfInstruments.add(addressBar);

        viewMenu.add(panelOfInstruments);

        JMenuItem table = new JMenuItem("Таблиця");

        viewMenu.add(table);
        viewMenu.add(new JSeparator());
        JMenuItem list = new JMenuItem("Список");
        viewMenu.add(list);

        menuBar.add(viewMenu);
    }

    private void setUpServiceMenuItem(JMenuBar menuBar) {
        JMenu service = new JMenu("Сервіс");
        JMenuItem connectNetworkDisk = new JMenuItem("Під'єднати диск мережі");
        JMenuItem disconnectNetworkDisk = new JMenuItem("Від'єднати диск мережі");
        service.add(connectNetworkDisk);
        service.add(disconnectNetworkDisk);

        menuBar.add(service);
    }


}
