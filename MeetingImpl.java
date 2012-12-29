import java.util.Calendar;
import java.util.Set;

/**
* A class to represent meetings
*
* Meetings have unique IDs, scheduled date and a list of participating contacts
*/
public class Meeting{

	private int iD;
	private Calendar date;
	private Set<Contact> attendees;

	public Meeting(int iD, Calendar date, Set<Contact> attendees){
		this.iD = iD;
		this.date = date;
	}

	public int getID(){
		return iD;
	}


	public Calendar getDate(){
		return date;
	}

	public Set<Contact> getContacts(){
		return attendees;
	}
}