public class GravityCalculator {
    private final static  double a=-9.81;
    private final static double v=0;
    private final static double x=0;

    public static void calcDist(double t){
        double res = 0.5*a*Math.pow(t,2)+v*t+x;
        System.out.println(res*(-1)+" meters"); }}
