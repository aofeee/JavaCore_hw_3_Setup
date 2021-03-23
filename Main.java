package com.netology.homework.setupgames;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Main {
   static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        System.out.println("Начало установки");
        try {
            Thread.sleep(400);
        File src = new File("D:\\Games\\src");
        dirToCheck(src);
        System.out.println("Распаковка фалов");
        Thread.sleep(400);
        File main = new File(src, "main");
        dirToCheck(main);
        File fileMain = new File(main, "Main.java");
        fileToCheck(fileMain);
        File fileUtils = new File(main, "Utils.java");
        fileToCheck(fileUtils);
        File test = new File(src, "test");
        dirToCheck(test);
        File res = new File("D:\\Games\\res");
        dirToCheck(res);
        File drawables = new File(res, "drawables");
        dirToCheck(drawables);
        File vectors = new File(res, "vectors");
        dirToCheck(vectors);
        File icons = new File(res, "icons");
        dirToCheck(icons);
        System.out.println("Завершение установки");
        Thread.sleep(400);
        File savegames = new File("D:\\Games\\savegames");
        dirToCheck(savegames);
        File temp = new File("D:\\Games\\temp");
        dirToCheck(temp);
        File fileTemp = new File(temp, "temp.txt");
        fileToCheck(fileTemp);
        System.out.println("Готово.");

        try {
            FileWriter fw = new FileWriter(fileTemp);
            fw.write(String.valueOf(sb));
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR" + e);
            e.printStackTrace();
        }
        } catch (InterruptedException e) {
            System.out.println("ERROR: " + e);
            e.printStackTrace();
        }

    }
    private static String fileToCheck(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                sb.append("\nERROR: ").append(e);
            }
            sb.append("\nФайл ").append(file).append(" успешно создан");
        } else {
            sb.append("\nФайл ").append(file).append(" уже существует");
        } return sb.toString();
    }
    private static String dirToCheck(File file) {
        if (!file.exists()) {
            file.mkdir();
            sb.append("\nКаталог ").append(file).append(" успешно создан");
        } else {
            sb.append("\nКаталог ").append(file).append(" уже существует");
        } return sb.toString();
    }
}

