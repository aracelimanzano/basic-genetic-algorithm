package basicGA;

import java.util.LinkedList;
import java.util.List;

public class population {

    private List<individual> individuals;

    /** Builder
     *
     * @param populationSize
     *            Population size.
     * @param length
     *            Individual data size.
     * @param function
     *            Cost function.
     * @throws RuntimeException
     *            Invalid data.
     */

    public population(int populationSize, int length, cost function) {
        if (populationSize > 0 && length > 0) {
            individuals = new LinkedList<>();
            for (int i = 0; i < populationSize; i++) {
                individuals.add(i, new individual(length, function));
            }
        }
        else{
            throw new RuntimeException ("Invalid data.");
        }
    }

    public int size() {
        return individuals.size();
    }

    public individual bestIndividual() {
        individual best = individuals.get(0);
        for (individual in : individuals){
            if (in.getFitness() > best.getFitness()){
                best = in;
            }
        }
        return best;
    }

    public individual getIndividual(int i) {
        if (i < 0 || i >= individuals.size()){
            throw new RuntimeException ("Invalid index.");
        }
        return (i >= 0 && i < individuals.size()) ? individuals.get(i) : null;
    }

    public void replace(individual in) {
        individual worse = individuals.get(0);
        int worseIndex = 0;

        for (int i=0; i < individuals.size(); i++){
            if (individuals.get(i).getFitness() < worse.getFitness()){
                worse = individuals.get(i);
                worseIndex = i;
            }
        }

        if (worse.getFitness() < in.getFitness()){
            individuals.set(worseIndex, in);
        }

    }
}
