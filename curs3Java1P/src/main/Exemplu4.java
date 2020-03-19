package main;

public class Exemplu4 {
    public static void main(String[] args) {
            Consumator c1 = new MyConsumator();
            c1.consuma(52);
            Consumator c2 = new Consumator(){
                @Override
                public void consuma(int x)
                {
                    System.out.println(x);
                }
            };
            c2.consuma(48);
            //-> = operatorul de expresie lambda
           //-> in partea stanga = lista parametrilor
           //-> in partea dreapta = functionalitatea cu care suprascriu(corpul metodei)
            Consumator c3 = x->System.out.println(x);
            c3.consuma(56);
            Consumator c4 = (int x)->System.out.println(x);
            c4.consuma(96);
            Consumator c5 = System.out::println;//referinta la metoda
            c5.consuma(12);

    }
    private static class MyConsumator implements Consumator{
        @Override
        public void consuma(int x)
            {
                System.out.println(x);
            }

    }
}
//(int x,int y)
//(x,y)
//daca am un sg parametru, fara tip de data ->sg situatie in care imi permite sa omit parantezele rotunde