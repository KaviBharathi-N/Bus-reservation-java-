import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import static javax.print.attribute.Size2DSyntax.MM;

public class Booking {
    String passengername;
    Date date;
    int busno;
    Booking() throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        passengername=sc.next();
        System.out.println("enter busno");
        busno=sc.nextInt();
        System.out.println("enrter date dd-mm-yyyy");
        String dateinput=sc.next();
        SimpleDateFormat dateformat=new SimpleDateFormat("DD-MM-YYYY");
        date=dateformat.parse(dateinput);
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getbusno() == busno)
                capacity = bus.getcapacity();

        }
        int booked=0;
        for(Booking b:bookings){
            if(b.busno==busno&&b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;



    }


}
