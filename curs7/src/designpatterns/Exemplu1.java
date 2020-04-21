package designpatterns;

public class Exemplu1 {
    public static void main(String[] args) {
        DataBaseManagerFactory manager1 = DataBaseManagerFactory.create(DataBaseManagerFactory.DataType.ORACLE);
        manager1.insert();
        manager1.select();
        DataBaseManagerFactory manager2 = DataBaseManagerFactory.create(DataBaseManagerFactory.DataType.MySQL);
        manager2.insert();
        manager2.select();

    }
}
