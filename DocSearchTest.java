import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;
import org.junit.Test;

public class DocSearchTest {
    
    @Test
    public void testHandleURL() throws URISyntaxException, IOException {
        Handler hand = new Handler("/add?query");
        URI url = new URI("http://localhost:4000");
        assertEquals("Don't know how to handle that path!", hand.handleRequest(url));
    }
}
