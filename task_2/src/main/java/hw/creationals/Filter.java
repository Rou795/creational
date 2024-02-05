package hw.creationals;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer el : source) {
            if (el < treshold) {
                result.add(el);
                logger.log("Элемент '" + el + "' проходит");
            } else {
                logger.log("Элемент '" + el + "' не проходит");
            }
        }
        return result;
    }
}
