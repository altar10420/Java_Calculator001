package org.plaltar;

public class Validator {

    int inputCheck = 0;

    int exitCheck = 0;


    // to miało sprawdzać inputy, ale okazało się, że da się prościej w Main
    public void validate(String a) {

        try {
            double numberCheck = Double.parseDouble(a);
        } catch (NumberFormatException nfe) {
            System.out.println("Błędnie wybrana opcja!");
            inputCheck = 0;
        }

    }
}
