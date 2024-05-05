import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Busresv {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses=new ArrayList<>();
        ArrayList<Booking> bookings=new ArrayList<>();
        buses.add(new Bus(1,true,40));
        buses.add(new Bus(2,false,30));
        buses.add(new Bus(3,true,50));





        Scanner sc=new Scanner(System.in);
        int useropt=1;
        for(Bus b:buses){
            b.displaybusinfo();
        }
        while(useropt==1){
            System.out.println("enter 1 for booking and 2 for exit");
             useropt=sc.nextInt();
             if(useropt==1){
                 Booking booking=new Booking();
                 if(booking.isAvailable(bookings,buses)){
                     System.out.println("booking confirmed");
                     bookings.add(booking);
                 }
                 else{
                     System.out.println("sry u may try another bus");
                 }

             }
             else{
                 System.out.println("exit");
             }

        }
    }

}
