package dao;

public class DAOFactory extends AbstractDAOFactory {
	
	public DAO<Personnel> getPersonnelDAO() {
		return new PersonnelSerialDAO();
	}
	
	public DAO<PersonnelGroupe> getPersonnelGroupeDAO() {
		return new PersonnelGroupeSerialDAO();
	}
	
}
