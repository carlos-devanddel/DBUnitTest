package dyd.pocs.dbunittest.daos;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
@EntityScan("dyd.pocs.dbunittest.models")
public class DBTestConfig {
}
