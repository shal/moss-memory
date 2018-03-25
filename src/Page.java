import java.util.Date;

public class Page {
  public int id;
  public int physical;
  public byte R;
  public byte M;
  public int inMemTime;
  public int lastTouchTime;
  public long high;
  public long low;
  public int usedAtStep;

  public Page(int id, int physical, byte R, byte M, int inMemTime, int lastTouchTime, long high, long low) {
    this.id = id;
    this.physical = physical;
    this.R = R;
    this.M = M;
    this.inMemTime = inMemTime;
    this.lastTouchTime = lastTouchTime;
    this.high = high;
    this.low = low;
    this.usedAtStep = 0;
  }

  public void clear() {
    this.inMemTime = 0;
    this.lastTouchTime = 0;
    this.R = 0;
    this.M = 0;
    this.physical = -1;
  }
}
