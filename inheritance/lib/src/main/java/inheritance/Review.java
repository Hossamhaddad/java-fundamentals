package inheritance;

public class Review {
   public String body;
   public String author;
   public int starsRate;


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
