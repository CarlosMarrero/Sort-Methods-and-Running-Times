package sort;

import javax.swing.JFrame;

public class SortingDriver {

    public static void main(String[] args) {
        Sorting b = new Sorting();
        /**
         * ----------------------------------------------------------------------------------------------------------------------------------------------
         * ======================================================== INSERTION
         * SORT
         * ====================================================================
		 ------------------------------------------------------------------------------------------------------------------------------------------------
         */
        b.makeArray(1000);//MAKES AN ARRAY OF 1000 NUMBERS.
        for (int i = 0; i < 10; i++) {
            b.sameNumb();//MAKES ALL THE NUMBER IN THE ARRAY THE NUMBER 7.
            b.insertionSort(i);//USES THE INSERTION METHOD TO SORT THE ARRAY
        }
        b.averageAndDev();//FINDS THE AV AND STAND DEV. AND INCREASES THE VARIABLE
        //Y SO THAT THE NEXT SET OF DATA CAN BE PUT INTO THE NEXT SECTION IN THE OBJECT ARRAY.
        for (int i = 0; i < 10; i++) {
            b.randomNumb();
            b.insertionSort(i);
        }
        b.averageAndDev();
        b.makeArray(1000);
        for (int i = 0; i < 10; i++) {
            b.insertionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.decreasNumb();
            b.insertionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.lastRandomNumb();
            b.insertionSort(i);
        }
        b.averageAndDev();

        b.makeArray(10000);//MAKES AN ARRAY OF 10000 NUMBERS.
        for (int i = 0; i < 10; i++) {
            b.sameNumb();
            b.insertionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.randomNumb();
            b.insertionSort(i);
        }
        b.averageAndDev();
        b.makeArray(10000);
        for (int i = 0; i < 10; i++) {
            b.insertionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.decreasNumb();
            b.insertionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.lastRandomNumb();
            b.insertionSort(i);
        }
        b.averageAndDev();
        /**
         * ----------------------------------------------------------------------------------------------------------------------------------------------
         * ======================================================== BUBBLE SORT
         * =======================================================================
		 ------------------------------------------------------------------------------------------------------------------------------------------------
         */
        b.makeArray(1000);//MAKES AN ARRAY OF 1000 NUMBERS.
        for (int i = 0; i < 10; i++) {
            b.sameNumb();//MAKES ALL THE NUMBER IN THE ARRAY THE NUMBER 7.
            b.bubbleSort(i);//USES THE BUBBLE METHOD TO SORT THE ARRAY
        }
        b.averageAndDev();//FINDS THE AV AND STAND DEV. AND INCREASES THE VARIABLE
        //Y SO THAT THE NEXT SET OF DATA CAN BE PUT INTO THE NEXT SECTION IN THE OBJECT ARRAY.
        for (int i = 0; i < 10; i++) {
            b.randomNumb();
            b.bubbleSort(i);
        }
        b.averageAndDev();
        b.makeArray(1000);
        for (int i = 0; i < 10; i++) {
            b.bubbleSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.decreasNumb();
            b.bubbleSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.lastRandomNumb();
            b.bubbleSort(i);
        }
        b.averageAndDev();

        b.makeArray(10000);//MAKES AN ARRAY OF 10000 NUMBERS.
        for (int i = 0; i < 10; i++) {
            b.sameNumb();
            b.bubbleSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.randomNumb();
            b.bubbleSort(i);
        }
        b.averageAndDev();
        b.makeArray(10000);
        for (int i = 0; i < 10; i++) {
            b.bubbleSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.decreasNumb();
            b.bubbleSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.lastRandomNumb();
            b.bubbleSort(i);
        }
        b.averageAndDev();
        /**
         * ----------------------------------------------------------------------------------------------------------------------------------------------
         * ======================================================== SELECTION
         * SORT
         * =======================================================================
		 ------------------------------------------------------------------------------------------------------------------------------------------------
         */
        b.makeArray(1000);//MAKES AN ARRAY OF 1000 NUMBERS.
        for (int i = 0; i < 10; i++) {
            b.sameNumb();//MAKES ALL THE NUMBER IN THE ARRAY THE NUMBER 7.
            b.selectionSort(i);//USES THE SELECTION METHOD TO SORT THE ARRAY
        }
        b.averageAndDev();//FINDS THE AV AND STAND DEV. AND INCREASES THE VARIABLE
        //Y SO THAT THE NEXT SET OF DATA CAN BE PUT INTO THE NEXT SECTION IN THE OBJECT ARRAY.
        for (int i = 0; i < 10; i++) {
            b.randomNumb();
            b.selectionSort(i);
        }
        b.averageAndDev();
        b.makeArray(1000);
        for (int i = 0; i < 10; i++) {
            b.selectionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.decreasNumb();
            b.selectionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.lastRandomNumb();
            b.selectionSort(i);
        }
        b.averageAndDev();

        b.makeArray(10000);//MAKES AN ARRAY OF 10000 NUMBERS.
        for (int i = 0; i < 10; i++) {
            b.sameNumb();
            b.selectionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.randomNumb();
            b.selectionSort(i);
        }
        b.averageAndDev();
        b.makeArray(10000);
        for (int i = 0; i < 10; i++) {
            b.selectionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.decreasNumb();
            b.selectionSort(i);
        }
        b.averageAndDev();
        for (int i = 0; i < 10; i++) {
            b.lastRandomNumb();
            b.selectionSort(i);
        }
        b.averageAndDev();
        /**
         * ----------------------------------------------------------------------------------------------------------------------------------------------
         * ======================================================== CHART
         * =======================================================================
		 ------------------------------------------------------------------------------------------------------------------------------------------------
         */
        b.chart();// MAKES CHART
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ALLOWS TO CLOSE.
        b.setSize(1500, 720);// SETS SIZE OF WINDOW TO DISPLAY CHART.
        b.setVisible(true);
        b.setTitle("Test Results");//SETS TITLE
    }
}
