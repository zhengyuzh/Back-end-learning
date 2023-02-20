package com.atguigu.java4;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/20 14:55
 * @Description:
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MineSweeper extends JFrame { private JButton[][] buttons; private int[][] mines; private int[][] counts; private int row; private int col; private int mineNum; private int count; private boolean isGameOver;

    public MineSweeper(int row, int col, int mineNum) {
        this.row = row;
        this.col = col;
        this.mineNum = mineNum;
        this.count = 0;
        this.isGameOver = false;
        this.buttons = new JButton[row][col];
        this.mines = new int[row][col];
        this.counts = new int[row][col];
        initMines();
        initCounts();
        initFrame();
    }

    private void initMines() {
        Random random = new Random();
        int num = 0;
        while (num < mineNum) {
            int x = random.nextInt(row);
            int y = random.nextInt(col);
            if (mines[x][y] == 0) {
                mines[x][y] = 1;
                num++;
            }
        }
    }

    private void initCounts() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mines[i][j] == 1) {
                    counts[i][j] = -1;
                } else {
                    int count = 0;
                    if (i > 0 && j > 0 && mines[i - 1][j - 1] == 1) {
                        count++;
                    }
                    if (i > 0 && mines[i - 1][j] == 1) {
                        count++;
                    }
                    if (i > 0 && j < col - 1 && mines[i - 1][j + 1] == 1) {
                        count++;
                    }
                    if (j > 0 && mines[i][j - 1] == 1) {
                        count++;
                    }
                    if (j < col - 1 && mines[i][j + 1] == 1) {
                        count++;
                    }
                    if (i < row - 1 && j > 0 && mines[i + 1][j - 1] == 1) {
                        count++;
                    }
                    if (i < row - 1 && mines[i + 1][j] == 1) {
                        count++;
                    }
                    if (i < row - 1 && j < col - 1 && mines[i + 1][j + 1] == 1) {
                        count++;
                    }
                    counts[i][j] = count;
                }
            }
        }
    }

    private void initFrame() {
        this.setTitle("扫雷");
        this.setSize(col * 50, row * 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(row, col));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.GRAY);
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton) e.getSource();
                        int x = 0;
                        int y = 0;
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (buttons[i][j] == button) {
                                    x = i;
                                    y = j;
                                    break;
                                }
                            }
                        }
                        if (mines[x][y] == 1) {
                            button.setBackground(Color.RED);
                            isGameOver = true;
                        } else {
                            button.setText(String.valueOf(counts[x][y]));
                            button.setEnabled(false);
                            count++;
                        }
                        if (count == row * col - mineNum) {
                            JOptionPane.showMessageDialog(null, "恭喜你，你赢了！");
                            isGameOver = true;
                        }
                        if (isGameOver) {
                            for (int i = 0; i < row; i++) {
                                for (int j = 0; j < col; j++) {
                                    if (mines[i][j] == 1) {
                                        buttons[i][j].setBackground(Color.RED);
                                    }
                                    buttons[i][j].setEnabled(false);
                                }
                            }
                        }
                    }
                });
                this.add(buttons[i][j]);
            }
        }
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MineSweeper(10, 10, 10);
    }
}
