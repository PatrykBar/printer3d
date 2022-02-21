package pl.patrykbartnicki.printersoft.printer3d;

import lombok.Getter;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@Getter
public class TestcontainersAndDatabaseConfigForTests {

    private String mongoDB_ContainerName = "defaultMongo";

    @Container
    private MongoDBContainer mongoDBContainer =
            new MongoDBContainer().withExposedPorts(27027);

    protected void setNameOfContainers(String Name) {
        this.mongoDB_ContainerName = Name;
    }
}
