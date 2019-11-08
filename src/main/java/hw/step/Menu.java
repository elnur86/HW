package hw.step;

public class Menu {

  public String show() {
    StringBuilder sb = new StringBuilder();
    sb.append("========================\n");
    sb.append("|    Booking App       |\n");
    sb.append("========================\n");
    sb.append("| 1. Show timetable    |\n");
    sb.append("| 2. Make a booking    |\n");
    sb.append("| 3. Show my bookings  |\n");
    sb.append("| 4. Cancel my booking |\n");
    sb.append("| 5. Exit              |\n");
    sb.append("========================\n");
    return sb.toString();
  }
}
