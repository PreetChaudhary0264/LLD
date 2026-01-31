package structuralPatterns.Facade;

public class MovieBookFacade {
    private SeatService seat;
    private NotificationService noti;
    private PaymentService payment;

    public MovieBookFacade(){
        this.seat = new SeatService();
        this.noti = new NotificationService();
        this.payment = new PaymentService();
    }

    public void bookMovie(int amount,int seatNo){         //if we wanmt to expand this to concert booking or anything other then we can also use a builder pattern
        seat.reserveSeat(seatNo);
        noti.useEmail();
        payment.paymentMethod(amount);
    }
}
