package dao;

public class PersonnelGroupeSerialDAO extends SerialDAO<PersonnelGroupe> {
	
	public String getFilename(String id) {
		return id + ".pg";
	}
	
	public String getFilename(PersonnelGroupe obj) {
		return getFilename(obj.getId());
	}
}
