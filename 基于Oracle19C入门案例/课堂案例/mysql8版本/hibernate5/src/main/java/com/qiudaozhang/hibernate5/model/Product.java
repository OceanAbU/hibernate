package  com.qiudaozhang.hibernate5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 深圳邱道长
 * @since 2019/9/12
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {


    private Integer id;

    private String name;

    private Double price;


}
