package RestAPI.SpringRestAPI.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int productId;
    private String productName;
    private double productPrice;
}
