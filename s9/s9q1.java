class Clock {
    int hours, minutes, seconds;
    boolean isAM;
    Clock(int h, int m, int s, boolean am) {
        if (valid(h, m, s)) {
            hours = h;
            minutes = m;
            seconds = s;
            isAM = am;
        } else {
            System.out.println("Invalid time");
        }
    }
    // Check if the time is valid
    boolean valid(int h, int m, int s) {
        return (h >= 1 && h <= 12) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    // Set new time
    void setTime(int h, int m, int s, boolean am) {
        if (valid(h, m, s)) {
            hours = h;
            minutes = m;
            seconds = s;
            isAM = am;
        } else {
            System.out.println("Invalid time");
        }
    }

    // Display time
    void show() {
        System.out.printf("%02d:%02d:%02d %s%n", hours, minutes, seconds, isAM ? "AM" : "PM");
    }

    // Main method to test
    public static void main(String[] args) {
        Clock c = new Clock(10, 30, 45, true);
        c.show();  // Output: 10:30:45 AM
        c.setTime(2, 15, 30, false);
        c.show();  // Output: 02:15:30 PM
    }
}
