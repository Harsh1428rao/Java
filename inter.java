package Java;


interface jaanvaar{
    public void sherr();
    public void kutta();
}

class animal implements jaanvaar{
    public void sherr(){
        System.out.println("Sherr");
    }
    public void kutta(){
        System.out.println("kutta");
    }
}
public class inter {
    public static void main(String args[]){
        animal obj = new animal();
        obj.sherr();
        obj.kutta();
    }
}
