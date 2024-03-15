public interface MovingAverage{
  public static SimpleAverage makeSimple(int N) {
    return new SimpleAverage(N);
  }
  
  public static CumAverage makeCum() {
    return new CumAverage();
  }
  
  public int min();
  public int max();
  public void add(int n);
  public double avg();
}
