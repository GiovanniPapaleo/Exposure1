package LabCSP;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Lab03, 80 Point Version\n");

        int seconds = 10000;
        int hours = seconds / 3600;
        int remainder = seconds % 3600;
        int minutes = remainder / 60;
        int remaining_seconds = remainder % 60;


        System.out.println("Starting seconds: \t" + seconds);
        System.out.println("Hours: \t\t\t\t" + hours);
        System.out.println("Minutes: \t\t\t" + minutes);
        System.out.println("Seconds: \t\t\t" + remaining_seconds);
        System.out.println("10000 seconds equals: ");
        System.out.println(hours + " hours, " + minutes + " minutes, " + remaining_seconds + " seconds");
    }
}
