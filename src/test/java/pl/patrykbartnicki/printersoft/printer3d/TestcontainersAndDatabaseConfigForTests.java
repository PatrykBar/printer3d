package pl.patrykbartnicki.printersoft.printer3d;

import lombok.Getter;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@Getter
public class TestcontainersAndDatabaseConfigForTests {

    private String testContainerName = "default";
    private String mongoDB_ContainerName = "defaultMongo";

    @Container
    private GenericContainer testContainer =
            new GenericContainer(DockerImageName.parse("testcontainer/" + testContainerName + ":0.0.1")).withExposedPorts(9090);

    @Container
    private MongoDBContainer mongoDBContainer =
            new MongoDBContainer(DockerImageName.parse("mongocontainer/" + mongoDB_ContainerName + ":0.0.1")).withExposedPorts(27027);

    private String addressForTestContainer = testContainer.getHost();
    private Integer portForTestContainer = testContainer.getFirstMappedPort();

    private String addressForMongoDBContainer = mongoDBContainer.getHost();
    private Integer portForMongoDBContainer = mongoDBContainer.getFirstMappedPort();

    public void setNameOfContainers(String Name) {
        this.testContainerName = Name;
        this.mongoDB_ContainerName = Name;
    }

    public String getTestContainerName() {
        return testContainerName;
    }

    public String getMongoDB_ContainerName() {
        return mongoDB_ContainerName;
    }

    public String getAddressForTestContainer() {
        return addressForTestContainer;
    }

    public Integer getPortForTestContainer() {
        return portForTestContainer;
    }

    public String getAddressForMongoDBContainer() {
        return addressForMongoDBContainer;
    }

    public Integer getPortForMongoDBContainer() {
        return portForMongoDBContainer;
    }

    public void startContainers(){
        mongoDBContainer.start();
        testContainer.start();
    }

    public void stopContainers(){
        testContainer.stop();
        mongoDBContainer.stop();
    }

}
