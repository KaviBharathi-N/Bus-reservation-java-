public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;
    Bus(int busno,boolean ac,int capacity){
        this.busno=busno;
        this.ac=ac;
        this.capacity=capacity;

    }
    public int getcapacity(){
        return capacity;
    }
    public int getbusno(){
        return busno;
    }
    public void setcapacity(int cap){
        capacity=cap;
    }
    public void setac(boolean val){
        ac=val;
    }
    public void displaybusinfo(){
        System.out.println("BUSNO:" +busno+ "BUS CAPACITY" +capacity+ "AC/NONAC" +ac);
    }


}
