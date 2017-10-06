package basicGA;

public class pointGA extends GA {

    /** Builder
     *
     * @param populationSize
     *            Population size.
     * @param cromosomeLength
     *            Cromosome data size.
     * @param steps
     *            Iterations.
     * @param mutationProbability
     *            Gen's mutation probability.
     * @param function
     *            Cost function.
     */

    public pointGA (int populationSize, int cromosomeLength, int steps,
                    double mutationProbability, cost function){
        super(populationSize, cromosomeLength, steps, mutationProbability, function);
    }

    @Override
    protected cromosome recombine(cromosome c1, cromosome c2) {
        int random = cromosome.rv.nextInt(c1.getSize());
        cromosome recombinedCromosome = new cromosome(c1.getSize(), false);

        for (int i = 0; i <= random; i++){
            recombinedCromosome.cromosomeData.set(i, c1.cromosomeData.get(i));
        }

        for (int j = random + 1; j < recombinedCromosome.getSize(); j++){
            recombinedCromosome.cromosomeData.set(j, c2.cromosomeData.get(j));
        }

        return recombinedCromosome;
    }
}
