package basicGA;

public class uniformGA extends GA {

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

    public uniformGA(int populationSize, int cromosomeLength, int steps,
                     double mutationProbability, cost function){
        super(populationSize, cromosomeLength, steps, mutationProbability, function);
    }

    @Override
    protected cromosome recombine(cromosome c1, cromosome c2){
        int random = cromosome.rv.nextInt(2);
        cromosome recombinedCromosome = new cromosome(c1.getSize(), false);

        for (int i = 0; i < recombinedCromosome.getSize(); i++){
            if (random == 0){
                recombinedCromosome.cromosomeData.set(i, c1.cromosomeData.get(i));
            }
            else {
                recombinedCromosome.cromosomeData.set(i, c2.cromosomeData.get(i));
            }
        }

        return recombinedCromosome;
    }

}
