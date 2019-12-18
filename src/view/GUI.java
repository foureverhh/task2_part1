package view;

import controller.Controller;
import model.Facade;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel temperaturePanel;
    private JPanel responsePanel;
    private JPanel buttonPanel;
    private JRadioButton lowTemperature;
    private JRadioButton niceTemperature;
    private JRadioButton highTemperature;
    private ButtonGroup temperatureGroup;
    private JButton showResult;
    private JScrollPane scrollPane;
    private JTextArea responses;
    private int temperature = -10;
    private Controller controller;

    public GUI(){
        this.setSize(600,600);
        this.setTitle("Temperature Demo");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        temperaturePanel = new JPanel();
        temperaturePanel.setBorder(BorderFactory.createTitledBorder("Temperature:"));
        responsePanel = new JPanel();
        responsePanel.setBorder(BorderFactory.createTitledBorder("Responses"));
        buttonPanel = new JPanel();

        //temperature panel
        lowTemperature = new JRadioButton("-10");
        lowTemperature.setActionCommand("-10");
        lowTemperature.setSelected(true);
        niceTemperature = new JRadioButton("10");
        niceTemperature.setActionCommand("10");
        highTemperature = new JRadioButton("35");
        highTemperature.setActionCommand("35");
        lowTemperature.addActionListener(l->{
            temperature = Integer.parseInt(l.getActionCommand());
        });
        niceTemperature.addActionListener(l->{
            temperature = Integer.parseInt(l.getActionCommand());
        });
        highTemperature.addActionListener(l->{
            temperature = Integer.parseInt(l.getActionCommand());
        });
        temperatureGroup = new ButtonGroup();
        temperatureGroup.add(lowTemperature);
        temperatureGroup.add(niceTemperature);
        temperatureGroup.add(highTemperature);
        temperaturePanel.add(lowTemperature);
        temperaturePanel.add(niceTemperature);
        temperaturePanel.add(highTemperature);

        //response panel
        responses = new JTextArea(27,46);
        scrollPane = new JScrollPane(responses);
        responsePanel.add(scrollPane);

        //button panel
        showResult = new JButton("Show result");
        buttonPanel.add(showResult);
        showResult.addActionListener(l->{
            controller = new Controller();
            controller.setWeatherTemperature(temperature);
            responses.append("Responses are:\n");
            responses.append(controller.getFacade().getRetiredJack().getResponse() + "\n" +
                    controller.getFacade().getWorkerJack().getResponse() + "\n" +
                    controller.getFacade().getStudentJack().getResponse() + "\n");
            responses.append("\n");
        });

        //Add temperature and responsePanel
        this.add(temperaturePanel,BorderLayout.NORTH);
        this.add(responsePanel);
        this.add(buttonPanel,BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
