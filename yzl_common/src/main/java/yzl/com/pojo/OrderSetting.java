package yzl.com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 预约设置
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_OrderSetting")
public class OrderSetting implements Serializable {
    private Integer id;
    private Date orderDate;//预约设置日期
    private int number;//可预约人数
    private int reservations;//已预约人数

}
