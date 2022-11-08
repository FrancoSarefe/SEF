package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Implementation of a Radar
 * 
 *
 */
public class RadarImpl implements Radar {

	private final List<RadarContact> contacts;

	/**
	 * Constructs a new Radar
	 */
	public RadarImpl() {
		contacts = new ArrayList<>();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {

		if (contact != null) {
			
			boolean exist = false;
			
			for (RadarContact radarContact : contacts) {
				
				if (contact.getContactID().equals(radarContact.getContactID())) {
					
					radarContact.setBearing(contact.getBearing());
					radarContact.setDistance(contact.getDistance());
					exist = true;
					
					break;
				}
			}
			if (exist == false) {
				contacts.add(contact);
			}

		}
		return contact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {

		for (RadarContact radarContact : contacts) {
			
			if (id.equals(radarContact.getContactID())) {
				
				return radarContact;
			}
		}
		return null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {

		return contacts.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {

		for (RadarContact radarContact : contacts) {
			
			if (id.equals(radarContact.getContactID())) {
				
				contacts.remove(radarContact);
				
				return radarContact;
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		
		List<RadarContact> contactCopy = new ArrayList<>();
		contactCopy.addAll(contacts);
		
		return contactCopy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {

		List<RadarContact> contactCopy = new ArrayList<>();
		contactCopy.addAll(contacts);
		
		Collections.sort(contactCopy, comparator);
		
		return contactCopy;
	}

}
