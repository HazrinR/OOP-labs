package week5;
interface NationalService{
    int getDaysLeft();
    void work();

}
class CivilService implements NationalService{
    private int daysLeft;
    public CivilService(){
        this.daysLeft=362;
    }
    @Override
    public int getDaysLeft(){
        return daysLeft;
    }
    @Override
    public void work(){
        if(daysLeft>0){
            daysLeft--;
        }
    }


}
class MilitaryService implements NationalService{
    private int daysLeft;
    public MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }
    @Override
    public int getDaysLeft(){
        return daysLeft;
    }
    @Override
    public void work(){
        if(daysLeft>0){
            daysLeft--;
    }
    }

}
class Main {
    public static void main(String[] args) {
        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(300); // Example: 300 days of military service

        // Testing CivilService
        System.out.println("Civil Service Days Left: " + civilService.getDaysLeft());
        civilService.work(); // Reduce one day of work
        System.out.println("Civil Service Days Left after one day of work: " + civilService.getDaysLeft());

        // Testing MilitaryService
        System.out.println("Military Service Days Left: " + militaryService.getDaysLeft());
        militaryService.work(); // Reduce one day of work
        System.out.println("Military Service Days Left after one day of work: " + militaryService.getDaysLeft());
    }
}