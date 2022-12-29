public class Calculation implements Runnable{
    private static Object lock;
    double radius;
    double side;
    double area;
    double phil = 3.14;

    public Calculation (double radius, double side, double area, double phil){
        this.radius = radius;
        this.side = side;
        this.area = area;
        this.phil = phil;

    }

    public Calculation() {
	}

	@Override
    public void run() {
        while (true){
            getSquare();
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            }
        }
        // TODO Auto-generated method stub

    private void getSquare() {
        synchronized(Calculation.lock){
            if (this.)
        }
    }
        
    }
