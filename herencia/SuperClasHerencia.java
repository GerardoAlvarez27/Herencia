package herencia;
/**
 *
 * @author galva
 */
public class SuperClasHerencia {
    
    private int num1;
    private int num2;
    private int resp;

    public SuperClasHerencia(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.resp = resp;
    }

    public int getnum1() {
        return num1;
    }

    public int getnum2() {
        return num2;
    }

    public int getresp() {
        return resp;
    }
    
    public int suma(){
        resp=num1+num2;
        return resp;
    }
}

    


