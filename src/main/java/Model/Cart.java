package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
   private final static Map<String,CartItem> cartItemMap = new HashMap<>() ;

   public void addItem(CartItem cartItem){
      cartItemMap.put(cartItem.getProduct().getProductCode(),cartItem) ;
   }
   public Double getCartTotal(){
      Double priceAll=0.0 ;
       for(CartItem p:cartItemMap.values()){
          priceAll+=p.getLineItemTotal() ;
       }
       return priceAll ;
   }
   public CartItem getItem (String productCode){
     return cartItemMap.get(productCode) ;
   }
   public List<CartItem> getItems(){
      List<CartItem> listItem = new ArrayList<>();
      for(CartItem a : cartItemMap.values()) {
         listItem.add(a);
      }
      return  listItem ;
   }


}
