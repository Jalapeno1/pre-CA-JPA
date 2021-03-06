package facades;

import com.google.gson.Gson;
import entity.PersonEntity;
import exceptions.NotFoundException;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Lars Mortensen
 */
//public class PersonFacade implements IPersonFacade
//{
//
//    Map<Integer, Person> persons = new HashMap();
//    private int nextId;
//    private final Gson gson = new Gson();
//    private static PersonFacade instance = new PersonFacade();
//
//    private PersonFacade()
//    {
//    }
//
//    /*
//     Pass in true to create a new instance. Usefull for testing.
//     */
//    public static PersonFacade getFacade(boolean reseet)
//    {
//        if (true)
//        {
//            instance = new PersonFacade();
//        }
//        return instance;
//    }
//
//    /*
//     Only meant for testing during development
//     */
//    public void createTestData()
//    {
//        addPerson(gson.toJson(new Person("Lars", "Mortensen", "1234")));
//        addPerson(gson.toJson(new Person("John", "Handsen", "2345")));
//        addPerson(gson.toJson(new Person("Peter", "Olsen", "3456")));
//        addPerson(gson.toJson(new Person("John", "McDonald", "4567")));
//        addPerson(gson.toJson(new Person("George", "Peterson", "5678")));
//    }
//
//    @Override
//    public Person addPerson(String json)
//    {
//        Person p = gson.fromJson(json, Person.class);
//        p.setId(nextId);
//        persons.put(nextId, p);
//        nextId++;
//        return p;
//    }
//
//    @Override
//    public Person deletePerson(int id) throws NotFoundException
//    {
//        Person p = persons.remove(id);
//        if (p == null)
//        {
//            throw new NotFoundException("No person exists for the given id");
//        }
//        return p;
//    }
//
//    @Override
//    public String getPerson(int id) throws NotFoundException
//    {
//        Person p = persons.get(id);
//        System.out.println("DANIEL ER GUD");
//        if (p == null)
//        {
//            throw new NotFoundException("No person exists for the given id");
//        }
//        return gson.toJson(p);
//    }
//
//    @Override
//    public String getPersons()
//    {
//        if (persons.isEmpty())
//        {
//            return null;
//        }
//        return gson.toJson(persons.values());
//    }
//
//    @Override
//    public PersonEntity editPerson(String json) throws NotFoundException
//    {
//        PersonEntity p = gson.fromJson(json, PersonEntity.class);
//        PersonEntity oldValue = persons.get(p.getId());
//        if (oldValue == null)
//        {
//            throw new NotFoundException("No person exists for the given id");
//        }
//        persons.put(p.getId(), p);
//        return oldValue;
//    }

//}
