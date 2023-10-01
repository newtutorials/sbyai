import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyTestClass {

    @InjectMocks
    private MyClassToTest myClassToTest;

    @Mock
    private AnotherClass anotherClass;

    // Define your unit tests here

}
