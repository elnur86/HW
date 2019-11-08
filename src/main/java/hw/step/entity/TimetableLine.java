package hw.step.entity;

public class TimetableLine {
  private final City src;
  private final int time;
  private final City dst;

  public TimetableLine(City src, int time, City dst) {
    this.src = src;
    this.dst = dst;
    this.time = time;
  }

  public City getSrc() {
    return src;
  }

  public City getDst() {
    return dst;
  }

  public int getTime() {
    return time;
  }

  @Override
  public String toString() {
    return "TimetableLine{" +
        "src=" + src +
        ", time=" + time +
        ", dst=" + dst +
        '}';
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
