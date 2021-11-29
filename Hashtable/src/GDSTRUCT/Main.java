package GDSTRUCT;

public class Main {

    public static void main(String[] args) {

        Player laplus = new Player(1,"La+",97);
        Player lui = new Player(2, "Lui",92);
        Player iroha = new Player(3, "Iroha", 92);
        Player chloe = new Player(4,"Chloe",95);
        Player koyori = new Player(5, "Koyori",91);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put(laplus.getName(), laplus);
        hashtable.put(lui.getName(), lui);
        hashtable.put(iroha.getName(), iroha);
        hashtable.put(chloe.getName(), chloe);
        hashtable.put(koyori.getName(), koyori);

        //hashtable.printHashtable();

        System.out.println(hashtable.get("Lui"));
        System.out.println(hashtable.remove("La+"));
    }
}
