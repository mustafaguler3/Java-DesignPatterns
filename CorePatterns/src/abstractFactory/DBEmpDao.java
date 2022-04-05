package abstractFactory;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving employee to DB");
    }
}
