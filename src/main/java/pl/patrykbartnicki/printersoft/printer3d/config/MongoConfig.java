//package pl.patrykbartnicki.printersoft.printer3d.config;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
//
//@Configuration
//@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//public class MongoConfig extends AbstractReactiveMongoConfiguration {
//
//    @Override
//    protected String getDatabaseName() {
//        return "Printer3D";
//    }
//
//    @Override
//    public com.mongodb.reactivestreams.client.MongoClient reactiveMongoClient() {
//        ConnectionString connectionString = new ConnectionString("mongodb://printer_mongo:27017/Printer3D");
//        MongoClientSettings mongoClientSettings = MongoClientSettings.builder().
//                applyConnectionString(connectionString).build();
//
//        return com.mongodb.reactivestreams.client.MongoClients.create(mongoClientSettings);
//    }
//
//}