package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {
    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " "
                + middleName + " " + lastName + ", " + suffix;
    }

    public static String format(String fullName){

        String[] parsedFullName = fullName.split("\\s+");

        switch (parsedFullName.length) {
            case 5:
                return parsedFullName[3] + " " + parsedFullName[0] + " " + parsedFullName[1] +
                        " " + parsedFullName[2] + ", " + parsedFullName[4];
            case 4:
                return parsedFullName[2] + " " + parsedFullName[0] + " " +
                        parsedFullName[1] + ", " + parsedFullName[3];
            case 2:
                return parsedFullName[1] + ", " + parsedFullName[0];
            default:
                return fullName;
        }
    }
}

