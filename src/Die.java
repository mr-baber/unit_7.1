public class Die {
    private int sides;
    private int upside;

    public Die(){
        sides = 6;
        roll();
    }

    public Die(int s){
        sides = s;
        roll();
    }

    public void roll(){
        upside = (int) (Math.random() * sides) + 1;    
    }

    public int getUpside(){
        return upside;
    }

    public String toString(){
        return upside + "";
    }
}
