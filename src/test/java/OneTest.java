import org.junit.Ignore;
import org.junit.Test;

public class OneTest {
    
    @Test
    public void testPass() {}

    @Test
    public void testFail() {
        assert false;
    }
    
    @Test
    @Ignore
    public void testIgnore() {
        
    }
}
