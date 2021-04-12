package inheritance;

import javax.swing.plaf.PanelUI;

public class Restaurant extends Review {
    String name;
    int stars;
    String priceCategory ;




 public Restaurant(String name,int stars,String priceCategory){
 this.name=name;
 this.stars=stars;
 this.priceCategory=priceCategory;
}
public void addReview(){
   this.setAuthor(author);
this.setBody(body);
 this.stars++;
System.out.println(stars);
}
public void tostring(){
 System.out.println("Restaurant name : "+this.name+"\n"+" Star Rate is : "+this.stars+"\n"+" Price Category :"+this.priceCategory);
}
}