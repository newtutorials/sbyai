public interface MyRepository extends JpaRepository<MyEntity, Long> {

    @Query(value = "SELECT id, name FROM my_entity", nativeQuery = true)
    List<Object[]> findNativeQueryResult();
}
