@Repository
public class MyRepositoryImpl {

    @Autowired
    private EntityManager entityManager;

    public List<MyDto> findMappedResult() {
        List<Object[]> result = entityManager.createNativeQuery("SELECT id, name FROM my_entity")
                .unwrap(NativeQuery.class)
                .addScalar("id", LongType.INSTANCE)
                .addScalar("name", StringType.INSTANCE)
                .setResultTransformer(Transformers.aliasToBean(MyDto.class))
                .getResultList();

        return result;
    }
}
