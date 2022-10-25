package Model;

public class CartItem {
    private Product product ;
    private Integer amount ;

    public CartItem(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public Integer getAmount(){
    return amount;
    }
    public Double getLineItemTotal(){
        return product.getPrice()*amount ;
    }
    public Product getProduct(){
        return product;
    }

}
