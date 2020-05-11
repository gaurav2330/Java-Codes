package MyPack ;

class Balance{
    String name;
    double bal;

    Balance(String n, double b){
        name=n;
        bal=b;
    }

    void show(){
        if(bal<0){
            System.out.println("--> ");  
        }
        System.out.println(name+": $"+bal);
    }
}

class AccountBalance{
    public static void main(String[]args)
    {
        Balance current[]=new Balance[3];
        current[0]=new Balance("Gaurav", 24.564);
        current[1]=new Balance("Curry", 33.644556);
        current[2]=new Balance("Lebron", 342.345345);

        for(int i=0;i<3;i++)
        current[i].show();
    }
}