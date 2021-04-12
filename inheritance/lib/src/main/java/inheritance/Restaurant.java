package inheritance;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class Restaurant{
    String name;
    int stars ;
    String priceCategory ;
    int starRate;


ArrayList<Review> reviews=new ArrayList<>();


 public Restaurant(String name,int stars,String priceCategory) {
     try {
         if (stars <= 5 && stars >= 0) {
             this.stars = stars;
             this.name = name;
             this.priceCategory = priceCategory;
         }else { throw new  Exception();};

     }catch (Exception ex){
         System.out.println("Stars should be between 0 - 5 ");
     }

 }
public void addReview(String author,String body,int star){

     Review newRev=new Review(author,body,star);

  if(!reviews.contains(newRev)) {
      reviews.add(newRev);
      this.starRate++;
  }else {
      System.out.println("this review already exists");
  }
}

public void tostring(){
 System.out.println("Restaurant name : "+this.name+"\n"+" Stars : "+this.stars+"\n"+" Price Category :"+this.priceCategory);
}
}