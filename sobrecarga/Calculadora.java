package sobrecarga;

public class Calculadora {
    public long somar(long a, long b){
        return a + b;
    }

    public long somar(String s1, String s2){
        return Long.parseLong(s1) + Long.parseLong(s2); 
    }

    public long somar(long a, long b, long c){
        return a + b + c;
    }

    public long somar(String s1, Long l){
        return Long.parseLong(s1) + l;
    }

    public Long somar(long l, String s){
        return somar(s, l);
    }
}
