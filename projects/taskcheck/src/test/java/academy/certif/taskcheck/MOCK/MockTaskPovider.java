package academy.certif.taskcheck.MOCK;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

import java.util.ArrayList;
import java.util.Collection;


public class MockTaskPovider extends EntityCheckableProvider {


@Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {
    Collection<EntityCheckable> results = new ArrayList<EntityCheckable>();
    return results;
    }
@Override

    public EntityCheckable find(int id) {
        return null;
    }
@Override

    public void setDone(int id, boolean isDone) {
    }
}
