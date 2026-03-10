import java.util.Scanner;
public class Item {
        int itemId;
        String itemName;
        String description;
        double unitPrice;
        int stockqty;
        Item(int itemId,String itemName,String description,double unitPrice,int stockqty){
            this.itemId=itemId;
            this.itemName=itemName;
            this.description=description;
            this.unitPrice=unitPrice;
            this.stockqty=stockqty;
        }
    public void updateStock(int quantity){
           stockqty+=quantity;
           System.out.println("Stock updated succesfully");
    }
    public void getitemDetails(){
        System.out.println("Item ID"+itemId);
        System.out.print("Item Name"+itemName);
        System.out.print("Description"+description);
        System.out.println("unit price"+unitPrice);
        System.out.println("Stock quantity"+stockqty);
    }
    public void Discount(double discountPercent) {
        double discountAmount = unitPrice * discountPercent / 100;
        double finalPrice = unitPrice - discountAmount;
    }
    public static void main(String[] args) {
        Item i1=new Item(1, "Kurti", "VAIDEHI STUDIO kurtis for women-2024 collecion", 177, 7);
        i1.getitemDetails();
        i1.updateStock(2);
        i1.Discount(11);
    }
}
