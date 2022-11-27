package academy.certif.taskcheck.domain;

public abstract class EntityCheckable implements Checkable {

	protected int id;
	protected boolean isDone;
	
	public int getId() {
		return id;
	}
	
	public boolean isDone() {
		return isDone;
	}
	
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public abstract Iterable<EntityCheckable> searchDone(boolean isDone);

	public abstract EntityCheckable find(int id);

	public abstract void setDone(int id, boolean isDone);
}
