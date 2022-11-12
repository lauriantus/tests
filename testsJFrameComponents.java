package com.shpp.p2p.cs.irybak.assignment7.com.shpp.p2p.cs.irybak.assignment7;

import acm.graphics.GObject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class testsJFrameComponents extends JFrame {

    /*
    public testsJFrameComponents() {
        setTitle("Rotate JLabel");
        JLabel label = new RotateLabel("TutorialsPoint");
        add(label, BorderLayout.CENTER);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private class RotateLabel extends JLabel {
        public RotateLabel(String text) {
            super(text);
            Font font = new Font("Verdana", Font.ITALIC, 10);
            FontMetrics metrics = new FontMetrics(font){};
            Rectangle2D bounds = metrics.getStringBounds(text, null);
            setBounds(0, 0, (int) bounds.getWidth(), (int) bounds.getHeight());
        }
        @Override
        public void paintComponent(Graphics g) {
            Graphics2D gx = (Graphics2D) g;
            gx.rotate(0.6, getX() + getWidth()/2, getY() + getHeight()/2);
            super.paintComponent(g);
        }
    }
    */

    /* FRAME */
    public static JFrame jFrame;
    public static void main(String[] args) throws InterruptedException {
        getFrame("Settings");
//        buttons();
//        deleteGraph();
//        labels();
//        jFrame.setVisible(true);
//        progress();
//        jPanels();
//        layoutPosition();
//        flowLayout();
//        deleteGraph();
//        gridLayout();

        gridBagLayout();
        jFrame.setVisible(true);

    }

    private static void deleteGraph() {
        JPanel selectGraph = new JPanel(new FlowLayout());
        selectGraph.setBackground(Color.GRAY);
        selectGraph.setBorder(LineBorder.createBlackLineBorder());
        selectGraph.setPreferredSize(new Dimension(jFrame.getWidth(), 50));
        JTextField enterTheName = new JTextField(15);
        JButton deleteGraph = new JButton("Delete this graph");

//        jFrame.setPreferredSize(new Dimension(deleteGraph.getWidth() + enterTheName.getWidth(), deleteGraph.getHeight()));
        selectGraph.add(enterTheName);
        selectGraph.add(deleteGraph);

        jFrame.add(selectGraph, BorderLayout.NORTH);
    }

    private static void getFrame(String nameFrame) {
        jFrame = new JFrame(nameFrame);
        jFrame.setSize(new Dimension(450, 250));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
//        jFrame.setLayout(new GridBagLayout());
        jFrame.setLayout(new BorderLayout());
//        jFrame.setLayout(new FlowLayout());
//        jFrame.setLayout(new GridLayout(3,3));
    }
    /* BUTTONS */
    /*
    private static final JButton[] buttons = new JButton[6];
    private static final String[] nameButtons = {
            "Button 1",
            "Button 2",
            "Button 3",
            "Button 4",
            "Button 5",
            "Button 6"
    };
    private static final Color[] colorsOfButtons = {
            Color.GRAY,
            Color.CYAN,
            Color.RED,
            Color.pink,
            Color.GREEN,
            Color.blue
    };
    private static void buttons() {
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(nameButtons[i]);
            buttons[i].setCursor(cursor);
            buttons[i].setForeground(colorsOfButtons[buttons.length - i - 1]);
            buttons[i].setBackground(colorsOfButtons[i]);

            jFrame.add(buttons[i]);
        }
    }
    */
    /* DELETE GRAPH */
    /*
    private static final int longField = 20;
    private static final JTextField enterGraph = new JTextField(longField);
    private static final JButton deleteGraph = new JButton("Delete graph");

    private static void deleteGraph() {
        deleteGraph.setBackground(Color.GRAY);
        deleteGraph.setForeground(Color.black);
//        deleteGraph.setBorder(new BevelBorder(BevelBorder.LOWERED));  // отжатая и зажатая кнопка

        JPasswordField enterPass = new JPasswordField("Pass", 5);
        jFrame.add(enterPass);
        jFrame.add(enterGraph);
        jFrame.add(deleteGraph);
    }
    */
    /* LABELS */
    /*
    private static final Font font = new Font("Verdana", Font.ITALIC, 25);
    private static final JLabel[] names = {
            new JLabel("Ivan"),
            new JLabel("Anna"),
            new JLabel("Maria")
    };
    private static void labels() {
        for (int name = 0; name < names.length; name++) {
            names[name].setFont(font);
            names[name].setBackground(Color.cyan);
            names[name].setForeground(Color.BLACK);

            jFrame.add(names[name]);
//            names[name].setLocation(jFrame.getX() + 50, jFrame.getY() + 50 + 50 * name);
        }
    }

     */
    /* PROGRESS_BAR */
    /*
    private static final JProgressBar progress = new JProgressBar();
    private static void progress() throws InterruptedException {
        progress.setStringPainted(true);
        progress.setIndeterminate(true);
        progress.setMinimum(0);
        progress.setMaximum(450);
        jFrame.add(progress);

        for (int i = progress.getMinimum(); i <= progress.getMaximum(); i++) {
            Thread.sleep(5);
            progress.setValue(i);
        }
        progress.setIndeterminate(false);
        progress.setString("Completed");
        progress.setForeground(Color.GREEN);
    }
    */
    /* JPANEL */
    /*
    private static final JPanel panel1 = new JPanel();
    private static final JPanel panel2 = new JPanel();
    private static final JButton button = new JButton("Enter");

    private static void jPanels() {
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.YELLOW);

        panel1.add(button);
        panel1.add(panel2);
        jFrame.add(panel1);

        Component[] components = panel1.getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JPanel) System.out.println("panel");
            if (components[i] instanceof JButton) {
                String title = ((JButton) components[i]).getText();
                System.out.println(title);
            }
        }
    }
     */
    /* BORDER_LAYOUT */
    /*
    private static final JButton button = new JButton("Test");
    private static final JPanel[] panels = new JPanel[5];
    private static final Color[] colorsOfPanels = {
            Color.CYAN,
            Color.RED,
            Color.pink,
            Color.GREEN,
            Color.GRAY,
            Color.blue
    };
    private static final String[] positions = {
            BorderLayout.PAGE_START,
            BorderLayout.PAGE_END,
            BorderLayout.LINE_END,
            BorderLayout.LINE_START,
            BorderLayout.CENTER
    };
    private static void layoutPosition() {
        jFrame.add(button, BorderLayout.PAGE_START);
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setBackground(colorsOfPanels[i]);
            jFrame.add(panels[i], positions[i]);
        }
        JButton buttonTest = new JButton("Test 2");
        buttonTest.setSize(new Dimension(100, 50));
        panels[4].setLayout(new BorderLayout());
        panels[4].add(button, BorderLayout.NORTH);
        panels[4].add(buttonTest, BorderLayout.SOUTH);
    }
    */
    /* FLOAT_LAYOUT */
    /*
    private static final JButton button = new JButton("Test 1");
    private static final JTextField field = new JTextField(10);
    private static final JButton[] buttons = new JButton[10];
    private static final JPanel panel = new JPanel(new FlowLayout());

    private static void flowLayout() {
        panel.setBackground(Color.GREEN);
        panel.add(button);
        panel.add(field);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            panel.add(buttons[i]);
        }
        panel.setPreferredSize(new Dimension(500, 100));
        jFrame.add(panel, BorderLayout.SOUTH);
//        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = new JButton("Test " + (i + 1));
//            jFrame.add(buttons[i]);
//        }
    }
     */
    /* GRID_LAYOUT */
    /*
    private static void gridLayout() {
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JTextField textField = new JTextField(10);
        JButton[] buttons = new JButton[4];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            panel.add(buttons[i]);
        }
        panel.add(textField);
        jFrame.add(panel, BorderLayout.SOUTH);
    }
    */

    /* GRID_BAG_LAYOUT */
    private static void gridBagLayout() {
        JLabel loginLabel = new JLabel("Login: ");
        JLabel passwordLabel = new JLabel("Password: ");

        JTextField loginField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);

        JButton loginButton = new JButton("Login in");
        JButton registrationButton = new JButton("Registration");

        GridBagConstraints grid = new GridBagConstraints();

        grid.gridx = 2;
        grid.gridy = 2;
        grid.gridwidth = 5;
        grid.gridheight = 1;

        jFrame.add(loginLabel, grid);
    }
}