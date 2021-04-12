package inheritance;

public class Review {
   String body;
   String author;
   int starsRate;

    public String getBody() {
        return body;
    }

    public int getStarsRate() {
        return starsRate;
    }

    public void setStarsRate(int starsRate) {
        this.starsRate = starsRate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public  Review(){


 }
public Review(String author,String body,int stars){
    this.author=author;
    this.body=body;
    this.starsRate=stars;
}


public void tostring(){
    System.out.println("Author : "+this.author+"\n"+" Review : "+this.body+"\n"+" Stars rate :"+this.starsRate);
}
}
