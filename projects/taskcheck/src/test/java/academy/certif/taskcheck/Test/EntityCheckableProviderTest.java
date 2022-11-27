package academy.certif.taskcheck.Test;

import academy.certif.taskcheck.domain.Task;
import academy.certif.taskcheck.provider.EntityCheckableProvider;
import org.junit.Assert;
import org.junit.Test;

public class EntityCheckableProviderTest {

    private static EntityCheckableProvider entityCheckableProvider ;

    @Test
    public void testSearchDone() {
        Task task = new Task(1 , "finishing this test");

    }

    @Test
    public void testFind() {

    }

    @Test
    public void testSetDone() {

    }

}
