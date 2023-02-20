package com.atguigu.java3;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/20 14:42
 * @Description:
 */

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        // 初始化地图
        int[][] map = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                map[i][j] = 0;
            }
        }
        // 随机放置雷
        int count = 10;
        while (count > 0) {
            int x = (int) (Math.random() * 9);
            int y = (int) (Math.random() * 9);
            if (map[x][y] != 9) {
                map[x][y] = 9;
                count--;
            }
        }
        // 计算每个格子周围雷的数量
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (map[i][j] == 9) {
                    continue;
                }
                int num = 0;
                if (i > 0 && j > 0 && map[i - 1][j - 1] == 9) {
                    num++;
                }
                if (i > 0 && map[i - 1][j] == 9) {
                    num++;
                }
                if (i > 0 && j < 8 && map[i - 1][j + 1] == 9) {
                    num++;
                }
                if (j > 0 && map[i][j - 1] == 9) {
                    num++;
                }
                if (j < 8 && map[i][j + 1] == 9) {
                    num++;
                }
                if (i < 8 && j > 0 && map[i + 1][j - 1] == 9) {
                    num++;
                }
                if (i < 8 && map[i + 1][j] == 9) {
                    num++;
                }
                if (i < 8 && j < 8 && map[i + 1][j + 1] == 9) {
                    num++;
                }
                map[i][j] = num;
            }
        }
        // 打印地图
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        // 开始游戏
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要排查的位置：");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (map[x][y] == 9) {
                System.out.println("你踩到雷了，游戏结束！");
                break;
            } else {
                System.out.println("你没有踩到雷，继续加油！");
            }
        }
    }
}

