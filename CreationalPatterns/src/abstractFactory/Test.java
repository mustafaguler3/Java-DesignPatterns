package abstractFactory;

public class Test {
    public static void main(String[] args) {

        DaoAbstractFactory daf = DaoFactoryProducer.producer("xml");
        Dao dao = daf.createDao("emp");
        dao.save();

    }
}
