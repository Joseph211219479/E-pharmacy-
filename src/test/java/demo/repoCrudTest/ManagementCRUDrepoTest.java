package demo.repoCrudTest;

import demo.DemoApplication;
import demo.domain.Management;
import demo.repository.ManagementCRUDrepo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.swing.*;
import java.util.UUID;

/**
 * Created by root on 2015/08/03.
 */
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class ManagementCRUDrepoTest extends AbstractTestNGSpringContextTests {
    //private Long id;

   // private Management management=null;
    @Autowired
    private ManagementCRUDrepo managementCRUDrepo ;

    @Test
    public void create(){
        Management management = new Management.Builder(123)
                .name("Man1")
                .id(UUID.randomUUID().toString())
                .password("124fsdv4")
                .username("usr1")
                .surname("dvds")
                .build();
        managementCRUDrepo.save(management);

        Assert.assertNotNull(management.getName());
    }
}
