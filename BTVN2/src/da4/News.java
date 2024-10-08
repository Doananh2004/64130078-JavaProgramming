package da4;

public class News implements INews{
	private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    
    // Mảng RateList gồm 3 phần tử
    private int[] RateList = new int[3];
    
    // Getter và Setter cho các thuộc tính
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    // Ghi đè phương thức Display() từ giao diện INews
    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }

    // Thiết lập mảng RateList
    public void setRateList(int[] rates) {
        if (rates.length == 3) {
            RateList = rates;
        } else {
            System.out.println("Please provide exactly 3 ratings.");
        }
    }

    // Tính toán giá trị AverageRate
    public void Calculate() {
        int sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        this.AverageRate = (float) sum / RateList.length;
    }
}