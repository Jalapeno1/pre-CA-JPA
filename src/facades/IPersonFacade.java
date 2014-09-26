package facades;

import entity.PersonEntity;
import exceptions.NotFoundException;

/**
 * @author Lars
 */
public interface IPersonFacade {
  public PersonEntity addPerson(String json);  
  public PersonEntity deletePerson(int id) throws NotFoundException;  
  public String getPerson(int id) throws NotFoundException;  
  public String getPersons();  
  public PersonEntity editPerson(String json) throws NotFoundException;  
}
