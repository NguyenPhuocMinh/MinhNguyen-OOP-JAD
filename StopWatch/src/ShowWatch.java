public class ShowWatch {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        // Selection Sort
        SelectionSortExample selectionSortExample = new SelectionSortExample();
        selectionSortExample.sortExample();
        // End Selection Sort
        stopWatch.stop();
        System.out.println();
        System.out.println("Time for executing: " + stopWatch.getElapsedTime());
    }

}
