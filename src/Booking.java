public class Booking extends Customer {

    private int venID;

    private String date;

    void setBooking( int vid,String dt)
    {

        venID=vid;

        date=dt;
    }

    int getVenueID()
    {
        return venID;
    }

    String getBookingdate()
    {
        return date;
    }

}