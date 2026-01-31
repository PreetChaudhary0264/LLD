package structuralPatterns.Facade;

class PaymentService{
    public void paymentMethod(int amount){
        System.out.println("Paying is being done");
    }
}
class SeatService{
    public void reserveSeat(int seatNo){
        System.out.println("Seat reserved");
    }
}
class NotificationService{
    public void useEmail(){
        System.out.println("Notification will be sent via email");
    }
}


public class MovieBookingSystem {
    public static void main(String[] args) {
        //Client should not be handling all these service manually

//        SeatService seat = new SeatService();
//        seat.reserveSeat();
//
//        NotificationService noti = new NotificationService();
//        noti.useEmail();
//
//        PaymentService payment = new PaymentService();
//        payment.paymentMethod();


        MovieBookFacade obj = new MovieBookFacade();
        obj.bookMovie(200,12);

        //if we wanmt to expand this to concert booking or anything other then we can also use a builder pattern
    }
}
