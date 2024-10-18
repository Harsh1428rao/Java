package Java;


class outer{
    int x=10;
    class innner{
        int y=20;
    }
}

public class inner {
    public static void main(String args[]){
        outer obj = new outer();
        outer.innner obj1 = obj.new innner();
        System.out.println(obj1.y);
        System.out.println(obj.x);
    }
}
