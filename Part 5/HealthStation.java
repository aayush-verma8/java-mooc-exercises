
public class HealthStation {
    private int weigh;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
       weigh++;
        return person.getWeight();
        
    }
       
        public void feed(Person person){
        int currentWeight=person.getWeight();
        currentWeight++;
        person.setWeight(currentWeight);
        }
        public int weighings(){
        return weigh;
        }
        
}
