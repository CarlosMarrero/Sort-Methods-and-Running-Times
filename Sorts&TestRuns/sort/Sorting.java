package sort;

import java.awt.*;

import javax.swing.*;

public class Sorting extends JFrame {

    JTable chart;
    private int y = 0;//ALLOWS FOR DATA TO BE PASS THROUGH OBJECT ARRAYS.
    private long[] time = new long[10];//HOLDS TIMELENGTH SO IT CAN BE CALCULATED IN AVEANDDEV METHOD.
    private Object[][] timeLen = new Object[30][10];//HOLDS TIMELENGTH OF EACH TEST
    private int[] a;//STARTING ARRAY.
    private Object[][] AvAndDev = new Object[30][2];// HOLDS AVERAGE AND STAND DEVIATION OF EACH TEST CASE.

    /**
     * Precondition: Makes an array of increasing given number. Postcondition:
     * Sets each numbers according to the arrays index.
     */
    public void makeArray(int b) {
        a = new int[b];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    /**
     * PrePostcondition: Populates array with decreasing numbers.
     */
    public void decreasNumb() {
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - i;
        }
    }

    /**
     * PrePostcondition: Populates the array with identical numbers(7).
     */
    public void sameNumb() {
        for (int i = 0; i < a.length; i++) {
            a[i] = 7;
        }
    }

