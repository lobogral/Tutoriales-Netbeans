import entity.Person;
import entity.PersonJpaController;
import entity.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
    
    public static void main (String args[]) {
        
        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("EclipseLinkHolaPU");
        PersonJpaController jpa = new PersonJpaController(objFactory);

        System.out.println("----------------------");
        System.out.println("Agrego valores");
        System.out.println("----------------------");

        //Agrego una persona
        Person record1 = new Person();
        record1.setName("Pedro");
        jpa.create(record1);

        //Agrego otra persona
        Person record2 = new Person();
        record2.setName("Pablo");
        jpa.create(record2);

        List<Person> list;
        list = jpa.findPersonEntities();

        for (Person l : list) {
            System.out.println("Cod.: "+l.getId()+"\nName.: "+l.getName());
        }
        
        System.out.println("----------------------");
        System.out.println("Modifico valores");
        System.out.println("----------------------");

        //Modifico a pedro 
        record1.setName("Pedrito");
        try {
            jpa.edit(record1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        list = jpa.findPersonEntities();

        for (Person l : list) {
            System.out.println("Cod.: "+l.getId()+"\nName.: "+l.getName());
        }

        System.out.println("----------------------");
        System.out.println("Elimino valores");
        System.out.println("----------------------");

        try {
            jpa.destroy((long)2);
        } catch (NonexistentEntityException ex) {
            System.out.println(ex.getMessage());
        }

        list = jpa.findPersonEntities();

        for (Person l : list) {
            System.out.println("Cod.: "+l.getId()+"\nName.: "+l.getName());
        }

    }

}
