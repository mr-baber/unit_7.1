public class Set {

    private Die[] set = new Die[5];

    public Set(){
        for (int i = 0; i < 5; i++){
            Die die = new Die();
            set[i] = die;
        }
    }

    public void printSet(){
        for (int i = 0; i < 5; i++){
            System.out.println(set[i]);
        }
    }

}
