package week6;
import java.util.HashMap;

class PromissoryNote{
    private HashMap<String, Double> loans;
    public PromissoryNote(){ //konstruktor
        this.loans=new HashMap<>();
    }
    public void setLoan(String toWhom, double value){
        loans.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose){
        return loans.getOrDefault(whose, 0.0);
    }

}
public class Hash2 {
    public static void main(String[] args) {
        // Example usage of PromissoryNote
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel")); //posto nemamo nista setovano za Joel vratit ce nam 0

}}
