package com.company;

public class Main {
    public static int counter = 0;
    public static String input;
    public static String inputToCompareWith;

    public static int alcubierre_launcher(String eini) {
        input = eini;
        inputToCompareWith = eini;
        gamma_ray_chamber(eini, eini);
        return counter;
    }

    public static void gamma_ray_chamber(String meins, String deins) {
        if ((meins.length() > 0) && (deins.length() > 0)) {
            if (meins.charAt(0) == deins.charAt(0)) {
                counter++;
                gamma_ray_chamber(meins.substring(1, meins.length()), deins.substring(1, deins.length()));
            }
            if (inputToCompareWith.length() > 0) {
                inputToCompareWith = inputToCompareWith.substring(1, inputToCompareWith.length());
                gamma_ray_chamber(input, inputToCompareWith);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(alcubierre_launcher("ababaa"));
    }
}
