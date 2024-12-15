package Day_007_Date_2024_08_13.TCS_IPA.Question2;

public class Resort {
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getResortId() {
        return resortId;
    }

    public String getResortName() {
        return resortName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public Resort(int resortId, String resortName, String category, double price, double rating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }
}
