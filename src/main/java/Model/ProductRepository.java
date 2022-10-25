package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private final static Map<String,Product> repository = new HashMap<>() ;
   static {
        repository.put("1", new Product("1","Shampoo",40.0)) ;
       repository.put("2", new Product("2","Candy",10.0)) ;
       repository.put("3", new Product("3","Cookie",20.0)) ;
       repository.put("4", new Product("4","Soup",15.0)) ;
       repository.put("5", new Product("5","Bed",300.0)) ;
       repository.put("6", new Product("6","Bread",50.0)) ;

    }
    public static Product find(String productCode){
   return repository.get(productCode);
    }

    public static List<Product> findAll(){
       List<Product> list = new ArrayList<>();
        for(Product product:repository.values()){
            list.add(product);
        }
        return list ;
    }
}
