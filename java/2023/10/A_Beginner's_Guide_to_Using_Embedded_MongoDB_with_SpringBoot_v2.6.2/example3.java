@DataMongoTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = new User("John Doe", "john.doe@example.com");
        userRepository.save(user);

        User savedUser = userRepository.findByEmail("john.doe@example.com");
        assertNotNull(savedUser);
        assertEquals("John Doe", savedUser.getName());
    }

}
