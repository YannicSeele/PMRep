
public class DoubleLinkedList {
	private ListObject actualObj = null;
	
	public DoubleLinkedList() {
		super();
	}

	public void addElement(Object o) {
		ListObject newObj = null;
		if(actualObj == null) {
			newObj = new ListObject(o);
		}
		else {
			newObj = new ListObject(o);
			newObj.setPrevObject(actualObj);
			newObj.setNextObject(actualObj.getNextObject());
			actualObj.setNextObject(newObj);
		}
		actualObj = newObj;
	}
	
	public void removeObject() {
		if(actualObj.getPrevObject() != null) {
			actualObj.getPrevObject().setNextObject(actualObj.getNextObject());
			
			goToPrev();
		}
		if(actualObj.getNextObject() != null) {
			actualObj.getNextObject().setPrevObject(actualObj.getPrevObject());
			
			goToNext();
		}
	}
	
	public void modifyObject(Object newObject) {
		actualObj.setObject(newObject);
	}
	
	public Object getObject() {
		return actualObj.getObject();
	}
	
	public void goToFirst() {
		while(actualObj.getPrevObject() != null) {
			actualObj = actualObj.getPrevObject();
		}
	}
	
	public void goToLast() {
		while(actualObj.getNextObject() != null) {
			actualObj = actualObj.getNextObject();
		}
	}
	public void goToNext() throws NullPointerException {
		try {
			if(actualObj.getNextObject() != null) {
				actualObj = actualObj.getNextObject();
			}
		}
		catch(NullPointerException npe) {
			throw new NullPointerException();
		}
	}
	
	public void goToPrev() throws NullPointerException{
		try {
			if(actualObj.getPrevObject() != null) {
				actualObj = actualObj.getPrevObject();
			}
		}
		catch(NullPointerException npe) {
			throw new NullPointerException();
		}
	}
}
