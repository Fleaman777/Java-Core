public class MainRectangle {

    public static void main(String[] args) {

        FindRectangle fROne = new FindRectangle();
        FindRectangle fRTwo = new FindRectangle();
        FindRectangle fRThree = new FindRectangle();

        fROne.enterPoint();
        fRTwo.enterPoint();

        fROne.minMax();
        fRTwo.minMax();

        fROne.computeArea();
        fRTwo.computeArea();


        fRThree.findeAreaRectThree(fROne, fRTwo);


    }
}
