package RestAPI.SpringRestAPI.service;

import RestAPI.SpringRestAPI.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList=new ArrayList<>();
    {
        productList.add(  new Product(1,"AC",20000.0));
        productList.add(new Product(2,"Mobile",20000.0));
        productList.add( new Product(3,"TV",30000.0));
    }
    public List<Product> getProduct(){
        return productList;
    }

    public Product getProductById( int id)
    {
        Product product=null;
        for(Product p:productList)
        {
            if(p.getProductId()==id)
            {
                product=p;

            }
        }
        return product;
    }


    public Product getProductByName(String name)
    {
        Product product=null;
        for(Product p:productList)
        {
            if(p.getProductName().equals(name))
            {
                product=p;

            }
        }
        return product;
    }
    public void addProduct( Product p)
    {
        productList.add(p);
    }

    public void updateProduct( Product p, int id)
    {
        for(int a=0;a<productList.size();a++){
            //Logic
            Product b1 = productList.get(a);
            if (b1.getProductId() == id) {
                productList.set(a, p);
            }
        }
    }
    public void deleteProduct( int id)
    {
        Iterator<Product> itr = productList.iterator();
        while (itr.hasNext()) {
            if (itr.next().getProductId() == id) {
                itr.remove();
            }
        }
    }
}

