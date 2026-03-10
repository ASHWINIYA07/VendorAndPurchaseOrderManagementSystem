
import java.util.Date;
public class purchaseOrder {
    
    int orderId;
    Date orderDate;
    String status;
    double totalAmount;
    int vendorId;
    purchaseOrder(int orderId,Date orderDate, String status ,double totalAmount,int vendorId ){
        this.orderId=orderId;
        this.orderDate=orderDate;
        this.status=status;
        this.totalAmount=totalAmount;
        this.vendorId=vendorId;
    }

public void createOrder(){
          
}
public void updateStatus(){

}
public void trackOrder(){

}
}
