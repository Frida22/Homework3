
package Homework3_2.task6;

public class Printer {

    private int totalCountUfPrintedPages = 0;
    private double levelTonerBlack = 100;
    private double levelTonerYellow = 100;
    private double levelTonerMagenta = 100;
    private double levelTonerCyan = 100;


    public void print(int countOfPages, boolean isColor, boolean isDuplex) {
        if (isDuplex) {
            System.out.println("Duplex is missing in this model");
        } else {
            totalCountUfPrintedPages += countOfPages;
            if (isColor) {
                levelTonerBlack = -tonerAfterColorPrinted(countOfPages);
                levelTonerYellow = -tonerAfterColorPrinted(countOfPages);
                levelTonerMagenta = -tonerAfterColorPrinted(countOfPages);
                levelTonerCyan = -tonerAfterColorPrinted(countOfPages);
            } else {
                levelTonerBlack = -(double) countOfPages / 400;
            }
            System.out.println("You printed out " + countOfPages + " pages");
        }
    }
    private double tonerAfterColorPrinted(double countOfPages) {
        return -countOfPages / 400;
    }
    public void refillingThePrinter() {

        levelTonerBlack = 100;
        levelTonerYellow = 100;
        levelTonerMagenta = 100;
        levelTonerCyan = 100;
        System.out.println("Printer refilled");
    }
    public void getTonerLevel() {
        System.out.println(levelTonerBlack);
        System.out.println(levelTonerYellow);
        System.out.println(levelTonerMagenta);
        System.out.println(levelTonerCyan);
    }
    public void totalCountOfPagesPrinted() {
        System.out.println("Total " + totalCountUfPrintedPages);
    }
}








