package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // can be any object type except String. Strings get turned into objects.
	
	public static void main(String[] args) {
				
	}
	
	
	@Test
	public void tester() {
		EncapsulateTheData etd = new EncapsulateTheData();	
		
		etd.setItemsReceived(3);
		assertEquals(etd.getItemsReceived(), 3);
		etd.setItemsReceived(-1);
		assertEquals(etd.getItemsReceived(), 0);
		
		etd.setDegreesTurned(90);
		assertEquals(etd.getDegreesTurned(), 90.0f, 1e-6);
		etd.setDegreesTurned(361);
		assertEquals(etd.getDegreesTurned(), 1.0f, 1e-6);
		
		etd.setNomenclature("boi");
		assertEquals(etd.getNomenclature(), "boi");
		etd.setNomenclature("");
		assertEquals(etd.getNomenclature(), " ");
		
		etd.setMemberObj(3);
		assertEquals(etd.getMemberObj(), 3);
		etd.setMemberObj("a");
		assertEquals(etd.getMemberObj(), ("a"));
	}

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0) {
			itemsReceived = 0;
		}
		this.itemsReceived = itemsReceived;
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {
		if (degreesTurned < 0.0) {
			while (degreesTurned < 0.0) {
				degreesTurned += 360;
			}
		}
		if (degreesTurned > 360.0) {
			while (degreesTurned > 360.0) {
				degreesTurned -= 360;
			}
		}
		this.degreesTurned = degreesTurned;
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if (nomenclature.length() == 0) {
			nomenclature = " ";
		}
		this.nomenclature = nomenclature;
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		if (memberObj instanceof String) {
			this.memberObj = (Object) memberObj;
		} else {
			this.memberObj = memberObj;
		}
		
	}
}
