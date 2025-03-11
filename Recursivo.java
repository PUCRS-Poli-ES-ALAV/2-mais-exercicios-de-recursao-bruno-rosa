public class Recursivo {

    public int fatorial(int n) {
        if (n ==1){
            return 1;
        }else {
            return n*fatorial(n-1);
        }
    }


    public int somatorio(int n) {
        if (n == 0){
            return 0;
        }else{
            return n + somatorio(n-1);
        }
    }

    public int fibonacci(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public int somatorioDuplo(int i, int j){
        if (i == j){
            return i;
        }
        if(i>j){
            return i + somatorioDuplo(i,j+1);
        }else {
            return i + somatorioDuplo(i+1,j);
        }

    }

    
}
