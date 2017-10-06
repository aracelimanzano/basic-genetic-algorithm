package basicGA;

public class zeroMax implements cost {

    /**
     * Maximize zeros in cromosome data.
     * @see cost#evaluate(cromosome)
     */

    public double evaluate(cromosome cromosome) {
        double fitness = 0;

        for (int i = 0; i < cromosome.getSize(); i++){
            if (cromosome.getGen(i) == 0){
                fitness++;
            }
        }

        return fitness;
    }
}
