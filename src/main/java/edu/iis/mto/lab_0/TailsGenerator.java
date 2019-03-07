package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (isValid(value)) {
            return generateTails(value);
        } else {
            return new ArrayList<>();
        }
    }

    private boolean isValid(String value) {
        return value != null;
    }

    private List<String> generateTails(String value) {
        List<String> tailsList = new ArrayList<>();

        for (int i = 0; i < value.length(); i++) {
            String tail = value.substring(i);
            tailsList.add(tail);
        }

        tailsList.add("");

        return tailsList;
    }

}
