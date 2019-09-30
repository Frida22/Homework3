
package Homework3_2;

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Printer anna = new Printer();
        anna.print(25, true, true);
        anna.print(825, true, true);
        anna.getTonerLevel();
        anna.print(5698, false, true);
        anna.getTonerLevel();
        anna.totalPrinted();

    }

    private int numberOfPages = 0;
    private boolean isColor;
    private boolean isDuplex;
    static int pagesPrinted = 0;
    private double levelTonerBlack = 100;
    private double levelTonerYellow = 100;
    private double levelTonerMagenta = 100;
    private double levelTonerCyan = 100;
    private int totalPagesPrinted =0;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isColor() {
        return isColor;
    }


    public boolean isDuplex() {
        return isDuplex;
    }

    public double getLevelTonerBlack() {
        return levelTonerBlack;
    }

    public double getLevelTonerYellow() {
        return levelTonerYellow;
    }

    public double getLevelTonerMagenta() {
        return levelTonerMagenta;
    }

    public double getLevelTonerCyan() {
        return levelTonerCyan;
    }

    public int getTotalPagesPrintet() {
        return totalPagesPrinted;
    }

    public void setTotalPagesPrintet(int totalPagesPrintet) {
        this.totalPagesPrinted = totalPagesPrintet;
    }

    public void setLevelTonerYellow(double levelTonerYellow) {
        this.levelTonerYellow = levelTonerYellow;
    }

    public void setLevelTonerMagenta(double levelTonerMagenta) {
        this.levelTonerMagenta = levelTonerMagenta;
    }

    public void setLevelTonerCyan(double levelTonerCyan) {
        this.levelTonerCyan = levelTonerCyan;
    }

    public void setLevelTonerBlack(double levelTonerBlack) {
        this.levelTonerBlack = levelTonerBlack;
    }

    public void print(int numberOfPages, boolean isColor, boolean isDuplex) {
        if (isColor == false) {

            pagesPrinted += numberOfPages;
            setLevelTonerBlack(getLevelTonerBlack() - (double) numberOfPages / 100);
        } else {
            pagesPrinted += numberOfPages;
            setLevelTonerBlack(getLevelTonerBlack() - (double) numberOfPages / 400);
            setLevelTonerYellow(getLevelTonerYellow() - (double) numberOfPages / 400);
            setLevelTonerMagenta(getLevelTonerMagenta() - (double) numberOfPages / 400);
            setLevelTonerCyan(getLevelTonerCyan() - (double) numberOfPages / 400);

        }

        System.out.println("You printed out " + numberOfPages + " pages");

    }

    public void refillingThePrinter() {
        setLevelTonerBlack(100);
        setLevelTonerYellow(100);
        setLevelTonerMagenta(100);
        setLevelTonerCyan(100);
        System.out.println("Printer refilled");

    }

    public void getTonerLevel() {
        System.out.println(getLevelTonerBlack());
        System.out.println(getLevelTonerYellow());
        System.out.println(getLevelTonerMagenta());
        System.out.println(getLevelTonerCyan());
    }
    public void totalPrinted(){
        setTotalPagesPrintet(getNumberOfPages());
        System.out.println("Total "+ getTotalPagesPrintet());

    }


}








