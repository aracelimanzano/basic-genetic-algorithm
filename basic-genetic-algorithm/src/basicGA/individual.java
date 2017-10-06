package basicGA;

public class individual {

    private cromosome cromosome;
    private double fitness;

    /** Builder 1
     * @param length
     *            Cromosome data size.
     * @param function
     *            Cost function.
     */
    public individual(int length, cost function) {
        this.cromosome = new cromosome(length, true);
        this.fitness = function.evaluate(this.cromosome);
    }

    /** Builder 2
     * @param c
     *            Copied cromosome.
     * @param function
     *            Cost function.
     */

    public individual(cromosome c, cost function) {
        this.cromosome = c.copy();
        this.fitness = function.evaluate(this.cromosome);
    }

    public double getFitness() {
        return this.fitness;
    }

    public cromosome getCromosome() {
        return this.cromosome.copy();
    }

    @Override
    public String toString() {
        return "Individual(" + this.cromosome + ", " + this.fitness + ")";
    }

}
