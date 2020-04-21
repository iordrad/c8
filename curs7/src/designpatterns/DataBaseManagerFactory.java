package designpatterns;

/**
 * Factory Pattern -
 * TODO: TEMA SA IMPLEMENTATI FACTORY PATTERN CU INTERFATA SI CLASA DE FACTORY
 */
public abstract class DataBaseManagerFactory {
    public static enum DataType{
        ORACLE, MySQL
    }
    public abstract  void select();
    public abstract void insert();

    public static DataBaseManagerFactory create(DataType type){
        switch(type){
            case ORACLE: return new OracleDataBaseManager();
            case MySQL: return new MySQLDataBaseManager();
            default: throw new IllegalArgumentException();
        }
    }

    public static class OracleDataBaseManager extends DataBaseManagerFactory{
        @Override
        public void select(){
            System.out.println("select in Oracle");
        }
        @Override
        public void insert(){
            System.out.println("insert in Oracle");
        }
    }
    public static class MySQLDataBaseManager extends DataBaseManagerFactory{
        @Override
        public void select(){
            System.out.println("select in MySQL");
        }
        @Override
        public void insert(){
            System.out.println("insert in MySQL");
        }
    }
}
