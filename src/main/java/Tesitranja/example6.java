package Tesitranja;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;




public class example6 {
    static void main() {
        List<Double> list =  Arrays.asList(10.0, 20.0, 30.0, 40.0);
        DoubleSummaryStatistics stats = list.stream().mapToDouble(n->n)
                        .summaryStatistics();


    }
}
