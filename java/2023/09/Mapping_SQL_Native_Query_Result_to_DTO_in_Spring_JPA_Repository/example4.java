@RunWith(SpringRunner.class)
@SpringBootTest
public class MyRepositoryTest {

    @Autowired
    private MyRepository myRepository;

    @Test
    public void testMapping() {
        List<MyDto> result = myRepository.findMappedResult();

        // assert the values of the DTO
    }
}
