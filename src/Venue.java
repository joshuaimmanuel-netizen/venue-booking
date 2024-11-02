public class Venue {

    private  int venueID;
    private String address;
    private  String venuetype;
    private  float venueprice;

    void setVenue(int id,String add,String type,float price)
    {
        venueID=id;
        address=add;
        venuetype=type;
        venueprice=price;
    }
    int getVenueID(){
        return venueID;
    }
    String getVenuetype(){
        return venuetype;
    }
    float getVenueprice(){
        return venueprice;
    }
    String getVenueadd(){
        return address;
    }
}