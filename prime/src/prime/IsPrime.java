/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author minhd
 */
public class IsPrime {
    public int n;
    public IsPrime(){
        this.n=0;
    }
    public IsPrime(int a){
        this.n=a;
    }
    public int Ktra(int a){
        if (a<2) return 0;
        int m= (int)Math.sqrt(a);
        for (int i=2;i<=m;i++)
            if (a%i==0)
                return 0;
        return 1;
    }
    public static void main(String[] args) {
        IsPrime p=new IsPrime();
        System.out.println(p.Ktra(11));
    }
}
