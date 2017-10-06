package basicGA;

public class transitionMax implements cost {

    /**
     * Maximize transitions (both 0-1, 1-0) in cromosome data.
     * @see cost#evaluate(cromosome)
     */

    public double evaluate(cromosome cromosome) {
        double fitness = 0;

        for (int i = 0; i < (cromosome.getSize()-1); i++){
            if (cromosome.getGen(i) != cromosome.getGen(i+1)){
                fitness++;
            }
        }

        return fitness;
    }
}
