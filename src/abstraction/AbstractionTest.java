package abstraction;

public class AbstractionTest {

    public static void main(String[] args) {

        ThreeSeries threeSeries = new ThreeSeries();
        threeSeries.accelerator();
        threeSeries.commonFunction();

        FiveSeries fiveSeries = new FiveSeries();
        fiveSeries.accelerator();
        fiveSeries.commonFunction();
    }
}