    /**
     * PrePostcondition: Populates the array with random numbers.
     */
    public void randomNumb() {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.rint(Math.random() * 100);
        }
    }

    /**
     * PrePostcondition: Populates the last hundred numbers with random numbers.
     */
    public void lastRandomNumb() {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = a.length - 100; i < a.length; i++) {
            a[i] = (int) Math.rint(Math.random() * 100);
        }
    }

    /**
     * Precondition: Searches the array using the bubble sort algorithm.
     * Postcondition: Calculates the time it took for the algorithm to complete
     * and puts the data in the appropriate array.
     */
    public void bubbleSort(int m) {
        int change;
        int last = a.length - 1;
        int temp;
        long start = System.nanoTime();
        do {
            change = 0;
            for (int i = 0; i < last; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    change = i;
                }
            }
            last = change;
        } while (last > 0);
        long stop = System.nanoTime();
        long timelength = (stop - start);//time in nanoseconds.
        time[m] = timelength;//USED LATER ON FOR AVERAGE AND STAND DEV.
        timeLen[y][m] = ("" + timelength);// USED TO DISPLAY IN CHART 
    }

    /**
     * Precondition: Searches the array using the selection sort algorithm.
     * Postcondition: Calculates the time it took for the algorithm to complete
     * and puts the data in the appropriate array.
     */
    public void selectionSort(int m) {
        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            int Min = a[i];
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < Min) {
                    Min = a[j];
                    index = j;
                }
            }
            a[index] = a[i];
            a[i] = Min;
        }
        long stop = System.nanoTime();
        long timelength = (stop - start);//time in nanoseconds.
        time[m] = timelength;//USED LATER ON FOR AVERAGE AND STAND DEV.
        timeLen[y][m] = ("" + timelength);// USED TO DISPLAY IN CHART. 
    }

    /**
     * Precondition: Searches the array using the insertion sort algorithm.
     * Postcondition: Calculates the time it took for the algorithm to complete
     * and puts the data in the appropriate array.
     */
    public void insertionSort(int m) {
        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            int y = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > y) {
                a[j] = a[j - 1];
                j = j - 1;
                a[j] = y;
            }
        }
        long stop = System.nanoTime();
        long timelength = ((stop - start));//time in nanoseconds.
        time[m] = timelength;//USED LATER ON FOR AVERAGE AND STAND DEV.
        timeLen[y][m] = ("" + timelength);// USED TO DISPLAY IN CHART 
    }

    /**
     * Precondition: Calculates Average and Standard Deviation. Postcondition:
     * Puts the data in the avAndDev array for later use.
     */
    public void averageAndDev() {
        long sum = 0;
        long temp = 0;
        long stanDev = 0;
        for (int i = 0; i < 10; i++) {
            sum += time[i];
        }
        long average = sum / 10;//final average
        for (int j = 0; j < 10; j++) {
            temp += Math.pow((time[j] - average), 2.0);
        }
        temp /= 10;
        stanDev = (long) Math.sqrt(temp);//final stand deviation.
        AvAndDev[y][0] = ("" + average);
        AvAndDev[y][1] = ("" + stanDev);
        System.out.println("Standard Deviation: " + stanDev + " Average: " + average);
        y += 1;//increase the variable so the next section of the object array is accessible.
    }

    /**
     * Precondition: Makes a chart with the information provide with the arrays
     * made earlier. Postcondition: has to be called last for information to be
     * inputed correctly.
     */
    public void chart() {
        setLayout(new FlowLayout());//INSERTION SORT TEST CASE INFORMATION.
        String[] testNumbers = {"INSERTION SORT", "RUN 1", "RUN 2", "RUN 3", "RUN 4", "RUN 5", "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10", "AVERAGE", "STANDARD DEV."};
        Object[][] testResult = {{"1,000 IDENTICAL", timeLen[0][0], timeLen[0][1], timeLen[0][2], timeLen[0][3], timeLen[0][4], timeLen[0][5],
            timeLen[0][6], timeLen[0][7], timeLen[0][8], timeLen[0][9], AvAndDev[0][0], AvAndDev[0][1]},
        {"1,000 RANDOM", timeLen[1][0], timeLen[1][1], timeLen[1][2], timeLen[1][3], timeLen[1][4], timeLen[1][5], timeLen[1][6],
             timeLen[1][7], timeLen[1][8], timeLen[1][9], AvAndDev[1][0], AvAndDev[1][1]}, {"1,000 INCREASING", timeLen[2][0],
            timeLen[2][1], timeLen[2][2], timeLen[2][3], timeLen[2][4], timeLen[2][5], timeLen[2][6], timeLen[2][7], timeLen[2][8], timeLen[2][9], AvAndDev[2][0],
            AvAndDev[2][1]}, {"1,000 DECREASING", timeLen[3][0], timeLen[3][1], timeLen[3][2], timeLen[3][3], timeLen[3][4], timeLen[3][5], timeLen[3][6],
            timeLen[3][7], timeLen[3][8], timeLen[3][9], AvAndDev[3][0], AvAndDev[3][1]}, {"900 INCREASING,LAST 100 RANDOM NUMBERS", timeLen[4][0], timeLen[4][1], timeLen[4][2],
            timeLen[4][3], timeLen[4][4], timeLen[4][5], timeLen[4][6], timeLen[4][7], timeLen[4][8], timeLen[4][9], AvAndDev[4][0], AvAndDev[4][1]}, {"10,000 IDENTICAL",
            timeLen[5][0], timeLen[5][1], timeLen[5][2], timeLen[5][3], timeLen[5][4], timeLen[5][5], timeLen[5][6], timeLen[5][7], timeLen[5][8], timeLen[5][9], AvAndDev[5][0],
            AvAndDev[5][1]}, {"10,000 RANDOM", timeLen[6][0], timeLen[6][1], timeLen[6][2], timeLen[6][3], timeLen[6][4], timeLen[6][5], timeLen[6][6], timeLen[6][7], timeLen[6][8],
            timeLen[6][9], AvAndDev[6][0], AvAndDev[6][1]}, {"10,00 INCREASING", timeLen[7][0], timeLen[7][1], timeLen[7][2], timeLen[7][3], timeLen[7][4], timeLen[7][5], timeLen[7][6],
            timeLen[7][7], timeLen[7][8], timeLen[7][9], AvAndDev[7][0], AvAndDev[7][1]}, {"10,000 DECREASING", timeLen[8][0], timeLen[8][1], timeLen[8][2], timeLen[8][3], timeLen[8][4],
            timeLen[8][5], timeLen[8][6], timeLen[8][7], timeLen[8][8], timeLen[8][9], AvAndDev[8][0], AvAndDev[8][1]}, {"9,900 INCREASING,LAST 100 RANDOM NUMBERS", timeLen[9][0],
            timeLen[9][1], timeLen[9][2], timeLen[9][3], timeLen[9][4], timeLen[9][5], timeLen[9][6], timeLen[9][7], timeLen[9][8], timeLen[9][9], AvAndDev[9][0], AvAndDev[9][1]},
        //END OF INSERTION TEST CASE DATA.

        //BUBBLE SORT TEST CASE INFORMATION.
        {"", "", "", "", "", "", "", "", "", "", "", "", ""},
        {"BUBBLE SORT", "RUN 1", "RUN 2", "RUN 3", "RUN 4", "RUN 5", "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10", "AVERAGE", "STANDARD DEV."}, {"1,000 IDENTICAL", timeLen[10][0],
            timeLen[10][1], timeLen[10][2], timeLen[10][3], timeLen[10][4], timeLen[10][5], timeLen[10][6], timeLen[10][7], timeLen[10][8], timeLen[10][9], AvAndDev[10][0], AvAndDev[10][1]},
        {"1,000 RANDOM", timeLen[11][0], timeLen[11][1], timeLen[11][2], timeLen[11][3], timeLen[11][4], timeLen[11][5], timeLen[11][6], timeLen[11][7], timeLen[11][8], timeLen[11][9],
            AvAndDev[11][0], AvAndDev[11][1]}, {"1,000 INCREASING", timeLen[12][0], timeLen[12][1], timeLen[12][2], timeLen[12][3], timeLen[12][4], timeLen[12][5], timeLen[12][6], timeLen[12][7],
            timeLen[12][8], timeLen[12][9], AvAndDev[12][0], AvAndDev[12][1]}, {"1,000 DECREASING", timeLen[13][0], timeLen[13][1], timeLen[13][2], timeLen[13][3], timeLen[13][4], timeLen[13][5],
            timeLen[13][6], timeLen[13][7], timeLen[13][8], timeLen[13][9], AvAndDev[13][0], AvAndDev[13][1]}, {"900 INCREASING,LAST 100 RANDOM NUMBERS", timeLen[14][0], timeLen[14][1],
            timeLen[14][2], timeLen[14][3], timeLen[14][4], timeLen[14][5], timeLen[14][6], timeLen[14][7], timeLen[14][8], timeLen[14][9], AvAndDev[14][0], AvAndDev[14][1]}, {"10,000 IDENTICAL",
            timeLen[15][0], timeLen[15][1], timeLen[15][2], timeLen[15][3], timeLen[15][4], timeLen[15][5], timeLen[15][6], timeLen[15][7], timeLen[15][8], timeLen[15][9], AvAndDev[15][0],
            AvAndDev[15][1]}, {"10,000 RANDOM", timeLen[16][0], timeLen[16][1], timeLen[16][2], timeLen[16][3], timeLen[16][4], timeLen[16][5], timeLen[16][6], timeLen[16][7], timeLen[16][8],
            timeLen[16][9], AvAndDev[16][0], AvAndDev[16][1]}, {"10,00 INCREASING", timeLen[17][0], timeLen[17][1], timeLen[17][2], timeLen[17][3], timeLen[17][4], timeLen[17][5], timeLen[17][6],
            timeLen[17][7], timeLen[17][8], timeLen[17][9], AvAndDev[17][0], AvAndDev[17][1]}, {"10,000 DECREASING", timeLen[18][0], timeLen[18][1], timeLen[18][2], timeLen[18][3], timeLen[18][4],
            timeLen[18][5], timeLen[18][6], timeLen[18][7], timeLen[18][8], timeLen[18][9], AvAndDev[18][0], AvAndDev[18][1]}, {"9,900 INCREASING,LAST 100 RANDOM NUMBERS", timeLen[19][0],
            timeLen[19][1], timeLen[19][2], timeLen[19][3], timeLen[19][4], timeLen[19][5], timeLen[19][6], timeLen[19][7], timeLen[19][8], timeLen[19][9], AvAndDev[19][0], AvAndDev[19][1]},
        //END OF BUBBLE TEST CASE DATA.

        //SELECTION SORT TEST CASE INFORMATION.
        {"", "", "", "", "", "", "", "", "", "", "", "", ""},
        {"SELECTION SORT", "RUN 1", "RUN 2", "RUN 3", "RUN 4", "RUN 5", "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10", "AVERAGE", "STANDARD DEV."}, {"1,000 IDENTICAL", timeLen[20][0],
            timeLen[20][1], timeLen[20][2], timeLen[20][3], timeLen[20][4], timeLen[20][5], timeLen[20][6], timeLen[20][7], timeLen[20][8], timeLen[20][9], AvAndDev[20][0], AvAndDev[20][1]},
        {"1,000 RANDOM", timeLen[21][0], timeLen[21][1], timeLen[21][2], timeLen[21][3], timeLen[21][4], timeLen[21][5], timeLen[21][6], timeLen[21][7], timeLen[21][8], timeLen[21][9],
            AvAndDev[21][0], AvAndDev[21][1]}, {"1,000 INCREASING", timeLen[22][0], timeLen[22][1], timeLen[22][2], timeLen[22][3], timeLen[22][4], timeLen[22][5], timeLen[22][6], timeLen[22][7],
            timeLen[22][8], timeLen[22][9], AvAndDev[22][0], AvAndDev[22][1]}, {"1,000 DECREASING", timeLen[23][0], timeLen[23][1], timeLen[23][2], timeLen[23][3], timeLen[23][4], timeLen[23][5],
            timeLen[23][6], timeLen[23][7], timeLen[23][8], timeLen[23][9], AvAndDev[23][0], AvAndDev[23][1]}, {"900 INCREASING,LAST 100 RANDOM NUMBERS", timeLen[24][0], timeLen[24][1],
            timeLen[24][2], timeLen[24][3], timeLen[24][4], timeLen[24][5], timeLen[24][6], timeLen[24][7], timeLen[24][8], timeLen[24][9], AvAndDev[24][0], AvAndDev[24][1]}, {"10,000 IDENTICAL",
            timeLen[25][0], timeLen[25][1], timeLen[25][2], timeLen[25][3], timeLen[25][4], timeLen[25][5], timeLen[25][6], timeLen[25][7], timeLen[25][8], timeLen[25][9], AvAndDev[25][0],
            AvAndDev[25][1]}, {"10,000 RANDOM", timeLen[26][0], timeLen[26][1], timeLen[26][2], timeLen[26][3], timeLen[26][4], timeLen[26][5], timeLen[26][6], timeLen[26][7], timeLen[26][8],
            timeLen[26][9], AvAndDev[26][0], AvAndDev[26][1]}, {"10,00 INCREASING", timeLen[27][0], timeLen[27][1], timeLen[27][2], timeLen[27][3], timeLen[27][4], timeLen[27][5], timeLen[27][6],
            timeLen[27][7], timeLen[27][8], timeLen[27][9], AvAndDev[27][0], AvAndDev[27][1]}, {"10,000 DECREASING", timeLen[28][0], timeLen[28][1], timeLen[28][2], timeLen[28][3], timeLen[28][4],
            timeLen[28][5], timeLen[28][6], timeLen[28][7], timeLen[28][8], timeLen[28][9], AvAndDev[28][0], AvAndDev[28][1]}, {"9,900 INCREASING,LAST 100 RANDOM NUMBERS", timeLen[29][0],
            timeLen[29][1], timeLen[29][2], timeLen[29][3], timeLen[29][4], timeLen[29][5], timeLen[29][6], timeLen[29][7], timeLen[29][8], timeLen[29][9], AvAndDev[29][0], AvAndDev[29][1]}};
        //END OF SELECTION TEST CASE DATA.

        chart = new JTable(testResult, testNumbers);
        chart.setPreferredScrollableViewportSize(new Dimension(1250, 750)); // SETS SIZE OF CHART.
        JScrollPane scrollPane = new JScrollPane(chart);
        chart.setFillsViewportHeight(true);
        add(scrollPane);
    }

}
