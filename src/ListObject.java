
public class ListObject {
	private ListObject nextObj;
	private ListObject prevObj;
	private Object o;
	
	public ListObject(Object o) {
		this.o = o;
	}

	public void setPrevObject(ListObject prevObj) {
		this.prevObj = prevObj;
	}
	
	public void setNextObject(ListObject nextObj) {
		this.nextObj = nextObj;
	}

	public void setObject(Object newObject) {
		this.o = newObject;
	}
	public ListObject getPrevObject() {
		return this.prevObj;
	}
	
	public ListObject getNextObject() {
		return this.nextObj;
	}
	
	public Object getObject() {
		return this.o;
	}
}
