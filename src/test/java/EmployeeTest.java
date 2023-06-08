import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.Management.Director;
import staff.Management.Manager;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Manager manager;
    Developer developer;
    DatabaseAdmin databaseAdmin;

    Director director;

    @Before
    public void before() {
        manager = new Manager("Alex the Lion", "AZ 6966642 C", 25000.00, "Management");
        developer = new Developer("Melman the Giraffe", "AZ 3463276 C", 20000.00);
        databaseAdmin = new DatabaseAdmin("Gloria the Hippo", "AZ 43546466 C", 18000.00);
        director = new Director("Ewath Bean", "AZ 69420 C", 10000000.00, "Management", 20000000.00);

    }

    @Test
    public void canGiveManagerBiscuit(){
        assertEquals(250.00, manager.payBonus(manager.getSalary()), 0.0);
    }
    @Test
    public void canGiveDeveloperBiscuit(){
        assertEquals(200.00, developer.payBonus(developer.getSalary()), 0.0);
    }
    @Test
    public void canGiveDatabaseAdminBiscuit(){
        assertEquals(180.00, databaseAdmin.payBonus(databaseAdmin.getSalary()), 0.0);
    }

    @Test
    public void canGetGiveOutTheBiscuits(){
        assertEquals(20000000.00, director.getBudget(), 0.0);
    }

}
