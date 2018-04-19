package ir.i95milad.jamejam.android.jamejamv2;

public class Record {
    private int id,conut;
    private String name, dateIn, sender, lastOutDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConut() {
        return conut;
    }

    public void setConut(int conut) {
        this.conut = conut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getLastOutDate() {
        return lastOutDate;
    }

    public void setLastOutDate(String lastOutDate) {
        this.lastOutDate = lastOutDate;
    }
}
