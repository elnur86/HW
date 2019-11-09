package hw.step.entity;

public class TimetableLine {
  private  String flightNumber;
  private  City src;
  private  int time;
  private  City dst;

  public TimetableLine(String flightNumber, City src, int time, City dst) {
    this.flightNumber=flightNumber;
    this.src = src;
    this.dst = dst;
    this.time = time;
  }

 public TimetableLine()
 {}

  public City getSrc() {
    return src;
  }

  public City getDst() {
    return dst;
  }

  public int getTime() {
    return time;
  }

  public String getFlightNumber(){return flightNumber;}

  @Override
  public String toString() {
    return String.format("%-20s%-20s%-20d%s",flightNumber,src,time,dst);
//    "TimetableLine{" +"src=" + src +", time=" + time +", dst=" + dst +'}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof TimetableLine)) return false;

    TimetableLine that = (TimetableLine) o;

    if (time != that.time) return false;
    if (src != null ? !src.equals(that.src) : that.src != null) return false;
    return dst != null ? dst.equals(that.dst) : that.dst == null;
  }

  @Override
  public int hashCode() {
    int result = src != null ? src.hashCode() : 0;
    result = 31 * result + (dst != null ? dst.hashCode() : 0);
    result = 31 * result + time;
    return result;
  }
}
