package basicGA;

public abstract class GA {

    private population population;
    private cost function;
    private int steps;
    private double mutationProbability;

    /** Builder
     *
     * @param populationSize
     *            Population size.
     * @param cromosomeLength
     *            Cromosome data size.
     * @param stp
     *            Iterations.
     * @param mp
     *            Gen's mutation probability.
     * @param f
     *            Cost function.
     */

    public GA(int populationSize, int cromosomeLength, int stp,
                             double mp, cost f) {
        this.population = new population(populationSize, cromosomeLength, f);
        this.steps = stp;
        this.mutationProbability = mp;
        this.function = f;
    }


    public individual execute() {

        for (int i = 0; i < steps; i++) {

            int a1 = cromosome.rv.nextInt(population.size());
            int a2;
            cromosome c1, c2, recombinedCromosome;
            individual newIndividual;

            do { // Must be different individuals
                a2 = cromosome.rv.nextInt(population.size());
            } while (a1 == a2);

            c1 = population.getIndividual(a1).getCromosome();
            c2 = population.getIndividual(a2).getCromosome();

            recombinedCromosome = recombine(c1, c2);

            recombinedCromosome.mutate(mutationProbability);

            newIndividual = new individual(recombinedCromosome, function);
            population.replace(newIndividual);
        }

        return population.bestIndividual();
    }

    protected abstract cromosome recombine(cromosome c1, cromosome c2);
}
