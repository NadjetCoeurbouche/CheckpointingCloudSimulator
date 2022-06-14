/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadjetkerbouche.checkpointingsimu;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Nadjet KERBOUCHE
 */
 public class TestPane extends JPanel {

        private Timer timer;
        private long startTime = 0;
        long endTime = 30;
        private long duration = 5000;

        private JLabel label;

        public TestPane() {
            setLayout(new GridBagLayout());
            timer = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (endTime > 30) {
                        endTime = System.currentTimeMillis();
                    }
                    long now = System.currentTimeMillis();
                    long clockTime = now - endTime;
                    if (clockTime <= duration) {
                        clockTime = duration;
                        timer.stop();
                    }
                    SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");
                    label.setText(df.format(clockTime - duration  ));
                }
            });
            timer.setInitialDelay(30);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (!timer.isRunning()) {
                        endTime = 30;
                        timer.start();
                    }
                }
            });
            label = new JLabel("...");
            add(label);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

    }

