package academy.certif.taskcheck.Test;

import academy.certif.taskcheck.MOCK.MockTaskPovider;
import academy.certif.taskcheck.domain.Task;
import academy.certif.taskcheck.provider.EntityCheckableProvider;
import academy.certif.taskcheck.service.CheckService;
import org.junit.*;
import static org.junit.Assert.assertTrue;

public class TicketTest
{
       private static EntityCheckableProvider entityCheckableProvider ;
       private static CheckService checkservice ;

    @BeforeClass
    public static void init(){
    TicketTest.entityCheckableProvider = new MockTaskPovider();
    TicketTest.checkservice = new CheckService(entityCheckableProvider);
}
  @Test
    public void returning_the_notdone_taks (){
      Task task = new Task(1 , "finishing this test");


  }

    @Test
    public void deleting_done_task (){
     TicketTest.checkservice.check(1);

  }

}
