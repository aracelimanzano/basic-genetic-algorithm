package basicGA;

public class oneMax implements cost {

    /**
     * Maximize ones in cromosome data.
     * @see cost#evaluate(cromosome)
     */

    public double evaluate(cromosome cromosome) {
        double fitness = 0;

        for (int i = 0; i < cromosome.getSize(); i++){
            if (cromosome.getGen(i) == 1){
                fitness++;
            }
        }

        return fitness;
    }
}
