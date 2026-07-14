package OOPS;

public class Video {

    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructor
    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    // Get Video Name
    public String getName() {
        return videoName;
    }

    // Check Out Video
    public void doCheckout() {
        checkout = true;
    }

    // Return Video
    public void doReturn() {
        checkout = false;
    }

    // Receive Rating
    public void receiveRating(int rating) {
        this.rating = rating;
    }

    // Get Rating
    public int getRating() {
        return rating;
    }

    // Get Checkout Status
    public boolean getCheckout() {
        return checkout;
    }
}