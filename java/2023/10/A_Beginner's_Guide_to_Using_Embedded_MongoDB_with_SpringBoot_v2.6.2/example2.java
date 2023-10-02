@Configuration
@EnableMongoRepositories
public class EmbeddedMongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "testdb";
    }

    @Override
    public MongoClient mongoClient() {
        return EmbeddedMongoFactoryBean.builder()
                .version(Version.Main.PRODUCTION)
                .build()
                .getObject();
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }

}
