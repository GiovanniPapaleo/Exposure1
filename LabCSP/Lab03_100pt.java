package LabCSP;

public class Lab03_100pt {
    public static void main(String[] args) {
        System.out.println("Lab03, 100 Point Version\n");

        int milliseconds = 10000123;
        int seconds = milliseconds / 1000;
        int hours = seconds / 3600;
        int remainder = seconds % 3600;
        int minutes = remainder / 60;
        int remaining_seconds = remainder % 60;
        int remaining_milliseconds = milliseconds % 1000


        System.out.println("Starting seconds: \t" + seconds);
        System.out.println("Hours: \t\t\t\t" + hours);
        System.out.println("Minutes: \t\t\t" + minutes);
        System.out.println("Seconds: \t\t\t" + remaining_seconds);
        System.out.println("10000123 milliseconds equals: ");
        System.out.println(hours + " hours, " + minutes + " minutes, " + remaining_seconds + " seconds." + remaining_milliseconds + " milliseconds.");
    }
}
