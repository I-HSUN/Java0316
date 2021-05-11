package test_oder_system;

import com.lab.order_system.ServiceCenter;
import org.junit.Test;

public class TestServiceCenter {
    @Test
    public  void Test_printCatalog(){
        ServiceCenter sc = new ServiceCenter();
        sc.printCatalog();
    }
}
