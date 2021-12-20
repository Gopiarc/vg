package org.phone;

public class InternalStorage {
	private void internalStorage() {
 System.out.println(" the internal storge is 64gb");
	}
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		ExternalStorage e = new ExternalStorage();
		
		i.internalStorage();
		e.externalStorage();
	}

}
